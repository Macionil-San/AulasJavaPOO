package com.senai.aula06_abstracao.exercicios.exercicio01;

import java.util.Scanner;
public class Gol implements CheFky{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void validarDocumento() {
        String dados;
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        dados = scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        dados = dados + "\n" + scanner.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        dados = dados + "\n" + scanner.nextLine();

        mensagemDadosValidados(dados);
    }

    @Override
    public void emitirCartaoEmbarque() {
        System.out.println("Cartão de embarque GOL emitido com sucesso!");
    }

    @Override
    public void realizarCheckIn() {

    }
}
