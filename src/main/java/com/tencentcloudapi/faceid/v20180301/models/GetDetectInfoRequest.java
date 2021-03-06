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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDetectInfoRequest  extends AbstractModel{

    /**
    * 人脸核身流程的标识，调用DetectAuth接口时生成。
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * 用于细分客户使用场景，由腾讯侧在线下对接时分配。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证正反面；3：视频最佳截图照片；4：视频）。
如 134表示拉取文本类、视频最佳截图照片、视频。
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
     * 获取人脸核身流程的标识，调用DetectAuth接口时生成。
     * @return BizToken 人脸核身流程的标识，调用DetectAuth接口时生成。
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * 设置人脸核身流程的标识，调用DetectAuth接口时生成。
     * @param BizToken 人脸核身流程的标识，调用DetectAuth接口时生成。
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * 获取用于细分客户使用场景，由腾讯侧在线下对接时分配。
     * @return RuleId 用于细分客户使用场景，由腾讯侧在线下对接时分配。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置用于细分客户使用场景，由腾讯侧在线下对接时分配。
     * @param RuleId 用于细分客户使用场景，由腾讯侧在线下对接时分配。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证正反面；3：视频最佳截图照片；4：视频）。
如 134表示拉取文本类、视频最佳截图照片、视频。
     * @return InfoType 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证正反面；3：视频最佳截图照片；4：视频）。
如 134表示拉取文本类、视频最佳截图照片、视频。
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * 设置指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证正反面；3：视频最佳截图照片；4：视频）。
如 134表示拉取文本类、视频最佳截图照片、视频。
     * @param InfoType 指定拉取的结果信息，取值（0：全部；1：文本类；2：身份证正反面；3：视频最佳截图照片；4：视频）。
如 134表示拉取文本类、视频最佳截图照片、视频。
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);

    }
}

