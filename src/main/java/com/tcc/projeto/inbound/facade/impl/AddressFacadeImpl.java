package com.tcc.projeto.inbound.facade.impl;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.service.AddressService;
import com.tcc.projeto.inbound.dto.AddressDTO;
import com.tcc.projeto.inbound.facade.AddressFacade;
import com.tcc.projeto.inbound.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AddressFacadeImpl implements AddressFacade {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressService addressService;

    @Override
    public AddressDTO createAddress(AddressDTO addressDTO, UUID id) {
        return addressMapper.toDto(addressService.createAddress(addressMapper.toEntity(addressDTO), id));
    }

    @Override
    public AddressDTO updateAddress(AddressDTO addressDTO, UUID id) {
        return addressMapper.toDto(addressService.updateAddress(addressMapper.toEntity(addressDTO), id));
    }
}
