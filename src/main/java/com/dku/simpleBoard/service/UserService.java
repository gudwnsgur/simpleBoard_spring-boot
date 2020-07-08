package com.dku.simpleBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.repository.UserRepository;

@Service
public class UserService{

    @Autowired
    public UserRepository repository;

    public List<UserDTO> getUserList() {
        return repository.getUserList();
    }
    public void insertUser(UserDTO user) {
        repository.insertUser(user);
    }

    public UserDTO findUserByUserId(String userId) {return repository.findUserByUserId(userId);}
    public UserDTO matchUserPwdByUserId(String userId, String inputPwd) {
        return repository.matchUserPwdByUserId(userId, inputPwd);}
}
