package com.desafio.padrao.de.projeto.rh_departamento_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
@ComponentScan
public class RhDepartamentoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhDepartamentoApiApplication.class, args);
	}

}
