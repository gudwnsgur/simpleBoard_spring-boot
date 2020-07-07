package com.dku.simpleBoard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dku.simpleBoard.dto.BoardDTO;

@Repository
@Mapper
public interface BoardRepository {
    List<BoardDTO> getBoardList();
    BoardDTO getBoardByNo(Integer boardNo);
}
