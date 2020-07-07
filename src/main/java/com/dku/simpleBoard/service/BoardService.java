package com.dku.simpleBoard.service;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    public BoardRepository mapper;

    public List<BoardDTO> getBoardList() {
        return mapper.getBoardList();
    }
    public BoardDTO getBoardByNo(Integer boardNo) {
        return mapper.getBoardByNo(boardNo);
    }
}
