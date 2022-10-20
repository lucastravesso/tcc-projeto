package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.UserEntry;
import com.tcc.projeto.core.domain.repository.UserEntryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaUserEntryRepository extends JpaRepository<UserEntry, UUID>, UserEntryRepository {

}
