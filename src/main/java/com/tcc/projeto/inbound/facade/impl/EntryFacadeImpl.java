package com.tcc.projeto.inbound.facade.impl;

import com.tcc.projeto.core.service.EntryService;
import com.tcc.projeto.inbound.dto.EntryDTO;
import com.tcc.projeto.inbound.facade.EntryFacade;
import com.tcc.projeto.inbound.mapper.EntryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EntryFacadeImpl implements EntryFacade {

    @Autowired
    private EntryService entryService;

    @Autowired
    private EntryMapper entryMapper;

    @Override
    public EntryDTO makeEntry(EntryDTO entry, UUID idUser, UUID idBalanceSheet) {
        return entryMapper.toDto(entryService.makeEntry(entryMapper.toEntity(entry), idUser, idBalanceSheet));
    }
}
