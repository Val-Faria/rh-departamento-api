package com.desafio.padrao.de.projeto.rh_departamento_api.controller.cargo;

import com.desafio.padrao.de.projeto.rh_departamento_api.application.service.CargoService;
import com.desafio.padrao.de.projeto.rh_departamento_api.application.service.DepartamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cargo")
@Tag(name = "Cargos", description = "Operações relacionadas aos cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;
    @Autowired
    private DepartamentoService departamentoService;

    @Operation(summary = "Listar todos os cargos")
    @ApiResponse(responseCode = "200", description = "Lista de cargos retornada com sucesso")
    @GetMapping
    public List<CargoDTOResponse> listar() {
        return cargoService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody @Valid CargoDTORequest cargo) {

        if (cargoService.existeCargo(cargo.nome())) {
            return ResponseEntity.badRequest().body("Já existe um cargo com esse nome.");
        }
        if (!departamentoService.existeDepartamento(cargo.idDepartamento())) {
            return ResponseEntity.badRequest().body("Não foi possivel encontrar o departamento com id: " + cargo.idDepartamento());
        }

        CargoDTOResponse salvo = cargoService.cadastrar(cargo);
        return ResponseEntity.status(201).body(salvo);
    }

}
