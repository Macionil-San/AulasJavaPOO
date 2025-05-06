package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();


        String menu = """
                |             Menu               |
                | 1 - Cadastrar usuário          |
                | 2 - Deletar usuário            |
                | 3 - Atualizar usuário          |
                | 4 - Exibir usuários            |
                | 5 - Ligar máquina              |
                | 6 - Demitir operador           |
                | 7 - Sair                       |
                """;

        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Que tipo de usuário você deseja cadastrar?");
                    System.out.println("1 - Operador");
                    System.out.println("2 - Surpevisor");
                    int escolhaTipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Preencha os dados a seguir:");
                    System.out.print("id:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.println("Setor: ");                                                //cadastro operado
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if (opController.cadastrarOperador(operador)) {
                            System.out.println("Cadastrado com sucesso!");
                        } else {
                            System.out.println("Não foi possivel cadastrar!");
                        }

                    } else if (escolhaTipo == 2) {
                        System.out.println("Area:");                                             //cadastro superviso
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if (supController.cadastrarSupervisor(supervisor)) {
                            System.out.println("Cadastrado com sucesso");
                        } else {
                            System.out.println("Não foi possivel cadastrar");
                        }

                    } else {
                        System.out.println("Opção inválida");
                    }

                    break;

                case 2:  //deletar
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2) {
                        supController.listarSurpevisores().foreach(System.out::println);
                        System.out.println("escolha um usuario por id para deletar: ");
                        id = scanner.nextInt();
                        scanner.nextLine();

                        if (escolhaTipo == 1) {
                            opController.deletarOperador(id);
                        } else if (opController == 2) {
                            supController.deletarSupervisor(id);
                        } else {
                            System.out.println("ínvalido");
                        }

                    }

                    break;

                case 3: // atualizar
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2) {
                        supController.listarSurpevisores().foreach(System.out::println);
                        System.out.println("escolha um usuario por id para Atualizar: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Atualize as seguintes informações: ");
                        System.out.println("Nome: ");
                        scanner.nextLine();

                        if (escolhaTipo == 1) {
                            System.out.println("Setor: ");
                            String setor = scanner.nextLine();
                            Operador operador = new Operador(nome, id, setor);
                            OperadorController.atualizarOperador(operador);
                        } else if (escolhaTipo == 2) {
                            System.out.println("Area: ");
                            String Area = scanner.nextLine();
                            Supervisor supervisor = new Operador(nome, id, area);
                            OperadorController.atualizarSupervisor(Supervisor);
                        }
                        System.out.println("Usuario atualizado com sucesso!");
                        break;

                        case 4:  //exibir
                            if (escolhaTipo == 1) {
                                opController.listarOperadores().forEach(System.out::println);
                            } else if (escolhaTipo == 2) {
                                supController.listarSupervisores().forEach(System.out::println);
                            }

                            break;

                        case 5:
                            break;

                        case 6:
                            break;

                        case 7:
                            System.out.println("Faloow...");
                            scanner.close();
                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;

                    }

            }
            while (opcao != 7) ;
        }

    }
