package com.tcc.projeto.inbound.dto;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntryDTO {

    private UUID id;

    private UUID idUser;

    private UUID idEntry;

    private Date createDate;
}
