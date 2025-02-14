package com.senai.aula02_colecoes.exemplos.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcus", 17);
        Pessoa pessoa2 = new Pessoa("Ruan", 17);
        Pessoa pessoa3 = new Pessoa("Gabriela", 18);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);
        }

        matrizPessoas[0].falar("AOOOBA!");

        matrizPessoas[3] = new Pessoa("Allan", 19);
        System.out.println(matrizPessoas[3].nome);


        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("Salve! deu certo :)");


        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("Bryan", 17));

        System.out.println("Tamanho da lista: " + listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0, pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);


        System.out.println("lista normal(_________COMEÇO_________)");
        listaPessoas.forEach(System.out::println);   //com esse linha fez o a função do listar
        System.out.println("__________lista normal (FIM)____________");
        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.nome.toLowerCase().contains("LA")).toList();  //ta filtrando pra ver qual da lista tem "la"
                                                                                                        //ta fazendo uma comparação, no caso o >=10
                                                                                                     // se for verdadeiro vai retornar uma lista com pessoas cm idade >=10



        System.out.println("____________lista filtrada(COMEÇO)_____________");
        listaFiltrada.forEach(System.out::println );
        System.out.println("_________lista filtrada(FIM)__________");


        Scanner scanner = new Scanner(System.in);
        System.out.println("preencha as informações a seguir: ");
        System.out.println("nome");
        String nome = scanner.nextLine();
        System.out.println("idade");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome,idade));

        listaPessoas.forEach(System.out::println);
    }

    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("___lista(for each)____");
        for (Pessoa pessoa:lista){
            System.out.println(pessoa);
        }
    }
}

