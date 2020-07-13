package com.dku.simpleBoard.controller;

import com.dku.simpleBoard.dto.CommentDTO;
import com.dku.simpleBoard.service.CommentService;
import com.dku.simpleBoard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    UserService userService;

    @GetMapping("/board/{boardNo}/comment")
    public String getComment(Model model,
                             HttpServletRequest request,
                             @PathVariable Integer boardNo) {
        HttpSession session = request.getSession();
        String sessionId = (String) session.getAttribute("sessionId");

        model.addAttribute("sessionId", sessionId);
        model.addAttribute("boardNo", boardNo);
        return "comment";
    }

    @PostMapping("/board/{boardNo}/comment")
    public String postComment(Model model,
                              HttpServletRequest request,
                              @PathVariable Integer boardNo,
                              @RequestParam(value = "content") String commentContent) {

        HttpSession session = request.getSession();
        String sessionId = (String) session.getAttribute("sessionId");

        if (sessionId != null) {
            CommentDTO comment = new CommentDTO(
                    boardNo,
                    userService.findUserByUserId(sessionId).getUserNo(),
                    commentContent
            );
            commentService.insertComment(comment);
        }
        model.addAttribute("sessionId", sessionId);
        return "redirect:/board?no={boardNo}";
    }
}
