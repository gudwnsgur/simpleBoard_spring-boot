package com.dku.simpleBoard.mapper;

import com.dku.simpleBoard.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {
    @Select("select user_name from users")
    List<UserDTO> getUsersInfo(@Param("user_name") String userName);
}
