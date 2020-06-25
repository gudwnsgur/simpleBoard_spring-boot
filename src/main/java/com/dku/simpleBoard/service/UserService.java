package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    public UserMapper mapper;

    public List<UserDTO> getUserList() {
        return mapper.getUserList();
    }
}
