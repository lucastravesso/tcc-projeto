package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.inbound.dto.AddressDTO;
import com.tcc.projeto.inbound.facade.AddressFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressFacade addressFacade;

    @PostMapping("/create")
    public ResponseEntity<AddressDTO> createUser(@RequestBody AddressDTO addressDTO, @RequestHeader("id") UUID id){
        if(addressDTO != null) {
            addressFacade.createAddress(addressDTO, id);
            return ResponseEntity.status(HttpStatus.CREATED).body(addressDTO);
        }
        return ResponseEntity.status((HttpStatus.BAD_REQUEST)).build();
    }

    @PostMapping("/inactive")
    public ResponseEntity<?> inactiveUser(@RequestHeader("id") UUID uuid){
        if(uuid != null){
            addressFacade.inactiveAccount(uuid);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
