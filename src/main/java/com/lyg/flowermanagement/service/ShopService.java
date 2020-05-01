package com.lyg.flowermanagement.service;

import com.lyg.flowermanagement.entity.Shop;
import com.lyg.flowermanagement.mapper.IShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService implements IShopMapper {
    @Autowired
    IShopMapper iShopMapper;
    @Override
    public List<Shop> findByIdAndName(Shop shop) {
        return iShopMapper.findByIdAndName(shop);
    }

    @Override
    public Shop queryById(int id) {
        return iShopMapper.queryById(id);
    }

    @Override
    public Integer update(Shop shop) {
        return iShopMapper.update(shop);
    }

    @Override
    public Integer deleteById(Integer shopId) {
        return iShopMapper.deleteById(shopId);
    }

    @Override
    public Integer insert(Shop shop) {
        return iShopMapper.insert(shop);
    }
}
