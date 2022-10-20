package com.tcc.projeto.core.domain.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UserEntry extends AbstractPersistenceDomain  {

    @Type(type = "uuid-char")
    @Column(name = "IdUsuario")
    private UUID idUser;

    @Type(type = "uuid-char")
    @Column(name = "IdEntrada")
    private UUID idEntry;

    @Column(name = "DataCriacao")
    private Date createDate;
}
