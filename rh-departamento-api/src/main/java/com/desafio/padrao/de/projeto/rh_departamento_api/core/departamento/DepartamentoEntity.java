package com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "departamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do departamento é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @Column(nullable = false, unique = true)
    private String nome;

//    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<CargoEntidade> cargos;
}
