package com.sot.photography.bean;

/**
 * @author :宋佳敏
 * @apiNote :用户实体
 * @time :2020-3-8
 */

public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    /**
     * 用户权限（1普通用户，2摄影师，3管理员）
     */
    private Integer role;

    /**
     * 用户详情表
     */
    private Userinfo userinfo;

    public User() {
        super();
    }

    public User(Integer userId, String userName, String userPassword, String userEmail, String userTel, Integer desoft, Integer role,Userinfo userinfo) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userTel = userTel;
        this.desoft = desoft;
        this.role = role;
        this.userinfo = userinfo;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return this.userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTel='" + userTel + '\'' +
                ", desoft=" + desoft +
                ", role=" + role +
                ", userinfo=" + userinfo +
                '}';
    }
}

