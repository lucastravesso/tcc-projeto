package com.tcc.projeto.core.service;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public interface BalanceSheetService {

    BalanceSheet createBalanceSheet(UUID idUser);

    List<BalanceSheet> list(UUID idUser);
}
