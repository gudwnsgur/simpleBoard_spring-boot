package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.LikeDTO;
import com.dku.simpleBoard.repository.LikeRepository;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    LikeRepository repository;


    public LikeDTO checkLikes(Integer userNo, Integer boardNo) {
        return repository.checkLikes(userNo, boardNo);
    }

    public void insertLikes(Integer userNo, Integer boardNo) {
        repository.insertLikes(userNo, boardNo);
    }
    public void deleteLikes(Integer userNo, Integer boardNo) {
        repository.deleteLikes(userNo, boardNo);
    }
}
