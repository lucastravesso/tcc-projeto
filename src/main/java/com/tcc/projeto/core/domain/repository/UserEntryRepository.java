package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.UserEntry;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserEntryRepository extends CrudRepository<UserEntry, UUID> {
}
