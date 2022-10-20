package com.tcc.projeto.inbound.mapper;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.inbound.dto.BalanceSheetDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BalanceSheetMapper {

    BalanceSheet toEntity(BalanceSheetDTO balanceSheetDTO);

    BalanceSheetDTO toDto(BalanceSheet balanceSheet);
}
