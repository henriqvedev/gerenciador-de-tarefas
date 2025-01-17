package com.exemplo.tarefas.repository;

import com.exemplo.tarefas.model.Tarefa;
import java.util.List;
import java.util.Optional;

public interface TarefaRepository {
    void salvar(Tarefa tarefa);
    Optional<Tarefa> buscarPorId(Long id);
    List<Tarefa> buscarTodas();
    void atualizar(Tarefa tarefa);
    void deletar(Long id);
}
