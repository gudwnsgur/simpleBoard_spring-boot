package com.dku.simpleBoard.mapper;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {
    List<BoardDTO> getBoardList();
    BoardDTO getBoardByNo(Integer boardNo);
}
