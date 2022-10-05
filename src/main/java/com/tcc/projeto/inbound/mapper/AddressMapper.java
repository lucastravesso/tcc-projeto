package com.tcc.projeto.inbound.mapper;

import com.tcc.projeto.core.domain.entity.Address;
import com.tcc.projeto.inbound.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressDTO addressDTO);

    AddressDTO toDto(Address address);
}
