package com.tcc.projeto.inbound.dto;

import com.tcc.projeto.core.domain.entity.AbstractPersistenceDomain;
import com.tcc.projeto.core.domain.entity.Category;
import com.tcc.projeto.core.domain.entity.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EntryDTO extends AbstractPersistenceDomain {

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
