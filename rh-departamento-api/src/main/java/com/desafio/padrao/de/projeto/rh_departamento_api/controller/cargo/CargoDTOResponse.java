package com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTOResponse;

import java.math.BigDecimal;

public record CargoDTOResponse(String nome, String descricao, BigDecimal salarioBase, DepartamentoDTOResponse departamento){}
