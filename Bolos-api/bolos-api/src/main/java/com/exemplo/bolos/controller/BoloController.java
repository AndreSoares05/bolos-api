package com.exemplo.bolos.controller;

import com.exemplo.bolos.model.Bolo;
import com.exemplo.bolos.service.BoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller: recebe as requisicoes HTTP e delega o trabalho para o Service.
@RestController
@RequestMapping("/bolos")
public class BoloController {

    @Autowired
    private BoloService boloService;

    //  lista todos os bolos cadastrados
    @GetMapping
    public List<Bolo> listar() {
        return boloService.buscarTodos();
    }

    // cadastra um novo bolo
    @PostMapping
    public Bolo cadastrar(@RequestBody Bolo bolo) {
        return boloService.cadastrar(bolo);
    }
}
