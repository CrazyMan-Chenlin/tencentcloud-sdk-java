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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentsRequest  extends AbstractModel{

    /**
    * 云镜客户端唯一Uuid。Uuid和ComponentId必填其一，使用Uuid表示，查询该主机列表信息。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 组件ID。Uuid和ComponentId必填其一，使用ComponentId表示，查询该组件列表信息。
    */
    @SerializedName("ComponentId")
    @Expose
    private Integer ComponentId;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 过滤条件。
<li>ComponentVersion - String - 是否必填：否 - 组件版本号</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * 获取云镜客户端唯一Uuid。Uuid和ComponentId必填其一，使用Uuid表示，查询该主机列表信息。
     * @return Uuid 云镜客户端唯一Uuid。Uuid和ComponentId必填其一，使用Uuid表示，查询该主机列表信息。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一Uuid。Uuid和ComponentId必填其一，使用Uuid表示，查询该主机列表信息。
     * @param Uuid 云镜客户端唯一Uuid。Uuid和ComponentId必填其一，使用Uuid表示，查询该主机列表信息。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取组件ID。Uuid和ComponentId必填其一，使用ComponentId表示，查询该组件列表信息。
     * @return ComponentId 组件ID。Uuid和ComponentId必填其一，使用ComponentId表示，查询该组件列表信息。
     */
    public Integer getComponentId() {
        return this.ComponentId;
    }

    /**
     * 设置组件ID。Uuid和ComponentId必填其一，使用ComponentId表示，查询该组件列表信息。
     * @param ComponentId 组件ID。Uuid和ComponentId必填其一，使用ComponentId表示，查询该组件列表信息。
     */
    public void setComponentId(Integer ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * 获取返回数量，默认为10，最大值为100。
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量，默认为0。
     * @return Offset 偏移量，默认为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取过滤条件。
<li>ComponentVersion - String - 是否必填：否 - 组件版本号</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
     * @return Filters 过滤条件。
<li>ComponentVersion - String - 是否必填：否 - 组件版本号</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
<li>ComponentVersion - String - 是否必填：否 - 组件版本号</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
     * @param Filters 过滤条件。
<li>ComponentVersion - String - 是否必填：否 - 组件版本号</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

