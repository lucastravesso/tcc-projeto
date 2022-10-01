package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.inbound.dto.UserDTO;

import java.util.UUID;

public interface UserFacade {

    UserDTO createUser(UserDTO userDTO);

    UserDTO inactiveAccount(UUID id);
}
