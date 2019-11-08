package com.springboot.shiromybatis.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @PostMapping("/login")
    public String Login(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return "login success";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "login fail";
        }
    }

    @GetMapping("/dba")
    public String dba() {
        return "dba";
    }
    @RequiresPermissions({"add"})
    @GetMapping("/add")
    public String admin() {
        return "add  11";
    }
    @RequiresPermissions({"delete"})
    @GetMapping("/delete")
    public String user() {
        return "delete";
    }

    @GetMapping("/noneAuth")
    public String noneAuth() {
        return "请重新登录";
    }

}
