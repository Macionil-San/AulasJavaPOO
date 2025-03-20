package com.senai.aula02_colecoes.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();  // usando o ArrayList pra criar a lista produtos
        String menu = """
                ________________________________________________
                |  ESCOLHA UMA OPÇÃO:                           |
                |       1 - NOVO PRODUTO                        |
                |       2 - VER PRODUTO                         |           
                |       3 - ADICIONAR AO ESTOQUE                |
                |       4 - TIRAR DO ESTOQUE                    |
                |       5 - SAIR                                |
                |_______________________________________________|
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o \n do nextInt

            switch (opcao) {
                case 1:
                    novoProduto(scanner, produtos);
                    break;
                case 2:
                    exibirEstoque(produtos);
                    break;
                case 3:
                    adicionarEstoque(scanner, produtos);
                    break;
                case 4:
                    removerEstoque(scanner, produtos);
                    break;
                case 5:
                    System.out.println("_____Falow____");
                    break;
                default:
                    System.out.println("não tem essa opção!");
            }
        } while (opcao != 5);
    }

    public static void novoProduto(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("preço do produto:");
        float preco = scanner.nextFloat();
        System.out.println("quantidade no estoque do produto:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  //PARA PULAR PRA PROXIMA LINHAA

        Produto produto = new Produto(nome, preco, quantidade);      //colocar os parametros
        produtos.add(produto);                                     // adicionando para a lista produto com o ArrayList
        System.out.println("produto cadastrado com sucesso");
    }

    public static void exibirEstoque(ArrayList<Produto> produtos) {
        System.out.println("produtos no estoque:");
        for (Produto produto : produtos) {   // for each pra percore toda a lista produto
            System.out.println(produto);
        }
    }

    public static void adicionarEstoque(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("nome do produto pra adicionar ao estoque:");
        String nome = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(nome)) {   //ve se o nome bate com o oque ta na lista
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("quantidade a ser adicionada:");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            produtoEncontrado.quantidade += quantidade;
            System.out.println("quantidade adicionada");
        } else {
            System.out.println("não encontrei no estoque.");
        }
    }

    public static void removerEstoque(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("o nome do produto pra remover do estoque:");
        String nome = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(nome)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("quantidade a ser removida:");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade <= produtoEncontrado.quantidade) {
                produtoEncontrado.quantidade -= quantidade;
                System.out.println("quantidade removida");
            } else {
                System.out.println("Não tem isso tudo pra tirar");
            }
        } else {
            System.out.println("não encontrei no estoque.");
        }
    }
}
