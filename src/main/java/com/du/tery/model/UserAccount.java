package com.du.tery.model;

import com.du.tery.enums.UserRole;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
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

    @ManyToMany
    @JoinTable(
            name = "story_author",
            joinColumns = @JoinColumn(name = "user_account_id"),
            inverseJoinColumns = @JoinColumn(name = "story_id")
    )
    private Set<UserAccount> stories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_account_id", referencedColumnName = "user_account_details_id")
    private UserAccountDetails userAccountDetails;

    @Column(name = "user_role")
    private UserRole userRole;
}
