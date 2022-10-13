package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.inbound.dto.UserDTO;
import com.tcc.projeto.inbound.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @PostMapping("/inactive")
    public ResponseEntity<?> inactiveUser(@RequestHeader("id") UUID uuid){
        if(uuid != null){
            userFacade.inactiveAccount(uuid);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/update")
    public ResponseEntity<UserDTO> updateteUser(@RequestHeader("id") UUID id, @RequestBody UserDTO userDTO){
        if(userDTO != null) {
            userFacade.updateUser(userDTO, id);
            return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
        }
        return ResponseEntity.status((HttpStatus.BAD_REQUEST)).build();
    }


}
