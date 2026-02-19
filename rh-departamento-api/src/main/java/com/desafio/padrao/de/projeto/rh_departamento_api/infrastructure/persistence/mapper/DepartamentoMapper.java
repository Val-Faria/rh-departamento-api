package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.mapper;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTOResponse;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.entity.DepartamentoEntity;

public class DepartamentoMapper {

    public static DepartamentoEntity toEntity(DepartamentoDTORequest departamento){
        return DepartamentoEntity.builder().nome(departamento.nome()).build();
    }

    public static DepartamentoDTOResponse toDTO(DepartamentoEntity departamentoEntity) {
        return new DepartamentoDTOResponse(departamentoEntity.getId(),  departamentoEntity.getNome());
    }
}
