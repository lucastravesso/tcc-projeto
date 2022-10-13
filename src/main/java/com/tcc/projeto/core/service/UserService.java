package com.tcc.projeto.core.service;

import com.tcc.projeto.core.domain.entity.User;

import java.util.UUID;

public interface UserService {

    User creatUser(User user);

    User inactiveAccount(UUID id);

    User updateUser(User user, UUID id);
}
