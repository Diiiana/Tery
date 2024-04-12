package com.du.tery.facade;

import com.du.tery.dtos.UserAccountDto;

import java.util.List;

public interface UserAccountService {
    List<UserAccountDto> getAllUsers();

    UserAccountDto saveUser(UserAccountDto userAccountDto);
}
