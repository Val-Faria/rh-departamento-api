package com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo;

import java.math.BigDecimal;

public record CargoDTORequest(String nome, String descricao, BigDecimal salarioBase, Long idDepartamento){}
