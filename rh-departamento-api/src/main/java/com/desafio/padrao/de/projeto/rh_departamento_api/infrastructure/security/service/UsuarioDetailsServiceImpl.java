package com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.security.service;

import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.Usuario;
import com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario.UsuarioRepository;
import com.desafio.padrao.de.projeto.rh_departamento_api.infrastructure.security.adapter.UsuarioUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioDetailsServiceImpl implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository
                .buscarPorEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        return new UsuarioUserDetails(usuario);
    }
}