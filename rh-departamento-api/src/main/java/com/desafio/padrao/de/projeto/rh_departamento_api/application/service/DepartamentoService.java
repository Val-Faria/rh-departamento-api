package com.desafio.padrao.de.projeto.rh_departamento_api.application.service;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento.DepartamentoDTOResponse;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.mapper.DepartamentoMapper;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.entity.DepartamentoEntity;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    public Optional<DepartamentoEntity> buscarPorNome(String nome){
        return repository.findByNome(nome);
    }

    public boolean existeDepartamento(String nome){
        return buscarPorNome(nome).isPresent();
    }

    public boolean existeDepartamento(Long id){
        return buscarPorId(id).isPresent();
    }
    public Optional<DepartamentoEntity> buscarPorId(Long id){
        return repository.findById(id);
    }

    public DepartamentoDTOResponse cadastrar(DepartamentoDTORequest departamento) {
        DepartamentoEntity departamentoEntity = DepartamentoMapper.toEntity(departamento);
        repository.save(departamentoEntity);
        return DepartamentoMapper.toDTO(departamentoEntity);
    }

    public List<DepartamentoDTOResponse> buscarTodos() {
        return repository.findAll()
                .stream()
                .map(departamentoEntity -> DepartamentoMapper.toDTO(departamentoEntity))
                .collect(Collectors.toList());
    }
}
