package com.tcc.projeto.inbound.mapper;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.inbound.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO userDTO);

    UserDTO toDto(User user);

}
