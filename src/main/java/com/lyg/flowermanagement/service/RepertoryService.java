package com.lyg.flowermanagement.service;

import com.lyg.flowermanagement.entity.Repertory;
import com.lyg.flowermanagement.mapper.IRepertoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Repertory)表服务接口
 *
 * @author makejava
 * @since 2020-04-30 21:17:31
 */
@Service
public class  RepertoryService implements IRepertoryMapper {
@Autowired
IRepertoryMapper ieRepertoryMapper;

    @Override
    public Repertory queryById(Integer repId) {
        return ieRepertoryMapper.queryById(repId);
    }

    @Override
    public List<Repertory> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public List<Repertory> queryAll(Repertory repertory) {
        return ieRepertoryMapper.queryAll(repertory);
    }

    @Override
    public int insert(Repertory repertory) {
        return ieRepertoryMapper.insert(repertory);
    }

    @Override
    public int update(Repertory repertory) {
        return ieRepertoryMapper.update(repertory);
    }

    @Override
    public int deleteById(Integer repId) {
        return ieRepertoryMapper.deleteById(repId);
    }

    @Override
    public List<Repertory> selectAll() {
        return this.ieRepertoryMapper.selectAll();
    }

    @Override
    public List<Repertory> selectByName(String commodityName) {
        return ieRepertoryMapper.selectByName(commodityName);
    }

    @Override
    public List<Repertory> selectByShopName(String shopName) {
        return ieRepertoryMapper.selectByShopName(shopName);
    }
}