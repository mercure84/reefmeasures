package com.centropyebicolor.reefmeasures.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/home.html")
    public String showHomePage() {
        return "home";
    }

}
