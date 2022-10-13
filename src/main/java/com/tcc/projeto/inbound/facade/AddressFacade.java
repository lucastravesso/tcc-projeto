package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.inbound.dto.AddressDTO;

import java.util.UUID;

public interface AddressFacade {

    AddressDTO createAddress(AddressDTO addressDTO, UUID id);

    AddressDTO inactiveAccount(UUID uuid);
}
