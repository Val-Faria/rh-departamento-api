package com.desafio.padrao.de.projeto.rh_departamento_api.controller.usuario;

public record UsuarioDTORequest(
        Long id,
        String name,
        String email,
        String password
) {}
