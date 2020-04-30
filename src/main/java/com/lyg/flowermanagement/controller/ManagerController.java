package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.entity.Manager;
import com.lyg.flowermanagement.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/managerController")
@RestController
@CrossOrigin("*")
public class ManagerController {
    Log log= LogFactory.getLog(EmployeeController.class);
    @Autowired
    ManagerService managerService;
    @GetMapping("/login")
    public Map<String, String> login(String id, String password){
        Map<String, String> map = new HashMap<>();
        Manager manager = managerService.login(id, password);
        log.info(manager);
        //判断对象是否为空
        if (manager == null) {
            map.put("success", "false");
            return map;
        } else {
            try {
                //admin对象转换为map对象
                map = BeanUtils.describe(manager);
                map.put("success", "ok");
            } catch (IllegalAccessException e) {
                log.error(e.getMessage());
            } catch (InvocationTargetException e) {
                log.error(e.getMessage());
            } catch (NoSuchMethodException e) {
                log.error(e.getMessage());
            }
            return map;
        }
    }
    //员工重置密码
    //测试地址:http://localhost:9000/web/managerController/resetPassword?id=1002
    //成功删除  result:1
    @GetMapping("/resetPassword")
    public Map resetPassword(String id,String password){
        Map map= new HashMap();
        int row =this.managerService.resetPassword(id, password);
        map.put("result",row);
        return  map;
    }
    //添加操作
    //测试地址:http://localhost:9000/web/managerController/insert?managerId=1003&&password=333&&name=444&&tel=1111&&email=333
    // 成功删除  result:1
    @GetMapping("/insert")
    public Map insert(Manager manager) {
        Map map= new HashMap();
        Integer emp= this.managerService.insert(manager);
        map.put("result",emp);
        return map;
    }
    //修改操作
    //修改全部信息测试地址:http://localhost:9000/web/managerController/update?password=666&&name=666&&tel=666&&email=666&&id=1003
    //修改个人密码测试地址:http://localhost:9000/web/managerController/update?password=777&&id=1003
    @GetMapping("/update")
    public  Map updatePassword(Manager manager,String id){
        manager.setManagerId(id);
        Map map= new HashMap();
        Integer emp=  this.managerService.update(manager);
        map.put("result",emp);
        return map;
    }

    //删除一条店主信息
    //测试地址:http://localhost:9000/web/managerController/delete?id=1003
    //成功删除  result:1
    @GetMapping("/delete")
    public Map delete(String id){
        Map map= new HashMap();
        Integer emp= this.managerService.deleteById(id);
        map.put("result",emp);
        return map;
    }
    //可以根据条件查询所有店主信息
    //根据id查询测试地址:http://localhost:9000/web/managerController/queryAll?manager_id=1001
    //可以根据游戏 姓名 电话等条件查询
    @GetMapping("/queryAll")
    public List<Manager> queryAll(Manager manager){
    List<Manager> list=this.managerService.queryAll(manager);
    return list;

    }
    //无条件查询所有
    //查询所有员工信息
    //测试地址:http://localhost:9000/web/EmployeeController/selectAll
    @RequestMapping("/selectAll")
    public  List<Manager> selectAll(){
        List<Manager> list= managerService.selectAll();
        log.info(list);
        return  list;
    }
    //根据id查询所属店主的一条信息
    //测试地址:http://localhost:9000/web/managerController/queryById?id=1001
    @GetMapping("/queryById")
    public Manager queryById(String id)
    {
        return this.managerService.queryById(id);
    }

}
