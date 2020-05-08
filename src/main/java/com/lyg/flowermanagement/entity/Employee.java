package com.lyg.flowermanagement.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    private String success;
}
