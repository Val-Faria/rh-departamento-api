package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.repository;

import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.entity.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Long> {
    Optional<DepartamentoEntity> findByNome(String nome);
}
