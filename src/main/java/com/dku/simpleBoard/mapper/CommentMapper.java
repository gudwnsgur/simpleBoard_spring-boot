package com.dku.simpleBoard.mapper;

import com.dku.simpleBoard.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommentMapper {
        List<CommentDTO> getCommentList();
}
