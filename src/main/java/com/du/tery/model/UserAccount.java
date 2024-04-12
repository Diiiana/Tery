package com.du.tery.model;

import com.du.tery.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue
    @Column(name = "user_account_id")
    private UUID userAccountId;

    @Column(unique = true)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;

    @Column(unique = true)
    private String email;

    private String password;
}
