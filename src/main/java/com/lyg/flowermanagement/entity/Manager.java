package com.lyg.flowermanagement.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * (IManagerMapper)数据传输对象
 *
 * @author annian7
 * @since 2020-04-28 23:06:25
 */
@AllArgsConstructor
@Data
@Builder
@ToString
public class Manager implements Serializable {
    private static final long serialVersionUID = -75434558243855654L;
    
    private String managerId;
    
    private String password;
    
    private String name;
    
    private String tel;
    
    private String email;

}