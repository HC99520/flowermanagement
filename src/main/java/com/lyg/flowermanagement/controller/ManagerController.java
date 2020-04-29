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
}
