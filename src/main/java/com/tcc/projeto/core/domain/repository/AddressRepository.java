package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {

    Address findByUserId(UUID uuid);
}
