package com.lyg.flowermanagement.controller;

import com.alibaba.fastjson.JSON;
import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.entity.Manager;
import com.lyg.flowermanagement.service.ManagerService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Manager)表控制层
 *
 * @author makejava
 * @since 2020-05-03 20:11:03
 */
@RestController
@RequestMapping("manager")
@CrossOrigin("*")
public class ManagerController {
    /**
     * 服务对象
     */
    @Resource
    private ManagerService managerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //测试地址:http://localhost:9000/web/manager/selectOne?id=1001
    @GetMapping("selectOne")
    public Manager selectOne(String id) {
        return this.managerService.queryById(id);
    }
    //查所有
    //测试地址:http://localhost:9000/web/manager/selectAll
    @RequestMapping("/selectAll")
    public List<Manager> selectAll(){
        List<Manager> list= managerService.selectAll();
        return  list;
    }
    //登录操作
    //测试地址：http://localhost:9000/web/manager/login?id=1001&&password=666
    @RequestMapping("/login")
    public  String Login(String id,String password) {
        Manager manager = this.managerService.Login(id, password);
        if (manager == null) {
            return "{\"success\":\"false\"}";
        } else {
            manager.setSuccess("ok");
            return JSON.toJSONString(manager);
        }
    }
    //修改密码:http://localhost:9000/web/manager/update?managerId=1001&&password=111
    //修改个人信息也是这个
    @GetMapping("/update")
    public  Manager update( Manager manager){
        Map map= new HashMap();
        Integer emp=  this.managerService.update(manager);
        if(emp>=1){
            return this.managerService.queryById(manager.getManagerId());
        }else{
            return null;
        }
    }
    //添加操作:http://localhost:9000/web/manager/insert?managerId=3&&name=1&&password=333
    @GetMapping("/insert")
    public Map insert(Manager manager) {
        Map map= new HashMap();
        Integer row= this.managerService.insert(manager);
        map.put("result",row);
        return map;
    }
    //删除 http://localhost:9000/web/manager/delete?id=3
    @GetMapping("/delete")
    public Map delete(String id){
        Map map= new HashMap();
        Integer emp= this.managerService.deleteById(id);
        map.put("result",emp);
        return map;
    }
    //重置个人密码
    //测试地址:http://localhost:9000/web/manager/resetPassword?id=1001
    @GetMapping("/resetPassword")
    public Map resetPassword(String id,String password){
        Map map= new HashMap();
        int row =this.managerService.resetPassword(id, password);
        map.put("result",row);
        return  map;
    }
    }