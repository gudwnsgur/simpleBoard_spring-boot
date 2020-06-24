package com.dku.simpleBoard.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.dku.simpleBoard.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository("uesrDAO")
public class UserDAO {
    @Autowired
    @Qualifier("userMapper")
    public List<String> getUserName() {
        return userMapper.getUsersInfo("형준혁").
                stream().map(users->users.getUserId()).
                collect(Collectors.toList());
    }

}
