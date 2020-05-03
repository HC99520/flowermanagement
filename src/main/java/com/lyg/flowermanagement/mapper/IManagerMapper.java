package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Manager)表服务接口
 *
 * @author makejava
 * @since 2020-05-03 20:11:03
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

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Manager> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Integer insert(Manager manager);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Integer update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param managerId 主键
     * @return 是否成功
     */
    Integer deleteById(String managerId);

    //查询所有店主
    List<Manager> selectAll();

    //登录操作
    Manager Login(@Param("managerId") String managerId, @Param("password") String password);

    //重置密码
    int resetPassword(@Param("managerId") String managerId, @Param("password") String password);
}