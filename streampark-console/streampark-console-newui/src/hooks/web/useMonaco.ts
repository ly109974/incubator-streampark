import { watch, Ref, unref, ref } from 'vue';
import { until, createEventHook, tryOnUnmounted } from '@vueuse/core';

import type { editor as Editor } from 'monaco-editor';
import setupMonaco from '/@/monaco';
import { useDark } from '@vueuse/core';
import { isFunction } from '/@/utils/is';
export const isDark = useDark();
export interface MonacoEditorOption {
  code?: any;
  language: string;
  options?: Editor.IStandaloneEditorConstructionOptions;
}

export function useMonaco(
  target: Ref,
  options: MonacoEditorOption,
  beforeMount?: (monoao: any) => void,
) {
  const changeEventHook = createEventHook<string>();
  const isSetup = ref(false);
  let editor: Editor.IStandaloneCodeEditor;
  let monacoInstance: any;

  const setContent = async (content: string) => {
    await until(isSetup).toBeTruthy();
    if (editor) editor.setValue(content);
  };

  const getContent = async () => {
    await until(isSetup).toBeTruthy();
    if (editor) {
      return editor.getValue();
    } else {
      return '';
    }
  };
  const getInstance = async () => {
    await until(isSetup).toBeTruthy();
    if (editor) {
      return editor;
    } else {
      return null;
    }
  };
  const getMonacoInstance = async () => {
    await until(isSetup).toBeTruthy();
    if (monacoInstance) {
      return monacoInstance;
    } else {
      return null;
    }
  };

  const disposeInstance = async () => {
    editor?.dispose();
  };

  const init = async () => {
    const { monaco } = await setupMonaco();
    monacoInstance = monaco;
    if (isFunction(beforeMount)) await beforeMount(monaco);
    watch(
      target,
      () => {
        const el = unref(target);
        if (!el) {
          return;
        }
        const model = monaco.editor.createModel(options.code, options.language);
        const defaultOptions = {
          model,
          language: options.language,
          tabSize: 2,
          insertSpaces: true,
          autoClosingQuotes: 'always',
          detectIndentation: false,
          folding: false,
          automaticLayout: true,
          theme: 'vs',
          minimap: {
            enabled: false,
          },
        };
        editor = monaco.editor.create(el, Object.assign(defaultOptions, options.options || {}));

        isSetup.value = true;
        if (!options.options?.theme) {
          watch(
            isDark,
            () => {
              if (isDark.value) monaco.editor.setTheme('vs-dark');
              else monaco.editor.setTheme('vs');
            },
            { immediate: true },
          );
        }

        editor.getModel()?.onDidChangeContent(() => {
          changeEventHook.trigger(editor.getValue());
        });
      },
      {
        flush: 'post',
        immediate: true,
      },
    );
  };

  init();

  tryOnUnmounted(() => stop());

  return {
    onChange: changeEventHook.on,
    setContent,
    getContent,
    getInstance,
    getMonacoInstance,
    disposeInstance,
  };
}