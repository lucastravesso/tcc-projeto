package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.AddressRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaAddressRepository extends JpaRepository<Address, UUID>, AddressRepository {

    @Query("SELECT a FROM Address a WHERE a.user.id = :id")
    Address findByUserId(UUID id);
}
