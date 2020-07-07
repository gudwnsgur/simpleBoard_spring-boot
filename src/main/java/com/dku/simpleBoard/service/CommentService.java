package com.dku.simpleBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dku.simpleBoard.dto.CommentDTO;
import com.dku.simpleBoard.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    public CommentRepository repository;

    public List<CommentDTO> getCommentListByBoardNo(Integer boardNo) { return repository.getCommentListByBoardNo(boardNo); }
}

