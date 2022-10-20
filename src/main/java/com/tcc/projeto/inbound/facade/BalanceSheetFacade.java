package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.inbound.dto.BalanceSheetDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

public interface BalanceSheetFacade {

    BalanceSheetDTO createBalanceSheet(UUID idUser);
}
