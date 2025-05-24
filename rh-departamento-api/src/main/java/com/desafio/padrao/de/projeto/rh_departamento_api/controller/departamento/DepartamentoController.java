package com.desafio.padrao.de.projeto.rh_departamento_api.controller.departamento;

import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public List<DepartamentoDTOResponse> listar() {
        return departamentoService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DepartamentoDTORequest departamento) {
        if (departamentoService.existeDepartamento(departamento.nome())) {
            return ResponseEntity.badRequest().body("Já existe um departamento com esse nome.");
        }
        DepartamentoDTOResponse salvo = departamentoService.cadastrar(departamento);
        return ResponseEntity.status(201).body(salvo);
    }
}
