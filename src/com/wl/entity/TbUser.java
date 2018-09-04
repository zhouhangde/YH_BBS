package com.wl.entity;

import java.math.BigDecimal;

public class TbUser {
    private BigDecimal userId;

    private String userName;

    private String userPassword;

    private String userFace;

    private String userSex;

    private String userPhone;

    private String userOico;

    private String userEmail;

    private String userFrom;

    private String userAble;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserFace() {
        return userFace;
    }

    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserOico() {
        return userOico;
    }

    public void setUserOico(String userOico) {
        this.userOico = userOico == null ? null : userOico.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom == null ? null : userFrom.trim();
    }

    public String getUserAble() {
        return userAble;
    }

    public void setUserAble(String userAble) {
        this.userAble = userAble == null ? null : userAble.trim();
    }
}