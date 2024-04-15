package com.du.tery.dtos;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString(of = {"username", "email"})
public class UserAccountDto {

    private UUID userAccountId;

    @NonNull
    private String username;
    private String userRole;

    @NonNull
    private String email;

    @NonNull
    private String password;
}
