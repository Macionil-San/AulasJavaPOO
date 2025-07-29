package com.senai.aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefas> tarefas = new ArrayList<>();

        String menu =
                """
                         ________________________________________________
                        |  ESCOLHA UMA OPÇÃO:                           |
                        |       1 - ADD TAREFA                          |
                        |       2 - VER TAREFAS                         |           
                        |       3 - MARACAR TAREFA COMO FEITA           |
                        |       4 - REMOVER TAREFA                      |
                        |       5 - SAIR                                |
                        |_______________________________________________|
                        """;


        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner, tarefas);
                    break;
                case 2:
                    exibirTarefas(tarefas);
                    break;
                case 3:
                    marcarConcluido(scanner, tarefas);
                    break;
                case 4:
                    deleteTarefa(scanner, tarefas);
                    break;
                case 5:
                    System.out.println("_____Falow_____");
                    break;
                default:
                    System.out.println("não tem essa opção!");
            }
        } while (opcao != 5);
    }


    public static void adicionarTarefa(Scanner scanner, ArrayList<Tarefas> tarefas) {
        System.out.println("nome do tarefa:");
        String nome = scanner.nextLine();
        System.out.println("status:");
        boolean conclusao = scanner.nextBoolean();
        scanner.nextLine();

        Tarefas tarefa = new Tarefas(nome, conclusao);
        tarefas.add(tarefa);
        System.out.println("tarefa registrada");
    }

    public static void exibirTarefas(ArrayList<Tarefas> tarefas) {
        System.out.println("tarefas:");

        for (Tarefas tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public static void marcarConcluido(Scanner scanner, ArrayList<Tarefas> tarefas) {
        System.out.println("nome da tarefa pra alterar:");
        String nome = scanner.nextLine();

        Tarefas encontrarNaLista = null;
        for (Tarefas tarefa : tarefas) {
            if (tarefa.nome.equalsIgnoreCase(nome)) {
                encontrarNaLista = tarefa;
                break;
            }
        }
        if (encontrarNaLista != null) {
            System.out.println("a terefa foi feita s/n:");
            String trueOrFalse = scanner.nextLine();
            if (Objects.equals(trueOrFalse, "s")) {
                encontrarNaLista.conclusao = true;
                System.out.println("tarefa marcada como concuida");
            } else if (Objects.equals(trueOrFalse, "n")) {
                System.out.println("então essa tarefa permanecera pendente");
            } else {
                System.out.println("não tem essa opção");
            }

        } else {
            System.out.println("não tem essa tarefa.");
        }
    }

    public static void deleteTarefa(Scanner scanner, ArrayList<Tarefas>   arefas) {
        System.out.println("tarefa a remover: ");
        String nome = scanner.nextLine();
        

        System.out.println("tarefa removida com sucesso");
    }

}

