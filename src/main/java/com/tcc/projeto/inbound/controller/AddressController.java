package com.tcc.projeto.inbound.controller;

import com.tcc.projeto.inbound.facade.AddressFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressFacade addressFacade;
}
