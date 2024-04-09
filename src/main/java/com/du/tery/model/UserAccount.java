package com.du.tery.model;

import com.du.tery.enums.UserRole;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue
    @Column(name = "user_account_id")
    private UUID userAccountId;

    @NotNull
    @Column(unique = true)
    private String username;

    @Column(name = "user_role")
    private UserRole userRole;
}
