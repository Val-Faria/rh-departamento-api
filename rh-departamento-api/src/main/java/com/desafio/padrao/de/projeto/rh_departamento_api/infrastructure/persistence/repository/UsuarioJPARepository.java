package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.repository;

import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioJPARepository
        extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByEmail(String email);

    List<UsuarioEntity> findByNameContainingIgnoreCase(String name);

    boolean existsByEmail(String email);
}
