package com.dku.simpleBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import com.dku.simpleBoard.dto.CommentDTO;
import com.dku.simpleBoard.dto.BoardDTO;
import com.dku.simpleBoard.service.CommentService;
import com.dku.simpleBoard.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;
    @Autowired
    CommentService commentService;


    @GetMapping("/")
    public String index(Model model,
                        HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        model.addAttribute("sessionId", session.getAttribute("sessionId"));
        List<BoardDTO> boardList = boardService.getBoardList();

        model.addAttribute("boardList", boardList);
        System.out.println(session.getAttribute("sessionId"));
        return "index";
    }

    @GetMapping("/board")
    public String board(Model model,
                        HttpServletRequest request,
                        @RequestParam(value = "no") Integer boardNo) {

        HttpSession session = request.getSession();
        model.addAttribute("sessionId", session.getAttribute("sessionId"));

        BoardDTO curBoard = boardService.getBoardByBoardNo(boardNo);
        List<CommentDTO> commentList = commentService.getCommentListByBoardNo(boardNo);

        boardService.updateViewsOnBoard(boardNo);

        model.addAttribute("board", curBoard);
        model.addAttribute("commentList", commentList);

        return "board";
    }
    @GetMapping("/search")
    public String getSearch(Model model,
                            HttpServletRequest request,
                            @RequestParam(value = "title") String title){

        HttpSession session = request.getSession();
        model.addAttribute("sessionId", session.getAttribute("sessionId"));

        List<BoardDTO> boardList = boardService.getBoardListByTitle(title);

        model.addAttribute("title", title);
        model.addAttribute("boardList", boardList);
        return "search";
    }



}
