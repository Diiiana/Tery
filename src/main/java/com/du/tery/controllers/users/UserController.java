package com.du.tery.controllers.users;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.facade.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    private final UserAccountService userAccountService;

    @Autowired
    public UserController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @PostMapping("/user/save")
    public ResponseEntity<Object> saveUser(@RequestBody UserAccountDto userAccountDto) {
        userAccountService.saveUser(userAccountDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
