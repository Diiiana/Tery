package com.du.tery.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String displayLoginPage() {
        return "login-page.html";
    }

    @PostMapping("/login")
    public String authenticateUser(@ModelAttribute("username") String username,
                                   @ModelAttribute("password") String password) {
        logger.info("User: " + username + " with " + password + " logging in.");
        return "welcome-page.html";
    }
}
