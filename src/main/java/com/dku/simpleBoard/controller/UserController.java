package com.dku.simpleBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public String join(Model model,
                       @RequestParam(value = "inputId") String inputId,
                       @RequestParam(value = "inputPwd1") String inputPwd1,
                       @RequestParam(value = "inputPwd2") String inputPwd2,
                       @RequestParam(value = "email") String email,
                       @RequestParam(value = "phoneNumber") String phoneNumber
    ) {
        model.addAttribute("id", inputId);
        model.addAttribute("pwd1", inputPwd1);
        model.addAttribute("pwd2", inputPwd2);
        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);

        if (!inputPwd1.equals(inputPwd2)) {
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
}
