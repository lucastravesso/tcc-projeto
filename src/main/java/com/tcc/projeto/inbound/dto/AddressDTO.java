package com.tcc.projeto.inbound.dto;


import com.tcc.projeto.core.domain.entity.AbstractPersistenceDomain;
import com.tcc.projeto.core.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AddressDTO {

    protected UUID id;

    private String logradouro;

    private String complement;

    private String cep;

    private String city;

    private String state;

    private String number;

    private User user;

}
