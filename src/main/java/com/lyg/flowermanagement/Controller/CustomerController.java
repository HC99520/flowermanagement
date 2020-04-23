package com.lyg.flowermanagement.Controller;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.service.EmployeeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/EmployeeController")
@CrossOrigin("*")
class EmployeeController {
    Log log= LogFactory.getLog(EmployeeController.class);
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/selectAll")
    public  List<Employee> selectAll(){
        List<Employee> list= employeeService.selectAll();
        log.info(list);
        return  list;
    }
    @RequestMapping("/employeeLogin")
    public Employee employeeLogin(String empId,String password){
        Employee employee=employeeService.employeeLogin(empId,password);
        log.info(employee);
        return employee;
    }

}
