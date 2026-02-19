package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.persistence.mapper;

import com.desafio.padrao.de.projeto.rh_departamento_api.controller.usuario.UsuarioDTORequest;
import com.desafio.padrao.de.projeto.rh_departamento_api.controller.usuario.UsuarioDTOResponse;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioMapper {

    private final PasswordEncoder passwordEncoder;

    public Usuario toEntity(UsuarioDTORequest dto) {
        Usuario usuario = new Usuario();
        usuario.setName(dto.name());
        usuario.setPassword(passwordEncoder.encode(dto.password()));
        return usuario;
    }

    public UsuarioDTOResponse toResponse(Usuario usuario) {
        return new UsuarioDTOResponse(
                usuario.getId(),
                usuario.getName()
        );
    }
}
