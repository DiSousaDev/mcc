package br.dev.diego.mcc.controllers;

import br.dev.diego.mcc.controllers.dtos.RetiroDTO;
import br.dev.diego.mcc.services.RetiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/retiros")
public class RetiroController {

    @Autowired
    private RetiroService service;

    @GetMapping
    public ResponseEntity<List<RetiroDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
