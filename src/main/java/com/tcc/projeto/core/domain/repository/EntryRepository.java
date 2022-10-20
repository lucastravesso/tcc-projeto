package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.Entry;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EntryRepository extends CrudRepository<Entry, UUID> {
}
