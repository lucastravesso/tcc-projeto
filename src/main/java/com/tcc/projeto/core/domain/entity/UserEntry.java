package com.tcc.projeto.core.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "UsuarioEntrada")
public class UserEntry extends AbstractPersistenceDomain {

    @Id
    @Type(type = "uuid-char")
    @Column(name = "IdUsuario")
    private UUID idUser;

    @Id
    @Type(type = "uuid-char")
    @Column(name = "IdEntrada")
    private UUID idEntry;

    @Column(name = "DataCriacao")
    private Date createDate;
}
