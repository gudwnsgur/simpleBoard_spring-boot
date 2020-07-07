package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
