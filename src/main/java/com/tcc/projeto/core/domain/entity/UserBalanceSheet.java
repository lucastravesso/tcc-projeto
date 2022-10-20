package com.tcc.projeto.core.domain.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UserBalanceSheet extends AbstractPersistenceDomain  {

    @Type(type = "uuid-char")
    @Column(name = "IdUsuario")
    private UUID idUser;

    @Type(type = "uuid-char")
    @Column(name = "IdBalancoPatrimonial")
    private UUID idBalanceSheet;

    @Column(name = "DataCriacao")
    private Date createDate;
}
