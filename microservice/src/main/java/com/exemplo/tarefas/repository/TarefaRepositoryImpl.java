package com.exemplo.tarefas.repository;

import com.exemplo.tarefas.model.Tarefa;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TarefaRepositoryImpl implements TarefaRepository {

    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefas.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    @Override
    public List<Tarefa> buscarTodas() {
        return tarefas;
    }

    @Override
    public void atualizar(Tarefa tarefa) {
        tarefas.stream()
                .filter(t -> t.getId().equals(tarefa.getId()))
                .findFirst()
                .ifPresent(t -> {
                    t.setDescricao(tarefa.getDescricao());
                    t.setConcluida(tarefa.isConcluida());
                });
    }

    @Override
    public void deletar(Long id) {
        tarefas.removeIf(t -> t.getId().equals(id));
    }
}
