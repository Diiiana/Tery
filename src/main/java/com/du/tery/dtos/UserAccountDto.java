package com.du.tery.dtos;

import com.du.tery.enums.UserRole;
import lombok.Data;

import java.util.UUID;

@Data
public class UserAccountDto {

    private UUID userAccountId;
    private String username;
    private UserRole userRole;
    private String email;
}
