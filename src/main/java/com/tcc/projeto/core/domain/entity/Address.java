package com.tcc.projeto.core.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "Endereco")
public class Address extends AbstractPersistenceDomain{

    @Column(name = "place")
    private String logradouro;

    @Column(name = "Complemento")
    private String complement;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "Cidade")
    private String city;

    @Column(name = "Estado")
    private String state;

    @Column(name = "Numero")
    private String number;

    @OneToOne
    private User user;

}
