package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IShopMapper {
    //查看店铺的id和店铺名称
    List<Shop> findByIdAndName(Shop shop);
    //根据id查
    Shop queryById(int id);

    //修改操作
    Integer update( Shop shop);

    //删除操作
    Integer deleteById(Integer empId);

    //新增
    Integer insert(Shop shop);
}
