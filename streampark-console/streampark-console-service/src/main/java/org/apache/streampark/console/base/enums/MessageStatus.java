/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.console.base.enums;

public enum MessageStatus implements Status {

    SYSTEM_USER_LOGIN_TYPE_CONSTRAINTS(10000, "user {0} can only sign in with [{1}]", "用户{0}只能使用 [{1}] 登录"),
    SYSTEM_USER_LOGIN_TYPE_NOT_SUPPORT(10010, "The login type [{0}] is not supported", "不支持登录类型[{0}]"),
    SYSTEM_USER_ALLOW_LOGIN_TYPE(10020, "user {0} can not login with {1}", "用户{0}无法使用{1}登录"),
    SYSTEM_USER_NOT_LOGIN(10030, "Permission denied, please login first.", "权限被拒绝，请先登录"),
    SYSTEM_USER_NOT_BELONG_TEAM_LOGIN(10040,
        "The current user does not belong to any team, please contact the administrator!", "当前用户不属于任何团队，请联系管理员！"),
    SYSTEM_USER_NOT_EXIST(10050, "User {0} does not exist", "用户{0}不存在"),
    SYSTEM_USER_ID_NOT_EXIST(10060, "User ID {0} does not exist", "用户ID {0}不存在"),
    SYSTEM_USER_CURRENT_LOGIN_NULL_SET_TEAM_FAILED(10070, "Current login user is null, set team failed.",
        "当前登录用户为空，设置团队失败"),

    SYSTEM_USER_UPDATE_PASSWORD_FAILED(10080, "Can only update password for user who sign in with PASSWORD",
        "只能为使用密码登录的用户更新密码"),
    SYSTEM_USER_OLD_PASSWORD_INCORRECT_UPDATE_PASSWORD_FAILED(10090, "Old password error. Update password failed.",
        "旧密码错误，更新密码失败。"),
    SYSTEM_USER_LOGIN_PASSWORD_INCORRECT(10100, "Incorrect password", "密码不正确"),

    SYSTEM_VARIABLE_ID_NULL_FAILED(10110, "The variable id cannot be null.", "变量Id不能为空"),
    SYSTEM_VARIABLE_NOT_EXIST(10120, "The variable does not exist.", "变量不存在"),
    SYSTEM_VARIABLE_EXIST_USE(10130, "The variable is actually used.", "该变量实际上是在用的"),
    SYSTEM_VARIABLE_ALREADY_EXIST(10140, "The variable code already exists", "变量代码已存在"),
    SYSTEM_VARIABLE_CODE_MODIFY_FAILED(10150, "The variable code cannot be updated.", "变量代码无法更新"),

    SYSTEM_PERMISSION_LOGIN_USER_PERMISSION_MISMATCH(10160,
        "Permission denied, operations can only be performed with the permissions of the currently logged-in user.",
        "权限被拒绝，只能使用当前登录用户的权限进行操作"),
    SYSTEM_PERMISSION_TEAM_NO_PERMISSION(10170,
        "Permission denied, only members of this team can access this permission.", "权限被拒绝，只有此团队的成员才能访问此权限"),
    SYSTEM_PERMISSION_JOB_OWNER_MISMATCH(10180,
        "Permission denied, this job not created by the current user, And the job cannot be found in the current user's team.",
        "权限被拒绝，此作业不是由当前用户创建的，并且在当前用户的团队中找不到该作业"),

    SYSTEM_TEAM_ALREADY_EXIST(10190, "The team {0} already exist.", "团队{0}已经存在。"),
    SYSTEM_TEAM_NOT_EXIST(10200, "The team {0} doesn't exist.", "团队{0} 不存在。"),
    SYSTEM_TEAM_ID_CANNOT_NULL(10210, "The team id is cannot null.", "团队ID不能为空"),
    SYSTEM_TEAM_ID_NOT_EXIST(10220, "The team id {0} doesn't exist.", "团队ID {0}不存在"),
    SYSTEM_TEAM_NAME_CAN_NOT_CHANGE(10230, "Team name can't be changed. Update team failed.", "团队名称不能更改"),
    SYSTEM_LDAP_NOT_ENABLE(10240, "ldap is not enabled, Please check the configuration: ldap.enable",
        "LDAP未启用，请检查配置：ldap.enable"),

    SYSTEM_TEAM_ID_NULL_ERROR(10250, "Team id mustn't be null.", "团队ID不能为空"),

    SYSTEM_TEAM_EXIST_MODULE_USE_DELETE_ERROR(10260, "Please delete the {1} under the team[{0}] first!",
        "请先删除团队[{0}]下的{1}！"),

    SYSTEM_ROLE_NOT_EXIST(10270, "Role {0} not found.",
        "角色{0}不存在"),
    SYSTEM_ROLE_ID_NOT_EXIST(10280, "Role ID {0} not found.",
        "角色ID{0}不存在"),
    SYSTEM_ROLE_EXIST_USED_DELETE_ERROR(10290,
        "There are some users of role {0}, delete role failed, please unbind it first.",
        "有一些用户的角色{0}，删除角色失败，请先解绑"),

    RESOURCE_ALREADY_ERROR(10300, "the resource {0} already exists, please check.", "资源{0}已经存在，请检查"),
    RESOURCE_NAME_NULL_FAILED(10310, "The resource name cannot be null", "资源名不能为空"),
    RESOURCE_NOT_EXIST_ERROR(10320, "the resource {0} doesn't exists, please check.", "资源{0}不存在，请检查"),
    RESOURCE_STILL_USE_DELETE_ERROR(10330, "The resource is still in use, cannot be removed.", "资源仍在使用中，无法删除。"),
    RESOURCE_POM_JAR_EMPTY(10340, "Please add pom or jar resource.", "请添加pom或jar资源。"),
    RESOURCE_FLINK_APP_JAR_EMPTY_ERROR(10350, "Please upload jar for Flink App resource", "请上传 jar 以获取Flink App资源"),
    RESOURCE_MULTI_FILE_ERROR(10360, "Please do not add multi dependency at one time.", "请不要一次添加多个依赖项"),
    RESOURCE_NAME_MODIFY_ERROR(10370, "Please make sure the resource name is not changed.", "请确保未更改资源名称"),
    RESOURCE_FLINK_JAR_NULL(10380, "flink app jar must exist.", "Flink App Jar 必须存在"),

    MEMBER_USER_TEAM_ALREADY_ERROR(10390, "The user [{0}] has been added the team [{1}], please don't add it again.",
        "用户 [{0}] 已添加到团队 [{1}]，请不要再次添加"),
    MEMBER_ID_NOT_EXIST(10400, "The member id {0} doesn't exist.",
        "成员ID {0}不存在"),
    MEMBER_TEAM_ID_CHANGE_ERROR(10410, "Team id cannot be changed.",
        "团队ID无法更改。"),
    MEMBER_USER_ID_CHANGE_ERROR(10420, "User id cannot be changed.",
        "用户 ID 无法更改。"),

    FLINK_ENV_SQL_CLIENT_JAR_NOT_EXIST(10430, "[StreamPark] can't found streampark-flink-sqlclient jar in {0}",
        "[StreamPark] 在{0}中找不到 streampark-flink-sqlclient jar"),
    FLINK_ENV_SQL_CLIENT_JAR_MULTIPLE_EXIST(10440, "[StreamPark] found multiple streampark-flink-sqlclient jar in {0}",
        "[StreamPark] 在 {0} 中发现多个 streampark-flink-sqlclient jar"),
    FLINK_ENV_FILE_OR_DIR_NOT_EXIST(10450, "[StreamPark] file or directory [{0}] no exists. please check.",
        "[StreamPark] 文件或目录 [{0}] 不存在，请检查"),
    FLINK_ENV_FLINK_VERSION_NOT_FOUND(10460, "[StreamPark] can no found flink {0} version",
        "[StreamPark] 无法找到Flink {0} 版本"),
    FLINK_ENV_FLINK_VERSION_UNSUPPORT(10470, "[StreamPark] Unsupported flink version: {0}",
        "[StreamPark] 不支持的Flink版本：{0}"),
    FLINK_ENV_HOME_NOT_EXIST(10480, "The flink home does not exist, please check.", "Flink Home 不存在，请检查"),
    FLINK_ENV_HOME_EXIST_CLUSTER_USE(10490, "The flink home is still in use by some flink cluster, please check.",
        "Flink Home 还在被一些Flink集群使用 请检查"),
    FLINK_ENV_HOME_EXIST_APP_USE(10500, "The flink home is still in use by some application, please check.",
        "Flink Home 仍在被某些应用程序使用 请检查"),

    FLINK_ENV_HOME_IS_DEFAULT_SET(10510, "The flink home is set as default, please change it first.",
        "Flink Home 设置为默认设置，请先更改"),

    FLINK_ENV_CONNECTOR_NULL_ERROR(10520, "The flink connector is null.",
        "Flink连接器为空"),

    FLINK_ENV_DIRECTORY_NOT_CONFIG_FILE(10530, "cannot find {0} in flink/conf ",
        "在 flink/conf 中找不到{0}"),

    FLINK_CLUSTER_UNAVAILABLE(10540, "[StreamPark] The target cluster is unavailable, please check!, please check it",
        "[StreamPark] 目标集群不可用，请检查！"),
    FLINK_CLUSTER_NOT_EXIST(10550, "[StreamPark] The flink cluster don't exist, please check it",
        "[StreamPark] Flink 集群不存在，请检查"),
    FLINK_CLUSTER_NOT_RUNNING(10560, "[StreamPark] The flink cluster not running, please start it",
        "[StreamPark] Flink集群未运行，请启动它"),
    FLINK_CLUSTER_NOT_ACTIVE(10570, "[StreamPark] Current cluster is not active, please check!",
        "[StreamPark] 当前集群未处于活动状态，请检查"),
    FLINK_CLUSTER_DEPLOY_FAILED(10580,
        "[StreamPark] Deploy cluster failed, unknown reason，please check you params or StreamPark error log.",
        "[StreamPark] 部署集群失败，原因不明，请检查您的参数或StreamPark错误日志"),
    FLINK_CLUSTER_ID_CANNOT_FIND_ERROR(10590,
        "The [clusterId={0}] cannot be find, maybe the clusterId is wrong or the cluster has been deleted. Please contact the Admin.",
        "找不到[集群ID={0}]，可能是集群Id错误或集群已被删除。请联系管理员。"),
    FLINK_CLUSTER_ID_EMPTY_ERROR(10600, "[StreamPark] The clusterId can not be empty!", "[StreamPark] 集群Id不能为空!"),
    FLINK_CLUSTER_CLOSE_FAILED(10610, "[StreamPark] Shutdown cluster failed: {0}", "[StreamPark] 关闭群集失败: {0}"),
    FLINK_CLUSTER_DELETE_RUNNING_CLUSTER_FAILED(10620,
        "[StreamPark] Flink cluster is running, cannot be delete, please check.", "[StreamPark] Flink集群正在运行，无法删除 请检查。"),
    FLINK_CLUSTER_EXIST_APP_DELETE_FAILED(10630,
        "[StreamPark] Some app exist on this cluster, the cluster cannot be delete, please check.",
        "[StreamPark] 此集群上存在某些应用程序，无法删除该集群 请检查"),
    FLINK_CLUSTER_EXIST_RUN_TASK_CLOSE_FAILED(10640,
        "[StreamPark] Some app is running on this cluster, the cluster cannot be shutdown",
        "[StreamPark] 某些应用程序正在此集群上运行，无法关闭集群"),

    FLINK_CLUSTER_SHUTDOWN_RESPONSE_FAILED(10650,
        "Get shutdown response failed",
        "获取关机响应失败"),

    FLINK_GATEWAY_NAME_EXIST(10660, "gateway name already exists", "网关名称已存在"),
    FLINK_GATEWAY_GET_VERSION_FAILED(10670, "get gateway version failed", "获取网关版本失败"),

    FLINk_APP_IS_NULL(10671, "Invalid operation, application is null.", "操作无效，应用程序为空"),
    FLINk_SQL_APPID_OR_TEAM_ID_IS_NULL(10680, "Permission denied, appId and teamId cannot be null.",
        "权限被拒绝，应用Id和团队Id不能为空"),
    FLINK_SQL_IS_NULL_UPDATE_FAILED(10690, "Flink sql is null, update flink sql job failed.",
        "FlinkSql为空，更新FlinkSQL作业失败"),
    FLINK_SQL_BACKUP_IS_NULL_ROLLBACK_FAILED(10700, "Application backup can't be null. Rollback flink sql failed.",
        "应用程序备份不能为为空，回滚FlinkSql失败"),

    SPARK_ENV_HOME_NULL_ERROR(10710, "The spark home does not exist, please check.",
        "Spark Home不存在，请查验。"),
    SPARK_ENV_HOME_IS_DEFAULT_SET(10720, "The spark home is set as default, please change it first.",
        "Spark Home 设置为默认设置，请先更改"),
    SPARK_ENV_VERSION_NOT_FOUND(10730, "[StreamPark] can no found spark {0} version",
        "[StreamPark] 无法找到Spark {0} 版本"),

    YARN_QUEUE_NOT_EXIST(10740, "The yarn queue doesn't exist.", "Yarn队列不存在"),
    YARN_QUEUE_NULL(10750, "Yarn queue mustn't be empty.", "Yarn队列不能为空"),
    YARN_QUEUE_ID_NULL(10760, "Yarn queue id mustn't be empty.", "Yarn队列ID不能为空"),
    YARN_QUEUE_LABEL_EXIST(10770, "The queue label existed already. Try on a new queue label, please.",
        "队列标签已存在，请尝试使用新的队列标签。"),
    YARN_QUEUE_LABEL_NULL(10780, "Yarn queue label mustn't be empty.", "Yarn队列标签不能为空"),
    YARN_QUEUE_LABEL_AVAILABLE(10790, "The queue label is availableThe queue label is available.", "队列标签可用队列标签可用"),
    YARN_QUEUE_LABEL_FORMAT(10800,
        "Yarn queue label format should be in format '{'queue'}' or '{'queue'}'@'{'label1，label2'}'",
        "Yarn队列标签格式应为格式 '{'queue'}' 或 '{'queue'}'@'{'label1，label2'}'"),
    YARN_QUEUE_QUERY_PARAMS_NULL(10810, "Yarn queue query params mustn't be null.", "Yarn队列查询参数不能为空"),
    YARN_QUEUE_QUERY_PARAMS_TEAM_ID_NULL(10820, "Team id of yarn queue query params mustn't be null.",
        "Yarn队列查询参数的团队ID不能为空"),
    YARN_QUEUE_USED_FORMAT(10830, "Please remove the yarn queue for {0} referenced it before {1}.",
        "请在{1}之前删除{0}引用的Yarn队列"),

    HANDLER_UPLOAD_FILE_IS_NULL_ERROR(10840, "File to upload can't be null. Upload file failed.", "要上传的文件不能为空，上传文件失败"),
    HANDLER_UPLOAD_FILE_TYPE_ILLEGAL_ERROR(10850,
        "Illegal file type, Only support standard jar or python files. Upload file failed.",
        "文件类型非法，仅支持标准jar或python文件 上传文件失败。"),

    APP_CREATE_FAILED(10860, "create application failed.", "创建应用程序失败"),
    APP_ID_NOT_EXISTS_ERROR(10870, "The application id={0} can't be found.", "找不到应用程序 id={0}"),
    APP_ID_NOT_EXISTS_REVOKE_FAILED(10880, "The application id={0} can't be found, revoke failed.",
        "找不到应用程序 id={0}, 撤销失败"),
    APP_EXECUTE_MODE_NOT_EXISTS_ERROR(10890, "ExecutionMode can't be null.", "执行模式不能为空"),
    APP_EXECUTE_MODE_OPERATION_DISABLE_ERROR(10900, "The FlinkExecutionMode [{0}] can't [{1}]!",
        "Flink执行模式[{0}]无法{1}！"),
    APP_NOT_EXISTS_ERROR(10920, "[StreamPark] {0} The application cannot be started repeatedly.",
        "[StreamPark] {0} 应用程序无法重复启动。"),
    APP_ACTION_REPEAT_START_ERROR(10930, "[StreamPark] {0} The application cannot be started repeatedly.",
        "[StreamPark] {0} 应用程序无法重复启动。"),
    APP_ACTION_SAME_TASK_IN_ALREADY_RUN_ERROR(10940,
        "[StreamPark] The same task name is already running in the yarn queue",
        "[StreamPark] 相同的任务名称已在Yarn队列中运行"),
    APP_ACTION_YARN_CLUSTER_STATE_CHECK(10950, "[StreamPark] The yarn cluster service state is {0}, please check it",
        "[StreamPark] Yarn 集群服务状态为 {0}，请检查一下"),
    APP_CONFIG_FILE_TYPE_ILLEGALLY(10960, "application' config error. must be (.properties|.yaml|.yml |.conf)",
        "应用程序配置错误，必须是（.properties.yaml|.YML|.conf）"),

    APP_JOB_IS_INVALID(10970, "The job is invalid, or the job cannot be built while it is running",
        "作业无效，或者在作业运行时无法生成作业"),
    APP_JOB_EXECUTION_MODE_ILLEGALLY(10980, "Job executionMode must be kubernetes-session|kubernetes-application.",
        "Job 执行模式必须是 Kubernetes-session 或 Kubernetes-application"),
    APP_PY_FLINK_FILE_IS_NULL(10990, "pyflink file can't be null, start application failed.",
        "PyFlink 文件不能为空，启动应用程序失败"),
    APP_PY_FLINK_FILE_TYPE_ILLEGALLY(101000,
        "pyflink format error, must be a \".py\" suffix, start application failed.",
        "PyFlink格式错误，必须是 \".py\" 后缀，启动应用程序失败"),

    APP_QUEUE_LABEL_IN_TEAM_ILLEGALLY(101010,
        "Queue label [{0}] isn't available for teamId [{1}], please add it into the team first.",
        "队列标签 [{0}] 不适用于 teamId [{1}]，请先将其添加到团队中。"),

    APP_QUEUE_LABEL_IN_DATABASE_ILLEGALLY(101020,
        "Queue label [{0}] isn't available in database, please add it first.",
        "队列标签[{0}]在数据库中不可用，请先添加它"),

    APP_NAME_REPEAT_COPY_FAILED(101030,
        "Application names can't be repeated, copy application failed.",
        "应用程序名称不能重复，复制应用程序失败。"),

    APP_FLINK_CLUSTER_NOT_RUNNING_UPDATE_FAILED(101040,
        "update failed, because bind flink cluster not running",
        "更新失败，因为绑定Flink集群未运行"),

    APP_BUILD_RESOURCE_GROUP_FAILED(101050, "Parse resource group failed", "分析资源组失败"),

    EXTERNAL_LINK_PARAM_EXISTING_ERROR(101060, "{0}:{1} is already existing.", "{0}:{1}已经能存在"),

    PROJECT_MODULE_NULL_ERROR(101070, "Project module can't be null, please check.", "项目模块不能为空，请检查"),
    PROJECT_NAME_EXIST(101080, "project name already exists", "项目名称已存在"),
    PROJECT_GIT_PASSWORD_DECRYPT_FAILED(101090, "Project Github/Gitlab password decrypt failed",
        "项目 Github/Gitlab 密码解密失败"),
    PROJECT_TEAM_ID_MODIFY_ERROR(101100, "TeamId can't be changed", "无法更改TeamId"),
    PROJECT_BUILDING_STATE(101110, "The project is being built", "该项目正在建设中"),
    PROJECT_RUNNING_BUILDING_EXCEED_LIMIT(101120,
        "The number of running Build projects exceeds the maximum number: {0}",
        "正在运行的Build项目数超过最大数量: {0}"),

    SSO_SINGLE_SIGN_NOT_AVAILABLE(101130,
        "Single Sign On (SSO) is not available, please contact the administrator to enable", "单点登录（SSO）不可用，请联系管理员以启用"),
    SSO_CONFIG_PRINCIPAL_NAME_ERROR(101140, "Please configure the correct Principal Name Attribute", "请配置正确的主体名称属性"),

    API_NOT_SUPPORT(101150, "current api unsupported: {0}", "当前API不受支持: {0}"),
    ;
    private final int code;
    private final String enMsg;
    private final String zhMsg;

    MessageStatus(int code, String enMsg, String zhMsg) {
        this.code = code;
        this.enMsg = enMsg;
        this.zhMsg = zhMsg;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getEnMsg() {
        return this.enMsg;
    }

    @Override
    public String getZhMsg() {
        return this.zhMsg;
    }
}
