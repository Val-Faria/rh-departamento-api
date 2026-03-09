package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.security.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}