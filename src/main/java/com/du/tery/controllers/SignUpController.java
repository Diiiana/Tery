package com.du.tery.controllers;

import com.du.tery.dtos.UserAccountDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    Logger logger = LoggerFactory.getLogger(SignUpController.class);

    @GetMapping("/signup")
    public String displayLoginPage() {
        return "sign-up-page.html";
    }

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("userAccount") UserAccountDto userAccountDto) {
        logger.info("Register user " + userAccountDto);
        return "login-page.html";
    }
}
