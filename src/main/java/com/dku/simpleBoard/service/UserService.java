package com.dku.simpleBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.repository.UserRepository;

@Service
public class UserService{

    @Autowired
    public UserRepository mapper;

    public List<UserDTO> getUserList() {
        return mapper.getUserList();
    }
    public void insertUser(UserDTO user) {
        mapper.insertUser(user);
    }
}
