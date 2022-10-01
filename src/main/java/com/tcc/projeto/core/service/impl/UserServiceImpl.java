package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.AddressRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public User creatUser(User user) {
        user.setActive(true);
        return userRepository.save(user);
    }

    public User inactiveAccount(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            return null;
        }
        user.get().setActive(false);
        Address address = addressRepository.findByUserId(user.get().getId());
        if(address != null){
            address.setActive(false);
            addressRepository.save(address);
        }
        return user.get();
    }

}
