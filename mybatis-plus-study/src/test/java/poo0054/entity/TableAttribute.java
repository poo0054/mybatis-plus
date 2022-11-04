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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 表属性(TableAttribute)实体类
 *
 * @author zhangzhi
 * @since 2022-10-17 16:45:33
 */
@Getter
@Setter
@ToString
public class TableAttribute implements Serializable {
    private static final long serialVersionUID = -43176302154601050L;
    /**
     * 主键
     */
    private String id1;
    /**
     * 表类型
     */
    private String tableCode;
    /**
     * 名字
     */
    private String name;
    /**
     * 查询地址
     */
    private String url;
    /**
     * 请求类型
     */
    private String urlType;
    /**
     * 是否携带斑马纹
     */
    private Integer stripe;
    /**
     * 是否携带边框
     */
    private Integer border;
    /**
     * 高度
     */
    private String height;
    /**
     * 行属性
     */
    private TableDynamic tableCodes;

    public TableAttribute() {
    }

    public TableAttribute(String id1, String name, Integer border) {
        this.id1 = id1;
        this.name = name;
        this.border = border;
    }
}

