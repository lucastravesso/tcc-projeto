package com.tcc.projeto.core.service;

import com.tcc.projeto.core.domain.entity.Address;

import java.util.UUID;

public interface AddressService {

    Address  createAddress(Address address, UUID id);
}
