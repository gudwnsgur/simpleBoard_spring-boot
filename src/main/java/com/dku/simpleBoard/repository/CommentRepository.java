package com.dku.simpleBoard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dku.simpleBoard.dto.CommentDTO;

@Repository
@Mapper
public interface CommentRepository {
        List<CommentDTO> getCommentListByBoardNo(Integer boardNo);
}
