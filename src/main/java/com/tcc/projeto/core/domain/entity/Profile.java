package com.tcc.projeto.core.domain.entity;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "perfis")
public class Profile implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "uuid-char")
    @Column(name = "id_perfil")
    private UUID idProfile;
    @Column(name = "id_nome")
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}