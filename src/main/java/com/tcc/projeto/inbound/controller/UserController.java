package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.inbound.dto.UserDTO;
import com.tcc.projeto.inbound.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        if(userDTO != null) {
            userFacade.createUser(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
        }
        return ResponseEntity.status((HttpStatus.BAD_REQUEST)).build();
    }


}
