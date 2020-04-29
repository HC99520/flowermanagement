package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (IManagerMapper)表数据库访问层
 *
 * @author annian7
 * @since 2020-04-28 23:06:25
 */
@Mapper
public interface IManagerMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param managerId 主键
     * @return 实例对象
     */
    Manager queryById(String managerId);

    Manager login(@Param("id") String id, @Param("password") String password);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param manager 实例对象
     * @return 对象列表
     */
    List<Manager> queryAll(com.lyg.flowermanagement.entity.Manager manager);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 影响行数
     */
    int insert(Manager manager);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 影响行数
     */
    int update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param managerId 主键
     * @return 影响行数
     */
    int deleteById(String managerId);

}