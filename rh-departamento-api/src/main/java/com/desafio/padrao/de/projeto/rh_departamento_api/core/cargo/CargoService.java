package com.desafio.padrao.de.projeto.rh_departamento_api.core.cargo;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo.CargoDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo.CargoDTOResponse;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoEntity;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    @Autowired
    private DepartamentoService departamentoService;

    public Optional<CargoEntity> buscarPorNome(String nome){
        return repository.findByNome(nome);
    }

    public boolean existeCargo(String nome){
        return buscarPorNome(nome).isPresent();
    }

    public CargoDTOResponse cadastrar(CargoDTORequest cargo) {
        Optional<DepartamentoEntity> departamento = departamentoService.buscarPorId(cargo.idDepartamento());
        CargoEntity cargoEntity = CargoMapper.toEntity(cargo, departamento.get());
        repository.save(cargoEntity);
        return CargoMapper.toDTO(cargoEntity);
    }

    public boolean existeCargo(CargoDTORequest cargo){
      return  repository.findByNome(cargo.nome()).isPresent();
    }

    public List<CargoDTOResponse> buscarTodos() {
        return repository.findAll()
                .stream()
                .map(CargoMapper::toDTO)
                .collect(Collectors.toList());
    }
}
