package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.BalanceSheet;
import com.tcc.projeto.core.domain.entity.Entry;
import com.tcc.projeto.core.domain.entity.UserEntry;
import com.tcc.projeto.core.domain.repository.BalanceSheetRepository;
import com.tcc.projeto.core.domain.repository.EntryRepository;
import com.tcc.projeto.core.domain.repository.UserEntryRepository;
import com.tcc.projeto.core.exception.BalanceSheetException;
import com.tcc.projeto.core.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private UserEntryRepository userEntryRepository;

    @Autowired
    private BalanceSheetRepository balanceSheetRepository;

    @Override
    public Entry makeEntry(Entry entry, UUID idUser, UUID idBalanceSheet) {
        Optional<BalanceSheet> balanceSheet = balanceSheetRepository.findById(idBalanceSheet);
        if (balanceSheet.isEmpty()){
            throw BalanceSheetException.BalanceSheetEX001_NullOrEmptyResult(idBalanceSheet);
        }
        entry.setActive(true);
        entry.setReleaseDate(new Date());
        entry.setIdBalanceSheet(idBalanceSheet);
        Entry persistenceEntry = entryRepository.save(entry);
        userEntryRepository.save(UserEntry.builder().idEntry(persistenceEntry.getId()).idUser(idUser).build());
        return entry;
    }
}
