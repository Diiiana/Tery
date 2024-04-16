package com.du.tery.services;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.facade.UserAccountService;
import com.du.tery.mappers.UserAccountMapper;
import com.du.tery.model.UserAccount;
import com.du.tery.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userAccountRepository;

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccountDto findUser(UserAccountDto userAccountDto) {
        UserAccount userAccount = userAccountRepository.findUserAccountByEmailOrUsername(userAccountDto.getEmail(),
                userAccountDto.getUsername());
        if (userAccount == null) {
            return null;
        }
        return userAccountMapper.userAccountToUserAccountDto(userAccount);
    }

    @Override
    public List<UserAccountDto> getAllUsers() {
        List<UserAccount> users = userAccountRepository.findAll();
        return users.stream()
                .map(u -> userAccountMapper.userAccountToUserAccountDto(u))
                .collect(Collectors.toList());
    }

    @Override
    public UserAccountDto saveUser(UserAccountDto userAccountDto) {
        UserAccount userAccount = userAccountMapper.userAccountDtoToUserAccount(userAccountDto);
        userAccount = userAccountRepository.save(userAccount);
        return userAccountMapper.userAccountToUserAccountDto(userAccount);
    }

    @Override
    public UserAccountDto authenticateUser(UserAccountDto userAccountDto) {
        UserAccountDto foundUser = findUser(userAccountDto);
        if (foundUser != null && foundUser.getPassword().equals(userAccountDto.getPassword())) {
            return foundUser;
        }
        return null;
    }
}
