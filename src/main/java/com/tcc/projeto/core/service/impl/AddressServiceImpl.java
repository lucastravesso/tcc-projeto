package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.AddressRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Address createAddress(Address address, UUID id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()){
            address.setActive(true);
            address.setUser(user.get());
            addressRepository.save(address);
            return address;
        }
        return null;

    }

    @Override
    public Address inactiveAccount(UUID id) {
        Optional<User> user = userRepository.findById(id);
        // indepente se achaar o usuario ou nao, ira retornar  status code 200
        // mais a diante seria bom nos pensarmos em uma excessao personalizada
        if (user.isEmpty()) {
            return null;
        }
        Address address = addressRepository.findByUserId(user.get().getId());
        if(address != null){
            address.setActive(false);
            addressRepository.save(address);
        }
        return address;

    }
}
