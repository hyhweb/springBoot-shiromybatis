package com.springboot.shiromybatis.common.exception;

import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {
/*    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception e) {
        Map map = new HashMap();
        map.put("msg", e.getMessage());
        return map;
    }*/

    /**
     * 无账号异常
     * @param e
     * @return
     */
    @ExceptionHandler({UnknownAccountException.class})
    @ResponseBody
    public Object unknownAccountException(Exception e) {
       // return handleException("无账号异常");
        return handleException("账号或密码有误");
    }
    /**
     * 密码错误异常
     * @param e
     * @return
     */
    @ExceptionHandler({IncorrectCredentialsException.class})
    @ResponseBody
    public Object incorrectCredentialsException(Exception e) {
       // return handleException("密码错误异常");
        return handleException("账号或密码有误");
    }

    /**
     * 无授权异常处理
     * @return 授权异常
     */
    @ExceptionHandler({AuthorizationException.class})
    @ResponseBody
    public Object authorizationException(Exception e) {
        return handleException("无权限异常");
    }



    /**
     * 无授权异常处理
     * @return 授权异常
     */
/*    @ExceptionHandler({UnauthenticatedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Object unauthorizedException(Exception e) {

        return handleException("无权限异常");
    }*/




    /**
     * 登录异常处理
     * @return 登录异常
     */
/*    @ExceptionHandler({ShiroException.class})
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ResponseBody
    public Object shiroException(ShiroException e) {
        return handleException("登录异常");
    }*/
    /**
     * 用于处理异常的
     * @return 业务异常
     */
/*
    @ExceptionHandler({AdderBusinessException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object businessException(AdderBusinessException e) {
        return handleException(e);
    }
*/

    /**
     * 用于处理异常的
     * @return 无服务异常
     */
    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Object notFoundException(NoHandlerFoundException e) {
        return handleException("无服务异常");
    }
    /**
     * 用于处理异常的
     * @return 业务异常
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Object methodNotSupportException(HttpRequestMethodNotSupportedException e) {
        return handleException("接口请求方式异常post或者get");
    }

    /**
     * 用于处理异常的
     * @return  系统异常
     */
    @ExceptionHandler({RuntimeException.class,Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object systemException(Exception e) {
        return handleException("系统异常");
    }

/*    protected Map<String,Object> handleException(Exception e){
        Map<String,Object> rs = new HashMap<>();
        rs.put("message",e.getMessage());
        rs.put("class",e.getClass().getName());
        return rs;
    }*/
    protected Map<String,Object> handleException(String msg){
        Map<String,Object> rs = new HashMap<>();
        rs.put("message",msg);
       // rs.put("class",e.getClass().getName());
        return rs;
}

}
