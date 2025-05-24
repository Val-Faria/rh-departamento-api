package com.desafio.padrao.de.projeto.rh_departamento_api.core.cargo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, UUID> {
    Optional<CargoEntity> findByNome(String nome);
}
