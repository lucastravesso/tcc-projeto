package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.inbound.dto.BalanceSheetDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

public interface BalanceSheetFacade {

    BalanceSheetDTO createBalanceSheet(UUID idUser);

    List<BalanceSheetDTO> list(UUID idUser);
}
