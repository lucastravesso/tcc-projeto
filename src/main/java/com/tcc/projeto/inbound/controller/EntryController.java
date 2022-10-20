package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.core.exception.EntryException;
import com.tcc.projeto.inbound.dto.EntryDTO;
import com.tcc.projeto.inbound.dto.UserDTO;
import com.tcc.projeto.inbound.facade.EntryFacade;
import com.tcc.projeto.inbound.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private EntryFacade entryFacade;

    @PostMapping("/new")
    private ResponseEntity<EntryDTO> makeEntry(@RequestBody EntryDTO entryDTO,
                                               @RequestHeader(" idUser") UUID idUser){

        if(entryDTO == null || idUser == null){
            throw EntryException.EntryEX001_NullOrEmptyEntry();
        }
        entryFacade.makeEntry(entryDTO, idUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
