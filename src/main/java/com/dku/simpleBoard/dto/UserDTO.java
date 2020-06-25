package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;
import lombok.Getter;
import lombok.Setter;

@Alias("UserDto")
@Getter
@Setter
public class UserDTO {
    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userTell;
}



