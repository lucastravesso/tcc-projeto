package com.tcc.projeto.core.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "BalancoPatrimonial")
public class BalanceSheet extends AbstractPersistenceDomain{

    @Column(name = "PassivoCirculante")
    private Double currentAssets;

    @Column(name = "PassivoNaoCirculante")
    private Double nonCurrentAssets;

    @Column(name = "AtivoCirculante")
    private Double currentLiabilities;

    @Column(name = "AtivoNaoCirculante")
    private Double nonCurrentLiabilities;

    @Column(name = "PatrimonioLiquido")
    private Double netWorth;

}
