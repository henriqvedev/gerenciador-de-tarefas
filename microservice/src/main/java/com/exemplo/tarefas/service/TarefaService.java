package com.exemplo.tarefas.service;

import com.exemplo.tarefas.model.Tarefa;
import com.exemplo.tarefas.repository.TarefaRepository;
import com.exemplo.tarefas.repository.TarefaRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class TarefaService {

    private TarefaRepository tarefaRepository;

    public TarefaService() {
        this.tarefaRepository = new TarefaRepositoryImpl(); // Usando a implementação simples com lista
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefaRepository.salvar(tarefa);
    }

    public Optional<Tarefa> buscarTarefaPorId(Long id) {
        return tarefaRepository.buscarPorId(id);
    }

    public List<Tarefa> buscarTodasTarefas() {
        return tarefaRepository.buscarTodas();
    }

    public void atualizarTarefa(Tarefa tarefa) {
        tarefaRepository.atualizar(tarefa);
    }

    public void excluirTarefa(Long id) {
        tarefaRepository.deletar(id);
    }
}
