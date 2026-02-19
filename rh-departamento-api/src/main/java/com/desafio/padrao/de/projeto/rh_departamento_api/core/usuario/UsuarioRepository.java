package com.desafio.padrao.de.projeto.rh_departamento_api.core.usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {

    Usuario salvar(Usuario usuario);

    Optional<Usuario> buscarPorEmail(String email);

    List<Usuario> buscarPorNome(String nome);

    boolean existePorEmail(String email);
}
