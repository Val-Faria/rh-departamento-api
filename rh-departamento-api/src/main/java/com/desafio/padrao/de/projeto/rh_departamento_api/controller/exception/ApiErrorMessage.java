package com.desafio.padrao.de.projeto.rh_departamento_api.controller.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.Arrays;
import java.util.List;
@Data
public class ApiErrorMessage {

    private HttpStatusCode status;
    private List<String> errors;

    public ApiErrorMessage(HttpStatusCode status, List<String> errors) {
        super();
        this.status = status;
        this.errors = errors;
    }

    public ApiErrorMessage(HttpStatusCode status, String error) {
        super();
        this.status = status;
        errors = Arrays.asList(error);
    }

}