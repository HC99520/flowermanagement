package com.lyg.flowermanagement.service;

import com.lyg.flowermanagement.entity.Employee;
import com.lyg.flowermanagement.mapper.IEmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService implements IEmployeeMapper {
    @Autowired
    IEmployeeMapper iEmployeeMapper;


    @Override
    public List<Employee> selectAll() {
        return iEmployeeMapper.selectAll();
    }

    @Override
    public Employee employeeLogin(String empId, String password) {
        return iEmployeeMapper.employeeLogin(empId,password);
    }
}
