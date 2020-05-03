package com.lyg.flowermanagement.service;

import com.lyg.flowermanagement.entity.Manager;
import com.lyg.flowermanagement.mapper.IManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerService  implements IManagerMapper {
    @Autowired
    IManagerMapper iManagerMapper;
    @Override
    public Manager queryById(String managerId) {
        return iManagerMapper.queryById(managerId);
    }

    @Override
    public List<Manager> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Integer insert(Manager manager) {
        return this.iManagerMapper.insert(manager);
    }

    @Override
    public Integer update(Manager manager) {
        return this.iManagerMapper.update(manager);
    }

    @Override
    public Integer deleteById(String managerId) {
        return this.iManagerMapper.deleteById(managerId);
    }

    @Override
    public List<Manager> selectAll() {
        return this.iManagerMapper.selectAll();
    }

    @Override
    public Manager Login(String managerId, String password) {
        return this.iManagerMapper.Login(managerId, password);
    }

    @Override
    public int resetPassword(String managerId, String password) {
        return this.iManagerMapper.resetPassword(managerId,password);
    }
}
