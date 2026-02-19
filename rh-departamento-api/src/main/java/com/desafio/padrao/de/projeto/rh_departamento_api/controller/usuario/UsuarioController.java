package com.desafio.padrao.de.projeto.rh_departamento_api.controller.usuario;

import com.desafio.padrao.de.projeto.rh_departamento_api.application.service.UsuarioService;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioDTOResponse> criar(
            @Valid @RequestBody UsuarioDTORequest request) {

        Usuario usuario = new Usuario(
                null,
                request.name(),
                request.email(),
                request.password()
        );

        Usuario salvo = service.criarUsuario(usuario);

        UsuarioDTOResponse response = new UsuarioDTOResponse(
                salvo.getId(),
                salvo.getName()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
