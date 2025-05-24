package com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Long> {
    Optional<DepartamentoEntity> findByNome(String nome);
}
