package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;
Vai olhar o seus repositórios no github
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Menu
                           1- Cadastrar Usuarios
                           2- Deletar Usuarios
                           3- Atualizar Usuarios
                           4- Exibir Usuarios
                           5- Ligar máquina
                           6- Demitir operador
                           7- Sair
                           """;
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual tipo de usuário?");
            System.out.println("1- Operador");
            System.out.println("2- Supervisor");
            int escolhaTipo = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Preencha os dados a seguir");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if (opController.cadastrarOperador(operador)){
                            System.out.println("Cadastro com sucesso");
                        } else {
                            System.out.println("Não foi possivel cadastrar");
                        }
                    } else if (escolhaTipo == 2) {
                        System.out.print("Área: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);
                    }
                    break;
                case 2:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    System.out.println("Escolha um usuario para deletar");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaTipo == 1)
                        opController.deletarOperador(id);
                    else if (escolhaTipo == 2)
                        supController.deletarSupervisor(id);

                    break;
                case 3:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);

                    System.out.println("Escolha um usuario para atualizar");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.atualizarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        System.out.print("Área: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuario atualizado com sucesso!");
                    break;
                case 4:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        } while (opcao != 7);
    }
}
