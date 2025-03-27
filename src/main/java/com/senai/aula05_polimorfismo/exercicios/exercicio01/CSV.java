package com.senai.aula05_polimorfismo.exercicios.exercicio01;

public class CSV extends Relatorio {

        @Override
        public void gerarRelatorio() {
            System.out.println("Relatório gerado em CSV");
        }
    }

