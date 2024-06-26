package com.du.tery.controllers.users;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.enums.UserRole;
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

import java.util.Objects;

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
        log.info("User: {} logging in.", userAccountDto);
        if (userAccountService.authenticateUser(userAccountDto) != null) {
            if (Objects.equals(userAccountDto.getUserRole(), UserRole.ADMIN_ROLE)) {
                return "admin-page.html";
            } else return "welcome-page.html";
        }
        model.addAttribute("loginErrorMessage", "Unable to authenticate.");
        return "login-page.html";
    }
}
