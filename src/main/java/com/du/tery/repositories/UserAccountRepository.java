package com.du.tery.repositories;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountDto, String> {

    UserAccount saveUserAccount(UserAccount userAccount);
}
