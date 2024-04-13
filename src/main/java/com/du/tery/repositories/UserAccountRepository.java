package com.du.tery.repositories;

import com.du.tery.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAccountRepository extends JpaRepository<UserAccount, UUID> {

    UserAccount findUserAccountByEmailOrUsername(String email, String username);

}
