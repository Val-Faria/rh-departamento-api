package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.adapter;

import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.Usuario;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.UsuarioRepository;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.entity.UsuarioEntity;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.repository.UsuarioJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioJPARepository jpaRepository;

    @Override
    public Usuario salvar(Usuario usuario) {

        UsuarioEntity entity = toEntity(usuario);
        UsuarioEntity savedEntity = jpaRepository.save(entity);

        return toDomain(savedEntity);
    }

    @Override
    public Optional<Usuario> buscarPorEmail(String email) {

        return jpaRepository.findByEmail(email)
                .map(this::toDomain);
    }

    @Override
    public List<Usuario> buscarPorNome(String nome) {

        return jpaRepository.findByNameContainingIgnoreCase(nome)
                .stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public boolean existePorEmail(String email) {
        return jpaRepository.existsByEmail(email);
    }

    // =========================
    // MAPPERS
    // =========================

    private UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(
                usuario.getId(),
                usuario.getName(),
                usuario.getEmail(),
                usuario.getPassword()
        );
    }

    private Usuario toDomain(UsuarioEntity entity) {
        return new Usuario(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPassword()
        );
    }
}
