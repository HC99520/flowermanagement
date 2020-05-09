package com.lyg.flowermanagement.service;


import com.lyg.flowermanagement.entity.Order;
import com.lyg.flowermanagement.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService implements OrderMapper {
 @Autowired
 OrderMapper orderMapper;

    @Override
    public Order queryById(Integer ordId) {
        return this.orderMapper.queryById(ordId);
    }

    @Override
    public List<Order> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public List<Order> queryAll(Order order) {
        return this.orderMapper.queryAll(order);
    }

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public int update(Order order) {
        return orderMapper.update(order);
    }

    @Override
    public int deleteById(Integer ordId) {
        return orderMapper.deleteById(ordId);
    }

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> selectById(Integer shopId) {
        return orderMapper.selectById(shopId);
    }
}