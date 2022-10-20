package com.tcc.projeto.core.service.impl;

import com.tcc.projeto.core.domain.entity.Entry;
import com.tcc.projeto.core.domain.entity.UserEntry;
import com.tcc.projeto.core.domain.repository.EntryRepository;
import com.tcc.projeto.core.domain.repository.UserEntryRepository;
import com.tcc.projeto.core.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private UserEntryRepository userEntryRepository;

    @Override
    public Entry makeEntry(Entry entry, UUID idUser) {
        Entry persistenceEntry = entryRepository.save(entry);
        userEntryRepository.save(UserEntry.builder().idEntry(persistenceEntry.getId()).idUser(idUser).build());
        return entry;
    }
}
