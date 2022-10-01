package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProfileRepository extends CrudRepository<Profile, UUID> {
}
