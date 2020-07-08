package com.sot.photography.bean;

public class Userinfo {
    /**
     * 用户详情Id
     */
    private Integer userInfoId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户头像
     */
    private String userHeaderImage;

    /**
     * 用户性别（0保密，1男，2女）
     */
    private Integer userSex;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户注册时间
     */
    private String userRegisterTime;

    /**
     * 用户签名
     */
    private String userNote;

    /**
     * 用户vip等级（0非会员,1大会员，2超级会员）
     */
    private Integer userVip;

    /**
     * 用户出生日期
     */
    private String userBirth;

    /**
     * 软删标记（1表示存在，0表示删除）
     */
    private Integer desoft;

    public Userinfo() {
        super();
    }

    public Userinfo(Integer userInfoId, Integer userId, String userHeaderImage, Integer userSex, String userAddress, String userRegisterTime, String userNote, Integer userVip, String userBirth, Integer desoft) {
        this.userInfoId = userInfoId;
        this.userId = userId;
        this.userHeaderImage = userHeaderImage;
        this.userSex = userSex;
        this.userAddress = userAddress;
        this.userRegisterTime = userRegisterTime;
        this.userNote = userNote;
        this.userVip = userVip;
        this.userBirth = userBirth;
        this.desoft = desoft;
    }

    public Integer getUserInfoId() {
        return this.userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserHeaderImage() {
        return this.userHeaderImage;
    }

    public void setUserHeaderImage(String userHeaderImage) {
        this.userHeaderImage = userHeaderImage;
    }

    public Integer getUserSex() {
        return this.userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserRegisterTime() {
        return this.userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getUserNote() {
        return this.userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public Integer getUserVip() {
        return this.userVip;
    }

    public void setUserVip(Integer userVip) {
        this.userVip = userVip;
    }

    public String getUserBirth() {
        return this.userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public Integer getDesoft() {
        return this.desoft;
    }

    public void setDesoft(Integer desoft) {
        this.desoft = desoft;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userInfoId=" + userInfoId +
                ", userId=" + userId +
                ", userHeaderImage='" + userHeaderImage + '\'' +
                ", userSex=" + userSex +
                ", userAddress='" + userAddress + '\'' +
                ", userRegisterTime='" + userRegisterTime + '\'' +
                ", userNote='" + userNote + '\'' +
                ", userVip=" + userVip +
                ", userBirth='" + userBirth + '\'' +
                ", desoft=" + desoft +
                '}';
    }
}

