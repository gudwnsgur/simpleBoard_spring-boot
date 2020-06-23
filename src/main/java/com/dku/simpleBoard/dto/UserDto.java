package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

@Alias("userDto")
public class UserDto {
    public String userId, userPwd, userName, userEmail, userTell;

    public String getUserId() { return userId; }
    public String getUserPwd() { return userPwd; }
    public String getUserName() { return userName; }
    public String getUserEmail() { return userEmail; }
    public String getUserTell() { return userTell; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setUserPwd(String userPwd) { this.userPwd = userPwd; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public void setUserTell(String userTell) { this.userTell = userTell; }

    @Override
    public String toString() {
        return  "UserDto [userId = " + userId + "]\n"+
                "        [userPwd = " + userPwd +"]\n"+
                "        [userName = " + userName + "]\n"+
                "        [userEmail = "+ userEmail+ "]\n"+
                "        [userPhoneNumber = "+userTell+ "]";
    }
}
