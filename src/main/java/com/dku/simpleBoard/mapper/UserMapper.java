package com.dku.simpleBoard.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dku.simpleBoard.dto.UserDTO;

@Repository
@Mapper
public interface UserMapper {
    List<UserDTO> getUserList();
    void insertUser(UserDTO user);
}
