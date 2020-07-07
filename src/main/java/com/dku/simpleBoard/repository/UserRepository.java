package com.dku.simpleBoard.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dku.simpleBoard.dto.UserDTO;

@Repository
@Mapper
public interface UserRepository {
    List<UserDTO> getUserList();
    void insertUser(UserDTO user);
}
