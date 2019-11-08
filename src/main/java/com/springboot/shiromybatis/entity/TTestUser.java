package com.springboot.shiromybatis.entity;

import java.io.Serializable;

/**
 * (TTestUser)实体类
 *
 * @author makejava
 * @since 2019-11-07 17:02:37
 */
public class TTestUser implements Serializable {
    private static final long serialVersionUID = 695197464240889766L;
    //id
    private Long userTestId;
    //user_id
    private Long userId;
    //other
    private String userOther;


    public Long getUserTestId() {
        return userTestId;
    }

    public void setUserTestId(Long userTestId) {
        this.userTestId = userTestId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserOther() {
        return userOther;
    }

    public void setUserOther(String userOther) {
        this.userOther = userOther;
    }

}