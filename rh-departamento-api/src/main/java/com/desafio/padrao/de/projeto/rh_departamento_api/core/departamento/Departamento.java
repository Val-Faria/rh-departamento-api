package com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {
    private Long id;
    private String nome;
    private String sigla;
}