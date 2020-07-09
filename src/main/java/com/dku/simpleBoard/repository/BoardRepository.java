package com.dku.simpleBoard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dku.simpleBoard.dto.BoardDTO;

@Repository
@Mapper
public interface BoardRepository {
    List<BoardDTO> getBoardList();
    List<BoardDTO> getBoardListByTitle(String title);
    List<BoardDTO> getBoardListByUserName(String userName);

    BoardDTO getBoardByBoardNo(Integer boardNo);

    void updateViewsOnBoard(Integer boardNo);
    void increaseLikeByBoardId(Integer boardNo);
    void decreaseLikeByBoardId(Integer boardNo);
}
