package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.Profile;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.AddressRepository;
import com.tcc.projeto.core.domain.repository.ProfileRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.UserService;
import com.tcc.projeto.core.verifier.Validate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private EncoderService eService;

    @Override
    public User creatUser(User user) {
        user.setActive(true);

        user.setPassword(eService.encoder(user.getPassword()).toString());

        List<Profile> profile = (List<Profile>) profileRepository.findAll();
        Set<Profile> role = profile.stream().filter(p -> p.getName().equals("NORMAL"))
                .collect(Collectors.toSet());
        user.setProfiles(role);

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
        userRepository.save(user.get());
        return user.get();
    }

    @Override
    public User updateUser(User user, UUID id) {
        Optional<User> userFound = userRepository.findById(id);
        if (userFound.isPresent()) {
            if (Validate.verificaAtributo(user.getUser())) userFound.get().setUser(user.getUser());
            if (Validate.verificaAtributo(user.getCnpj())) userFound.get().setCnpj(user.getCnpj());
            if (Validate.verificaAtributo(user.getEmail())) userFound.get().setEmail(user.getEmail());
            return userRepository.save(userFound.get());
        }
        return null;
    }


}
