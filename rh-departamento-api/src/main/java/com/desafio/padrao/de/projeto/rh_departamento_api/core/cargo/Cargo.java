package com.desafio.padrao.de.projeto.rh_departamento_api.core.cargo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cargo {
    private Long id;
    private String nome;
    private Double salario;
}