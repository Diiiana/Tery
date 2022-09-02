package com.du.tery.services;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.facade.UserAccountFacade;
import com.du.tery.repositories.UserAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService implements UserAccountFacade {

    private final UserAccountRepository userAccountRepository;

    public UserAccountService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccountDto saveUserAccount(UserAccountDto userAccountDto) {
        return null;
    }
}
