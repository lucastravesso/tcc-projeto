package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.entity.UserTokenDetails;
import com.tcc.projeto.core.service.impl.TokenService;
import com.tcc.projeto.inbound.dto.TokenDTO;
import com.tcc.projeto.inbound.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private AuthenticationService authService;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<TokenDTO> authenticate(@RequestBody User form) {

        UsernamePasswordAuthenticationToken dadosLogin = form.converter();

        try {
            Authentication authentication = authManager.authenticate(dadosLogin);
            String token = tokenService.generateToken(authentication);
            return ResponseEntity.ok(new TokenDTO(token, "Bearer"));
        } catch (AuthenticationException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/search/{mail}")
    public ResponseEntity<UserDetails> searchMail(@PathVariable("mail") String mail){
        return authService.searchMail(mail);
    }

    @GetMapping(value ="/me")
    public UserTokenDetails getCurrent() {
        return authService.getCurrent();
    }

}