package com.tcc.projeto.inbound.facade.impl;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.service.UserService;
import com.tcc.projeto.inbound.dto.UserDTO;
import com.tcc.projeto.inbound.facade.UserFacade;
import com.tcc.projeto.inbound.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return userMapper.toDto(userService.creatUser(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO inactiveAccount(UUID id) {
        return userMapper.toDto(userService.inactiveAccount(id));
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, UUID id) {
        User user = userMapper.toEntity(userDTO);

        return userMapper.toDto(userService.updateUser(user, id));
    }
}
