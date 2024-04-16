package com.du.tery.dtos;

import com.du.tery.enums.UserRole;
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
    private UserRole userRole;

    @NonNull
    private String email;

    @NonNull
    private String password;
}
