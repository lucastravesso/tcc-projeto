package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.AddressRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.AddressService;
import com.tcc.projeto.core.verifier.Validate;
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
    public Address updateAddress(Address address, UUID id) {

        Optional<Address> addressFound = addressRepository.findById(id);
        if (addressFound.isPresent()) {
            if (Validate.verificaAtributo(address.getCep())) addressFound.get().setCep(address.getCep());
            if (Validate.verificaAtributo(address.getCity())) addressFound.get().setCity(address.getCity());
            if (Validate.verificaAtributo(address.getComplement())) addressFound.get().setComplement(address.getComplement());
            if (Validate.verificaAtributo(address.getLogradouro())) addressFound.get().setLogradouro(address.getLogradouro());
            if (Validate.verificaAtributo(address.getNumber())) addressFound.get().setNumber(address.getNumber());
            if (Validate.verificaAtributo(address.getState())) addressFound.get().setState(address.getState());
            return addressRepository.save(addressFound.get());
        }
        return null;
    }
}
