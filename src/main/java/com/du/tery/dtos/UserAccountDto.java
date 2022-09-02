package com.du.tery.dtos;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class UserAccountDto {

    private String userAccountId;

    @NotNull
    private String username;

    private String email;

    @NotNull
    private String password;

}
