package com.du.tery.mappers;

import com.du.tery.dtos.UserAccountDto;
import com.du.tery.model.UserAccount;
import org.mapstruct.Mapper;

@Mapper
public interface UserAccountMapper {
    UserAccountDto userAccountToUserAccountDto(UserAccount userAccount);

    UserAccount userAccountDtoToUserAccount(UserAccountDto userAccountDto);
}