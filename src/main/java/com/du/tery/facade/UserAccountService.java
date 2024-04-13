package com.du.tery.facade;

import com.du.tery.dtos.UserAccountDto;

import java.util.List;

public interface UserAccountService {
    UserAccountDto findUser(UserAccountDto userAccountDto);

    List<UserAccountDto> getAllUsers();

    UserAccountDto saveUser(UserAccountDto userAccountDto);

    UserAccountDto authenticateUser(UserAccountDto userAccountDto);
}
