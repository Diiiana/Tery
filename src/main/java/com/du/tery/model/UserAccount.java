package com.du.tery.model;

import com.du.tery.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity(name = "USER_ACCOUNT")
public class UserAccount {

    @Id
    @GeneratedValue
    @Column(name = "USER_ACCOUNT_ID")
    private UUID userAccountId;

    @Column(name = "USERNAME", unique = true)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_ROLE")
    private UserRole userRole;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "USERS_STORIES",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "STORY_ID")
    )
    private Set<Story> stories;
}
