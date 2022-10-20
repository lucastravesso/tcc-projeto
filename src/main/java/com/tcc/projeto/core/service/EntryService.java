package com.tcc.projeto.core.service;

import com.tcc.projeto.core.domain.entity.Entry;

import java.util.UUID;

public interface EntryService {

    Entry makeEntry(Entry entry, UUID idUser);

}
