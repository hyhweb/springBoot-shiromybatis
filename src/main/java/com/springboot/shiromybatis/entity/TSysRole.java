package com.springboot.shiromybatis.entity;

import java.io.Serializable;

/**
 * (TSysRole)实体类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public class TSysRole implements Serializable {
    private static final long serialVersionUID = 661849880737909216L;
    //ID
    private Long roleId;
    //角色名称
    private String roleName;
    
    private String roleCode;
    
    private String name;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}