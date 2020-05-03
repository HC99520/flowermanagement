package com.lyg.flowermanagement.entity;

import java.io.Serializable;

/**
 * (Manager)实体类
 *
 * @author makejava
 * @since 2020-05-03 20:11:02
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = -72028764339778744L;
    
    private String managerId;
    
    private String password;
    
    private String name;
    
    private String tel;
    
    private String email;
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}