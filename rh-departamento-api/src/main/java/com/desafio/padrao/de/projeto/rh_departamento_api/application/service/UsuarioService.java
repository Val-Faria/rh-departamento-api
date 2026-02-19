package com.desafio.padrao.de.projeto.rh_departamento_api.application.service;

import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.Usuario;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario criarUsuario(Usuario usuario) {

        if (usuarioRepository.existePorEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        // 🔐 Criptografa a senha antes de salvar
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        return usuarioRepository.salvar(usuario);
    }
}
