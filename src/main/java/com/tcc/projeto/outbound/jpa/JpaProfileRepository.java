package com.tcc.projeto.outbound.jpa;

import com.tcc.projeto.core.domain.entity.Profile;
import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.ProfileRepository;
import com.tcc.projeto.core.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaProfileRepository extends JpaRepository<Profile, UUID>, ProfileRepository {

}
