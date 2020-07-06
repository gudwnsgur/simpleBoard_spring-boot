package com.dku.simpleBoard.controller;

import java.util.List;

import com.dku.simpleBoard.dto.CommentDTO;
import com.dku.simpleBoard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.service.BoardService;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;
    @Autowired
    CommentService commentService;


    @GetMapping("/")
    public String index(Model model) throws Exception {
        List<BoardDTO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "index";
    }
}
