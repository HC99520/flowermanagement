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
}
