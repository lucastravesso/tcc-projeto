package com.tcc.projeto.core.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "categoria")
public class SubCategory extends AbstractPersistenceDomain {

    @Column(name = "nome")
    private String name;
}
