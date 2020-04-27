package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IEmployeeMapper {
 List<Employee> selectAll();
 //登录操作
 Employee employeeLogin(@Param("empId") String empId, @Param("password") String password);
 //员工重置密码
 int resetPassword(@Param("empId")String empId,@Param("password") String password);
//员工修改操作
Integer update(Employee employee);
//删除员工操作
Integer deleteById(String empId);
//新增员工
Integer insert(Employee employee);
}