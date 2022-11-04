/**
 * Copyright 2009-2022 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package poo0054.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 行属性(TableDynamic)实体类
 *
 * @author zhangzhi
 * @since 2022-10-18 14:18:59
 */
@Data
//@EqualsAndHashCode(callSuper = true)
public class TableDynamic implements Serializable {
    private static final long serialVersionUID = 917318128171082841L;
    /**
     * 主键
     */
    private String id;
    /*    */
    /**
     * 表id
     */
    private String tableCode;
    /**
     * 表格名称
     */
    private String name;
    /**
     * 表格值
     */
    private String value;
    /**
     * 表格状态
     */
    private Integer disabled;
    /**
     * 宽度
     */
    private Double width;
    /**
     * 固定列
     */
    private String fixed;
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * input select date time等
     */
    private String type;
    /**
     * 类型的类型
     */
    private String typeType;
    /**
     * 下拉框的请求地址 暂只支持get请求
     */
    private String selectUrl;
    /**
     * 对齐方式
     */
    private String align;
    /**
     * 是否以该行进行排序
     */
    private Integer sortable;
    /**
     * filters 是一个数组 如果为select 会获取select_url的值
     */
    private String filters;
    /**
     * 是否需要进行查询
     */
    private Integer showSearch;
    /**
     * 提示语句
     */
    private String placeholder;
    /**
     * 排序
     */
    private Integer sort;

    public TableDynamic() {
    }

    public TableDynamic(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

