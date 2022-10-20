package com.tcc.projeto.inbound.mapper;

import com.tcc.projeto.core.domain.entity.Entry;
import com.tcc.projeto.inbound.dto.EntryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntryMapper {

    Entry toEntity(EntryDTO entryDTO);

    EntryDTO toDto(Entry entry);
}
