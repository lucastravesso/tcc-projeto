package com.tcc.projeto.inbound.facade.impl;

import com.tcc.projeto.core.service.BalanceSheetService;
import com.tcc.projeto.inbound.dto.BalanceSheetDTO;
import com.tcc.projeto.inbound.facade.BalanceSheetFacade;
import com.tcc.projeto.inbound.mapper.BalanceSheetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BalanceSheetFacadeImpl implements BalanceSheetFacade {

    @Autowired
    private BalanceSheetService balanceSheetService;

    @Autowired
    private BalanceSheetMapper balanceSheetMapper;

    @Override
    public BalanceSheetDTO createBalanceSheet(UUID idUser) {
        return balanceSheetMapper.toDto(balanceSheetService.createBalanceSheet(idUser));
    }

    @Override
    public List<BalanceSheetDTO> list(UUID idUser) {
        return balanceSheetService.list(idUser).stream().map(balanceSheetMapper::toDto).toList();
    }
}
