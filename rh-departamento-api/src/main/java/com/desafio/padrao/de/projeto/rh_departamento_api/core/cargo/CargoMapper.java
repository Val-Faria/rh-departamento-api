package com.desafio.padrao.de.projeto.rh_departamento_api.core.cargo;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo.CargoDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo.CargoDTOResponse;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoEntity;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoMapper;

public class CargoMapper {

    public static CargoEntity toEntity(CargoDTORequest cargo, DepartamentoEntity departamentoEntity){
        return CargoEntity.builder()
                .nome(cargo.nome())
                .descricao(cargo.descricao())
                .salarioBase(cargo.salarioBase())
                .departamento(departamentoEntity)
                .build();
    }
    public static CargoDTOResponse toDTO(CargoEntity cargo) {
        return new CargoDTOResponse(cargo.getNome(), cargo.getDescricao(), cargo.getSalarioBase(), DepartamentoMapper.toDTO(cargo.getDepartamento()));
    }
}
