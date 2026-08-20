package com.exemplo.bolos.service;

import com.exemplo.bolos.model.Bolo;
import com.exemplo.bolos.repository.BoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service: concentra as regras da aplicacao.
// O Controller nao fala direto com o Repository, sempre passa pelo Service.
@Service
public class BoloService {

    @Autowired
    private BoloRepository boloRepository;

    public List<Bolo> buscarTodos() {
        return boloRepository.listarTodos();
    }

    public Bolo cadastrar(Bolo bolo) {
        return boloRepository.salvar(bolo);
    }
}
