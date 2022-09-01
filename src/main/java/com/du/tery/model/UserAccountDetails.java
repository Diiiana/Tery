package com.du.tery.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class UserAccountDetails {

    @Id
    @GeneratedValue
    @Column(name = "user_account_details_id")
    private UUID userAccountDetailsId;

    @NotNull
    private String password;

    @NotNull
    @Column(unique = true)
    private String email;

    @OneToOne(mappedBy = "userAccountDetails")
    private UserAccount userAccount;
}
