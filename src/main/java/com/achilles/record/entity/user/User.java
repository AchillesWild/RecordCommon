package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;

import java.util.Date;


public class User extends BaseEntity {

    private String userName;

    private String nickName;

    private String password;

    private String email;

    private String mobile;

    private Integer gender;

    private String imgUrl;

    private Integer homePage;

    private Integer loginTimes;

    private Integer proved;

    private String parentUserUuid;

    private String sharePages;

    private Long version;

    private Integer role;

    private Date loginDate;

    private Date lastLoginDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getHomePage() {
        return homePage;
    }

    public void setHomePage(Integer homePage) {
        this.homePage = homePage;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Integer getProved() {
        return proved;
    }

    public void setProved(Integer proved) {
        this.proved = proved;
    }

    public String getParentUserUuid() {
        return parentUserUuid;
    }

    public void setParentUserUuid(String parentUserUuid) {
        this.parentUserUuid = parentUserUuid;
    }

    public String getSharePages() {
        return sharePages;
    }

    public void setSharePages(String sharePages) {
        this.sharePages = sharePages;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}