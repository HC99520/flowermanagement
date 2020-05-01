package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.entity.Shop;
import com.lyg.flowermanagement.service.EmployeeService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/EmployeeController")
@CrossOrigin("*")
public class EmployeeController {
    Log log= LogFactory.getLog(EmployeeController.class);
    @Autowired
    EmployeeService employeeService;
    //查询所有员工信息
    //测试地址:http://localhost:9000/web/EmployeeController/selectAll
    @RequestMapping("/selectAll")
    public  List<Employee> selectAll(){
        List<Employee> list= employeeService.selectAll();
        log.info(list);
        return  list;
    }
    //测试地址:http://localhost:9000/web/EmployeeController/selectById?empId=1501
    //根据id查询员工信息
    @GetMapping("/selectById")
    public Employee selectById(int empId){
        return this.employeeService.queryById(empId);
    }
    //员工登录
    //测试地址:http://localhost:9000/web/EmployeeController/employeeLogin?empId=1501&&password=123456
    @RequestMapping("/login")
    public  Map<String,String> employeeLogin(String id,String password) {
        Map<String, String> map = new HashMap<>();
        Employee employee = employeeService.employeeLogin(id, password);
        log.info(employee);
        //判断对象是否为空
        if (employee == null) {
            map.put("success", "false");
            return map;
        } else {
            try {
                //admin对象转换为map对象
                map = BeanUtils.describe(employee);
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
    //员工重置个人密码
    //测试地址:http://localhost:9000/web/EmployeeController/resetPassword?empId=1501&&password
    @GetMapping("/resetPassword")
    public Map resetPassword(String empId,String password){
        Map map= new HashMap();
        int row =this.employeeService.resetPassword(empId, password);
        map.put("result",row);
        return  map;
    }
    //员工修改操作
    //修改员工密码:测试地址:http://localhost:9000/web/EmployeeController/updatePassword?empId=123&&password=666
    //修改员工信息:测试地址:http://localhost:9000/web/EmployeeController/updatePassword?empId=123&&password=666&&shop.shopId=321&&name=333&&tel=333&&email=333&&birthday=333
    //成功返回值是  result:1
    @GetMapping("/updatePassword")
    public  Map updatePassword(Employee employee){
        Map map= new HashMap();
        Integer emp=  this.employeeService.update(employee);
           map.put("result",emp);
            return map;
    }
    //删除一条员工信息
    //测试地址:http://localhost:9000/web/EmployeeController/deleteEmployee?empId=123
    //成功删除  result:1
    @GetMapping("/deleteEmployee")
    public Map deleteStudent(String empId){
        Map map= new HashMap();
       Integer emp= this.employeeService.deleteById(empId);
        map.put("result",emp);
        return map;
    }
    //添加操作
    //测试地址:http://localhost:9000/web/EmployeeController/insertEmployee?empId=123&&password=666&&shop.shopId=321&&name=333&&tel=333&&email=333&&birthday=333
    //成功删除  result:1
    @GetMapping("/insertEmployee")
    public Map insertEmployee(Employee employee) {
        Map map= new HashMap();
        Integer emp= this.employeeService.insert(employee);
        map.put("result",emp);
        return map;
    }
    //测试地址：http://localhost:9000/web/ShopController/selectOne?id=1
    @GetMapping("selectOne")
    public Employee selectOne(String id) {

        return this.employeeService.queryById(id);
    }
}
