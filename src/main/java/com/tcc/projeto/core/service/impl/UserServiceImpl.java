package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository repository;
    @Override
    public User creatUser(User user) {
        return repository.save(user);
    }
}
