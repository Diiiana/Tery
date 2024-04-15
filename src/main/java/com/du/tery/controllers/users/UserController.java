package com.du.tery.controllers.users;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.facade.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class UserController {
    private final UserAccountService userAccountService;

    @Autowired
    public UserController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @PostMapping("/user/save")
    public ResponseEntity<Object> saveUser(@Validated @RequestBody UserAccountDto userAccountDto) {
        userAccountService.saveUser(userAccountDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/login")
    public String authenticateUser(Model model, @ModelAttribute("userAccountDto") UserAccountDto userAccountDto) {
        log.info("User: " + userAccountDto + " logging in.");
        if (userAccountService.authenticateUser(userAccountDto) != null) {
            return "welcome-page.html";
        }
        model.addAttribute("loginErrorMessage", "Unable to authenticate.");
        return "login-page.html";
    }
}
