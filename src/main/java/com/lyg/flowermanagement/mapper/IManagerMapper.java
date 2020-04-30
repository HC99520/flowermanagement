package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Employee;
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
        //登录操作
    Manager login(@Param("id") String id, @Param("password") String password);

    /**
     * 通过实体作为筛选条件查询
     *查询所有
     * @param manager 实例对象
     * @return 对象列表
     */
    List<Manager> queryAll(com.lyg.flowermanagement.entity.Manager manager);

    //无条件查询所有
    //查询所有员工
    List<Manager> selectAll();
    /**
     * 新增数据
     *店主添加操作
     * @param manager 实例对象
     * @return 影响行数
     */
    int insert(Manager manager);

    /**
     * 修改数据
     *店主修改操作
     * @param manager 实例对象
     * @return 影响行数
     */

    int update(Manager manager);

    /**
     * 通过主键删除数据
     * 店主删除操作
     * @param managerId 主键
     * @return 影响行数
     */
    int deleteById(String managerId);

    //店主重置密码
    int resetPassword(@Param("managerId") String managerId, @Param("password") String password);
}