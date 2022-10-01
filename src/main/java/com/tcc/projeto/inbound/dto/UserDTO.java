package com.tcc.projeto.inbound.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    protected UUID id;

    protected boolean ativo;

    protected String user;

    protected String email;

    protected String password;

    protected String cnpj;
}
