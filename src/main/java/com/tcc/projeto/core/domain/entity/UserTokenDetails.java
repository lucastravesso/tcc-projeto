package com.tcc.projeto.core.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenDetails {

    private UUID id;
    private String email;
    private Set<Profile> profiles;
    private boolean isEnabled;
}