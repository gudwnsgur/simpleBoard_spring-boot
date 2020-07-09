package com.dku.simpleBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.repository.BoardRepository;

@Service
public class BoardService {
    @Autowired
    public BoardRepository repository;

    public List<BoardDTO> getBoardList() {
        return repository.getBoardList();
    }

    public List<BoardDTO> getBoardListByTitle(String title) {
        return repository.getBoardListByTitle(title);
    }
    public List<BoardDTO> getBoardListByUserName(String userName) {
        return repository.getBoardListByUserName(userName);
    }

    public BoardDTO getBoardByBoardNo(Integer boardNo) {
        return repository.getBoardByBoardNo(boardNo);
    }

    public void updateViewsOnBoard(Integer boardNo) {
        repository.updateViewsOnBoard(boardNo);
    }
    public void increaseLikeByBoardId(Integer boardNo) {
        repository.increaseLikeByBoardId(boardNo);
    }
    public void decreaseLikeByBoardId(Integer boardNo) {
        repository.decreaseLikeByBoardId(boardNo);
    }

}
