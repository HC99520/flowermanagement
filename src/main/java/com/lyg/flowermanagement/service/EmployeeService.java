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

    @Override
    public int resetPassword(String empId, String password) {
        return iEmployeeMapper.resetPassword(empId, password);
    }

    @Override
    public Integer update(Employee employee) {
        return iEmployeeMapper.update(employee);
    }

    @Override
    public Integer deleteById(String empId) {
        return iEmployeeMapper.deleteById(empId);
    }

    @Override
    public Integer insert(Employee employee) {
        return iEmployeeMapper.insert(employee);
    }
}
