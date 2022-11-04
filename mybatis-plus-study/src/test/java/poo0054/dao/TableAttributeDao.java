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
import org.apache.ibatis.annotations.Select;
import poo0054.entity.TableAttribute;

import java.util.List;

/**
 * 表属性(TableAttribute)表数据库访问层
 *
 * @author zhangzhi
 * @since 2022-10-17 16:45:30
 */
public interface TableAttributeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    TableAttribute queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param tableAttribute 查询条件
     * @param pageable       分页对象
     * @return 对象列表
     */
    @Select("<script> select * from ${wherePropertiesReplace}" +
        "<where> " +
        "<if test='null != id1'> id = #{id1,jdbcType=VARCHAR,javaType=string} </if> " +
        " <if test = 'null != tableCode' > and table_code=#{tableCode} </if> " +
        "</where> </script>")
    List<TableAttribute> queryAllByLimit(TableAttribute tableAttribute);

    /**
     * 统计总行数
     *
     * @param tableAttribute 查询条件
     * @return 总行数
     */
    long count(TableAttribute tableAttribute);

    /**
     * 新增数据
     *
     * @param tableAttribute 实例对象
     * @return 影响行数
     */
    int insert(TableAttribute tableAttribute);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TableAttribute> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TableAttribute> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TableAttribute> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TableAttribute> entities);

    /**
     * 修改数据
     *
     * @param tableAttribute 实例对象
     * @return 影响行数
     */
    int update(TableAttribute tableAttribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

