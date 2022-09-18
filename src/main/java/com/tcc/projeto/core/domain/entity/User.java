package com.tcc.projeto.core.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "Usuario")
public class User extends AbstractPersistenceDomain {

    @Column(name = "Usuario")
    protected String user;

    @Column(name = "Senha")
    protected String password;

    @Column(name = "Cnpj")
    protected String cnpj;

}
