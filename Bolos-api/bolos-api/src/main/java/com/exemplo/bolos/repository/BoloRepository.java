package com.exemplo.bolos.repository;

import com.exemplo.bolos.model.Bolo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Repository: responsavel por guardar e recuperar os dados.
// Aqui usamos uma lista em memoria (sem banco de dados
@Repository
public class BoloRepository {

    private final List<Bolo> bolos = new ArrayList<>();
    private Long proximoId = 1L;

    public List<Bolo> listarTodos() {
        return bolos;
    }

    public Bolo salvar(Bolo bolo) {
        bolo.setId(proximoId);
        proximoId++;
        bolos.add(bolo);
        return bolo;
    }
}
