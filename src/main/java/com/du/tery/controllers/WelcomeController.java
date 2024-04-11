package com.du.tery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping({"", "/", "/welcome"})
    public String displayWelcomePage() {
        return "welcome-page.html";
    }

    @GetMapping({"/login"})
    public String displayLoginPage() {
        return "login-page.html";
    }

    @GetMapping({"/signup"})
    public String displaySignUpPage() {
        return "sign-up-page.html";
    }
}
