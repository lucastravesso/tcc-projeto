package com.tcc.projeto.core.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Categoria")
public class Category extends AbstractPersistenceDomain {

    @Column(name = "nome")
    private String name;
}
