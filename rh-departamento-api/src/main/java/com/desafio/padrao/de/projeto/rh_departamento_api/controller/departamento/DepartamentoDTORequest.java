package com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento;

import jakarta.validation.constraints.NotBlank;

public record DepartamentoDTORequest(

        @NotBlank(message = "O nome não pode estar em branco")
        String nome){}
