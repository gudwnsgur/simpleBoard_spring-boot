package com.dku.simpleBoard.mapper;

import com.dku.simpleBoard.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommentMapper {
        List<CommentDTO> getCommentListByBoardNo(Integer boardNo);
}
