package com.du.tery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping({"", "/", "/welcome"})
    public String displayWelcomePage() {
        return "welcome-page.html";
    }
}
