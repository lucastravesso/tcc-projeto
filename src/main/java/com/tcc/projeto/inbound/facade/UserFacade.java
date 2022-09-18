package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.inbound.dto.UserDTO;

public interface UserFacade {

    UserDTO createUser(UserDTO userDTO);
}
