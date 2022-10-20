package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.core.exception.EntryException;
import com.tcc.projeto.inbound.dto.BalanceSheetDTO;
import com.tcc.projeto.inbound.dto.EntryDTO;
import com.tcc.projeto.inbound.facade.BalanceSheetFacade;
import com.tcc.projeto.inbound.facade.EntryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/balancesheet")
public class BalanceSheetController {

    @Autowired
    private BalanceSheetFacade balanceSheetFacade;

    @PostMapping("/create")
    private ResponseEntity<BalanceSheetDTO> createBalanceSheet(@RequestHeader("idUser") UUID idUser){
        if(idUser == null){
            throw EntryException.EntryEX001_NullOrEmptyEntry();
        }
        balanceSheetFacade.createBalanceSheet(idUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
