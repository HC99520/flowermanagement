package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Order;
import com.lyg.flowermanagement.entity.Repertory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-01 09:57:07
 */
@Mapper
public interface OrderMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param ordId 主键
     * @return 实例对象
     */
    Order queryById(Integer ordId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Order> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param order 实例对象
     * @return 对象列表
     */
    List<Order> queryAll(Order order);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param ordId 主键
     * @return 影响行数
     */
    int deleteById(Integer ordId);
    //无条件查询所有
    List<Order> selectAll();
    //根据店铺id查询订单信息
    List<Order> selectById(@Param("shopId") Integer shopId);
}