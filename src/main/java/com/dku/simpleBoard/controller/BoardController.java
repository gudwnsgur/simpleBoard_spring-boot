package com.dku.simpleBoard.controller;

import java.util.List;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.service.LikeService;
import com.dku.simpleBoard.service.UserService;
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
    @Autowired
    LikeService likeService;
    @Autowired
    UserService userService;

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
                            @RequestParam(value = "title") String title) {

        HttpSession session = request.getSession();
        model.addAttribute("sessionId", session.getAttribute("sessionId"));

        List<BoardDTO> boardList = boardService.getBoardListByTitle(title);

        model.addAttribute("title", title);
        model.addAttribute("boardList", boardList);
        return "search";
    }

    @PostMapping("/board/{boardNo}/likes")
    public String likes(Model model,
                        HttpServletRequest request,
                        @PathVariable Integer boardNo) {

        HttpSession session = request.getSession();
        String sessionId = (String) session.getAttribute("sessionId");

        System.out.println("boardNo" + boardNo);

        if (sessionId == null) {
            System.out.println("로그인 후 사용할 수 있음");
            return "redirect:/board?no={boardNo}";
        }

        UserDTO user = userService.findUserByUserId(sessionId);

        // likes 없을 때
        if (likeService.checkLikes(user.getUserNo(), boardNo) == null) {
            likeService.insertLikes(user.getUserNo(), boardNo);
            boardService.increaseLikeByBoardId(boardNo);
            System.out.println("like!");
        } else {
            // likes 이미 했을 때
            likeService.deleteLikes(user.getUserNo(), boardNo);
            boardService.decreaseLikeByBoardId(boardNo);
            System.out.println("unlike!");
        }
        return "redirect:/board?no={boardNo}";
    }

}
