package com.tcc.projeto.inbound.dto;

import com.tcc.projeto.core.domain.entity.Category;
import com.tcc.projeto.core.domain.entity.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDTO {

    private UUID id;

    private Category category;

    private SubCategory subCategory;

    private Date releaseDate;

    private BigDecimal value;

    private String complement;

}
