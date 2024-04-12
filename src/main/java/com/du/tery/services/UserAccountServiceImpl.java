package com.du.tery.services;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.facade.UserAccountService;
import com.du.tery.model.UserAccount;
import com.du.tery.repositories.UserAccountRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userAccountRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public List<UserAccountDto> getAllUsers() {
        List<UserAccount> users = userAccountRepository.findAll();
        return users.stream()
                .map(u -> modelMapper.map(u, UserAccountDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserAccountDto saveUser(UserAccountDto userAccountDto) {
        UserAccount userAccount = new UserAccount();
        modelMapper.map(userAccountDto, userAccount);
        userAccount = userAccountRepository.save(userAccount);
        modelMapper.map(userAccount, userAccountDto);
        return userAccountDto;
    }
}
