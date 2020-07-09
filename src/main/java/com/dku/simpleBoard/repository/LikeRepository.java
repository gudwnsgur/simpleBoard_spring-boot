package com.dku.simpleBoard.repository;


import com.dku.simpleBoard.dto.LikeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LikeRepository {
    LikeDTO checkLikes(Integer userNo, Integer boardNo);
    void insertLikes(Integer userNo, Integer boardNo);
    void deleteLikes(Integer userNo, Integer boardNo);
}
