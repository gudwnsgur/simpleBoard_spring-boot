package com.dku.simpleBoard.controller;

import com.dku.simpleBoard.dto.UserDTO;
import com.dku.simpleBoard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public String join(Model model,
                       @RequestParam(value = "inputId") String inputId,
                       @RequestParam(value = "inputPwd1") String inputPwd1,
                       @RequestParam(value = "inputPwd2") String inputPwd2,
                       @RequestParam(value = "inputName") String inputName,
                       @RequestParam(value = "inputEmail") String inputEmail,
                       @RequestParam(value = "inputTell") String inputTell
    ) {


        if (!inputPwd1.equals(inputPwd2)) {
            UserDTO user = new UserDTO(inputId, inputPwd1, inputName, inputEmail, inputTell);
            user.setUserId(inputId);
            user.setUserPwd(inputPwd1);
            user.setUserName(inputName);
            user.setUserEmail(inputEmail);
            user.setUserTell(inputTell);

            userService.insertUser(user);

            return "join";
        } else {
            return "index";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam(value = "inputId", required = false)
                                String inputId) {
        String user = "gudwnsgur";
        if (user.equals(inputId)) {
            return "index";
        } else return "acdvadvda";
    }

    @GetMapping("/users")
    public String adminUser(Model model) throws Exception {
        List<UserDTO> userList = userService.getUserList();
        model.addAttribute("userList", userList);

        return "user";
    }
}
