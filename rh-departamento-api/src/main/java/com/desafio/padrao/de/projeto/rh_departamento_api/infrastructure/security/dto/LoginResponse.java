package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String token;
}