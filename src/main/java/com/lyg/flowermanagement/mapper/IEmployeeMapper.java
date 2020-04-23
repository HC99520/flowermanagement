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

}
