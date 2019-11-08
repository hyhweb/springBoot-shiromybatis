package com.springboot.shiromybatis.entity;

import java.io.Serializable;

/**
 * (TSysRolePermission)实体类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public class TSysRolePermission implements Serializable {
    private static final long serialVersionUID = 517988636405912485L;
    //ID
    private Long rolePermissionId;
    //用户ID
    private Long roleId;
    //权限ID
    private Long permissionId;


    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

}