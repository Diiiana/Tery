package com.du.tery.repositories;

import com.du.tery.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findUserAccountByEmailOrUsername(String email, String username);

    Optional<UserAccount> findUserAccountByUsername(String username);
}
