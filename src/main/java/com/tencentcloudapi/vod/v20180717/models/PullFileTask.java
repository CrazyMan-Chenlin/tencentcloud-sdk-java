/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullFileTask  extends AbstractModel{

    /**
    * 转拉上传任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 转拉上传完成后生成的视频 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 转拉上传完成后生成的播放地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 若转拉上传时指定了视频处理流程，则该参数为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
     * 获取转拉上传任务 ID。
     * @return TaskId 转拉上传任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置转拉上传任务 ID。
     * @param TaskId 转拉上传任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取转拉上传完成后生成的视频 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 转拉上传完成后生成的视频 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置转拉上传完成后生成的视频 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 转拉上传完成后生成的视频 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取转拉上传完成后生成的播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileUrl 转拉上传完成后生成的播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置转拉上传完成后生成的播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUrl 转拉上传完成后生成的播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 获取若转拉上传时指定了视频处理流程，则该参数为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProcedureTaskId 若转拉上传时指定了视频处理流程，则该参数为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * 设置若转拉上传时指定了视频处理流程，则该参数为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureTaskId 若转拉上传时指定了视频处理流程，则该参数为流程任务 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);

    }
}

