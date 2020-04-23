package com.lyg.flowermanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    //员工id
    private String empId;
    //店铺
    private Shop  shop;
    private String password;
    private String  name;
    private String tel;
    private String email;
    private String birthday;
}
