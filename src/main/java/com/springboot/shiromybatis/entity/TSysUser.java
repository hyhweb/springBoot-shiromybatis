package com.springboot.shiromybatis.entity;

import java.io.Serializable;

/**
 * (TSysUser)实体类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public class TSysUser implements Serializable {
    private static final long serialVersionUID = -53041776254454840L;
    //用户ID
    private Long id;
    //用户名
    private String username;
    
    private String password;
    
    private String salt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}