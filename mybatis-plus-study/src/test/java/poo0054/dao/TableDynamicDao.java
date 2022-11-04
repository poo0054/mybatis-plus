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
package poo0054.dao;

import org.apache.ibatis.annotations.Param;
import poo0054.entity.TableDynamic;

import java.util.List;

/**
 * 行属性(TableDynamic)表数据库访问层
 *
 * @author zhangzhi
 * @since 2022-10-18 14:18:57
 */
public interface TableDynamicDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TableDynamic queryById(String id);

    /**
     * 通过tableCode查询单条数据
     *
     * @param tableCode
     * @return 实例对象
     */
    TableDynamic queryByTableCode(String tableCode, String dyId);

    /**
     * 查询指定行数据
     *
     * @param tableDynamic 查询条件
     * @param pageable     分页对象
     * @return 对象列表
     */
    List<TableDynamic> queryAllByLimit(TableDynamic tableDynamic);

    /**
     * 统计总行数
     *
     * @param tableDynamic 查询条件
     * @return 总行数
     */
    long count(TableDynamic tableDynamic);

    /**
     * 新增数据
     *
     * @param tableDynamic 实例对象
     * @return 影响行数
     */
    int insert(TableDynamic tableDynamic);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TableDynamic> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TableDynamic> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TableDynamic> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TableDynamic> entities);

    /**
     * 修改数据
     *
     * @param tableDynamic 实例对象
     * @return 影响行数
     */
    int update(TableDynamic tableDynamic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

