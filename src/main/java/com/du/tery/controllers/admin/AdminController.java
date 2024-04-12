package com.du.tery.controllers.admin;

import com.du.tery.facade.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AdminController {

    private final UserAccountService userAccountService;

    @Autowired
    public AdminController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @GetMapping("/users")
    public String getUserAccounts(Model model) {
        model.addAttribute("usersAccounts", userAccountService.getAllUsers());
        return "admin/users.html";
    }
}
