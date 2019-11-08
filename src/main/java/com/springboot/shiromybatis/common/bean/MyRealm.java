package com.springboot.shiromybatis.common.bean;

import com.springboot.shiromybatis.entity.TSysPermission;
import com.springboot.shiromybatis.entity.TSysRole;
import com.springboot.shiromybatis.entity.TSysUser;
import com.springboot.shiromybatis.service.TSysPermissionService;
import com.springboot.shiromybatis.service.TSysRoleService;
import com.springboot.shiromybatis.service.TSysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {
    @Autowired
    TSysUserService tSysUserService;

    @Autowired
    TSysRoleService tSysRoleService;

    @Autowired
    TSysPermissionService tSysPermissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles = new HashSet<>();
        List<TSysRole> rolesList = tSysRoleService.getRoleByUserName(userName);
        for (TSysRole role : rolesList) {
            roles.add(role.getName());
        }

        Set<String> permissions = new HashSet<>();
        List<TSysPermission> permissionList = tSysPermissionService.getPermissionByUserName(userName);
        for (TSysPermission permission : permissionList) {
           //info.addStringPermission(permission.getPermissionCode());
            permissions.add(permission.getPermissionCode());
        }
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = authenticationToken.getPrincipal().toString();
        TSysUser user = tSysUserService.getUserByName(userName);
        if (user != null) {
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
            return authenticationInfo;
        } else {
            return null;
        }


    }
}
