package com.lyg.flowermanagement.service;

import com.lyg.flowermanagement.entity.Manager;
import com.lyg.flowermanagement.mapper.IManagerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (IManagerMapper)表服务实现类
 *
 * @author annian7
 * @since 2020-04-28 23:06:25
 */
@Service("managerService")
public class ManagerService implements IManagerMapper {
    @Resource
    private IManagerMapper managerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param managerId 主键
     * @return 实例对象
     */
    @Override
    public com.lyg.flowermanagement.entity.Manager queryById(String managerId) {
        return this.managerDao.queryById(managerId);
    }

    @Override
    public com.lyg.flowermanagement.entity.Manager login(String id, String password) {
        return this.managerDao.login(id, password);
    }

    @Override
    public List<Manager> queryAll(com.lyg.flowermanagement.entity.Manager manager) {
        return this.managerDao.queryAll(manager);
    }

    @Override
    public List<Manager> selectAll() {
        return this.managerDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(com.lyg.flowermanagement.entity.Manager manager) {
        return this.managerDao.insert(manager);
    }

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public int update(com.lyg.flowermanagement.entity.Manager manager) {
        return this.managerDao.update(manager);
    }

    /**
     * 通过主键删除数据
     *
     * @param managerId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(String managerId) {
        return this.managerDao.deleteById(managerId);
    }

    @Override
    public int resetPassword(String managerId, String password) {
        return this.managerDao.resetPassword(managerId, password);
    }
}