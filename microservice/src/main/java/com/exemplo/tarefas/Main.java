package com.exemplo.tarefas;

import com.exemplo.tarefas.model.Tarefa;
import com.exemplo.tarefas.service.TarefaService;

public class Main {
    public static void main(String[] args) {
        TarefaService tarefaService = new TarefaService();

        // Criando e adicionando uma tarefa
        Tarefa tarefa1 = new Tarefa(1L, "Estudar Java", false);
        tarefaService.adicionarTarefa(tarefa1);
        System.out.println("Tarefa adicionada: " + tarefa1);

        // Buscando todas as tarefas
        System.out.println("Todas as tarefas: " + tarefaService.buscarTodasTarefas());

        // Atualizando uma tarefa
        tarefa1.setDescricao("Estudar Spring");
        tarefa1.setConcluida(true);
        tarefaService.atualizarTarefa(tarefa1);
        System.out.println("Tarefa atualizada: " + tarefaService.buscarTarefaPorId(1L).get());

        // Excluindo uma tarefa
        tarefaService.excluirTarefa(1L);
        System.out.println("Tarefas após exclusão: " + tarefaService.buscarTodasTarefas());
    }
}
