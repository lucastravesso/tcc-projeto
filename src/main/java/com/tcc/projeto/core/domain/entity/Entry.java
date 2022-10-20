package com.tcc.projeto.core.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Entrada")
public class Entry extends AbstractPersistenceDomain {

    private Category category;

    private SubCategory subCategory;

    @Column(name = "data")
    private Date releaseDate;

    @Column(name = "valor")
    private BigDecimal value;

    @Column(name = "complemento")
    private String complement;

    @Column(name = "idBalancoPatrimonial")
    private UUID idBalanceSheet;

}
