package com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTOResponse;

public class DepartamentoMapper {

    public static DepartamentoEntity toEntity(DepartamentoDTORequest departamento){
        return DepartamentoEntity.builder().nome(departamento.nome()).build();
    }

    public static DepartamentoDTOResponse toDTO(DepartamentoEntity departamentoEntity) {
        return new DepartamentoDTOResponse(departamentoEntity.getId(),  departamentoEntity.getNome());
    }
}
