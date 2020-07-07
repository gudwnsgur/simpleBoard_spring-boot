package com.dku.simpleBoard.repository;

import com.dku.simpleBoard.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommentRepository {
        List<CommentDTO> getCommentListByBoardNo(Integer boardNo);
}
