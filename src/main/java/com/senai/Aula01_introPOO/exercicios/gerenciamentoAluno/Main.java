package com.senai.Aula01_introPOO.exercicios.gerenciamentoAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scaner = new Scanner(System.in);
        String cabecalho[] = {"Nome: ", "Idade: ", "Nota: "};
        String dados[] = new String[3];
        System.out.println("Preencha as informações a seguir: ");

        for (int i = 0; i < cabecalho.length; i++) {
            System.out.print(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }
        Aluno aluno1 = new Aluno(
                dados[0],
                Integer.parseInt((dados[1])),
                Float.parseFloat(dados[2])
        );


        int opcao;
        do {
            System.out.println( """
                ________________________________________________
                |  ESCOLHA UMA OPÇÃO:                           |
                |       1 - Exibir informações                  |
                |       2 - Atualizar informações               |           
                |       3 - Verificar aprovação                 |
                |       4 - Sair                                |
                |_______________________________________________|
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1://exibi
                    System.out.println(aluno1);
                    break;
                case 2://atualiza
                    atualizaNota();
                    break;
                case 3://aprovado ou não
                    verificaAprovacao();
                    break;
                case 4:
                    System.out.println("_____Falow____");
                    break;

                default:
                    System.out.println("não tem essa opção!");
            }
        } while (opcao != 4);
    }

    public static void atualizaNota() {


    }

    public static void verificaAprovacao() {


    }

}