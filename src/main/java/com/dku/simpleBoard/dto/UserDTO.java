package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

@Alias("UserDto")
public class UserDTO {
    private Integer userNo;
    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userTell;

    public UserDTO() { }
    public UserDTO(String userId, String userPwd, String userName,
                   String userEmail, String userTell) {
        super();
        this.userId=userId;
        this.userPwd=userPwd;
        this.userName=userName;
        this.userEmail=userEmail;
        this.userTell=userTell;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTell() {
        return userTell;
    }

    public void setUserTell(String userTell) {
        this.userTell = userTell;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }
}



