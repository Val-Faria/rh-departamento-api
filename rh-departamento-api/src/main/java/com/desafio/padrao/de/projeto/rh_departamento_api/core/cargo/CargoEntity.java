package com.desafio.padrao.de.projeto.rh_departamento_api.core.cargo;

import com.desafio.padrao.de.projeto.rh_departamento_api.core.departamento.DepartamentoEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cargos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CargoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "O nome do cargo é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @Column(unique = true, nullable = false)
    private String nome;

    @Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
    private String descricao;

    @NotNull(message = "O salário base é obrigatório")
    @DecimalMin(value = "1320.00", inclusive = true, message = "O salário base deve ser no mínimo R$1.320,00")
    @Column(nullable = false)
    private BigDecimal salarioBase;

    @ManyToOne(optional = false)
    @JoinColumn(name = "departamento_id", nullable = false)
    private DepartamentoEntity departamento;
}
