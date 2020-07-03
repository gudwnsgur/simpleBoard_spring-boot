package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    public BoardMapper mapper;

    public List<BoardDTO> getBoardList() {
        return mapper.getBoardList();
    }
}
