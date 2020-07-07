package com.dku.simpleBoard.repository;

import com.dku.simpleBoard.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardRepository {
    List<BoardDTO> getBoardList();
    BoardDTO getBoardByNo(Integer boardNo);
}
