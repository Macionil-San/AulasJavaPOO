package com.senai.Aula01_introPOO.Exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa("Rafael", 40, 1.75F,"Rua Senai 128");

        System.out.println(pessoa01.nome + " ," + pessoa01.idade + ", " + pessoa01.altura + ", " + pessoa01.endereco);
    }
}
