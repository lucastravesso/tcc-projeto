package com.tcc.projeto.core.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncoderService {

    @Autowired
    private PasswordEncoder passEncoder;

    public String encoder(String value) {
        return this.passEncoder.encode(value);
    }

    public boolean verifyPassword(CharSequence rawPassword, String encodedPassword) {
        return passEncoder.matches(rawPassword, encodedPassword);
    }


}