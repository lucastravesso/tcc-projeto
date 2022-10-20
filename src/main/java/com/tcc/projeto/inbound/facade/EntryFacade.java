package com.tcc.projeto.inbound.facade;

import com.tcc.projeto.core.domain.entity.Entry;
import com.tcc.projeto.inbound.dto.EntryDTO;

import java.util.UUID;

public interface EntryFacade {

    EntryDTO makeEntry(EntryDTO entry, UUID idUser);

}
