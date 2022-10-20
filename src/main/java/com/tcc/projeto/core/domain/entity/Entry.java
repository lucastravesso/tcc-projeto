package com.tcc.projeto.core.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "lancamento")
public class Entry extends AbstractPersistenceDomain {

    @OneToOne
    private Category category;

    @OneToOne
    private SubCategory subCategory;

    @Column(name = "data")
    private Date releaseDate;

    @Column(name = "valor")
    private BigDecimal value;

    @Column(name = "complemento")
    private String complement;

}
