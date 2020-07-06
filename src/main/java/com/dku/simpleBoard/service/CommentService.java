package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.dto.CommentDTO;
import com.dku.simpleBoard.mapper.BoardMapper;
import com.dku.simpleBoard.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    public CommentMapper mapper;

    public List<CommentDTO> getCommentList() { return mapper.getCommentList(); }
}

