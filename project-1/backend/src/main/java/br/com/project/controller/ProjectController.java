package br.com.project.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/dados")
@Tag(name = "Dados Controller", description = "Controller para informações de Dados")
public class ProjectController {

    @Operation(summary = "Teste inicial")
    @GetMapping
    public ResponseEntity<String> testeInicial(){
        String response = "Teste realizado com sucesso";
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
