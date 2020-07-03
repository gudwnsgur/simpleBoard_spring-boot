package com.dku.simpleBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping("/mainPage")
    public String index() {
        return "index";
    }
}
