package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaUserRepository extends JpaRepository<User, UUID>, UserRepository {
}
