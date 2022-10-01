package com.tcc.projeto.core.domain.repository;

import com.tcc.projeto.core.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

    User findByEmail(String email);

}
