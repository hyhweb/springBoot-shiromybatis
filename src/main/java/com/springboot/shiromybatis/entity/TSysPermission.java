package com.springboot.shiromybatis.entity;

import java.io.Serializable;

/**
 * (TSysPermission)实体类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public class TSysPermission implements Serializable {
    private static final long serialVersionUID = -61001488440129696L;
    //ID
    private Long permissionId;
    //权限名称
    private String permissionName;
    
    private String permissionCode;


    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

}