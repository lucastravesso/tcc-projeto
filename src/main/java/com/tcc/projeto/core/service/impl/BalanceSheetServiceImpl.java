package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.core.domain.entity.UserBalanceSheet;
import com.tcc.projeto.core.domain.repository.BalanceSheetRepository;
import com.tcc.projeto.core.domain.repository.UserBalanceSheetRepository;
import com.tcc.projeto.core.service.BalanceSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BalanceSheetServiceImpl implements BalanceSheetService {

    @Autowired
    private BalanceSheetRepository balanceSheetRepository;

    @Autowired
    private UserBalanceSheetRepository userBalanceSheetRepository;

    @Override
    public BalanceSheet createBalanceSheet(UUID idUser){
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.setActive(true);
        BalanceSheet toTakeId = balanceSheetRepository.save(balanceSheet);
        userBalanceSheetRepository.save(UserBalanceSheet.builder().idBalanceSheet(toTakeId.getId()).idUser(idUser).build());
        return toTakeId;
    }
}
