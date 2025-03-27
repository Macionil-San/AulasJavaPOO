package com.senai.aula05_polimorfismo.exemplos.exemplo03_Pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();
        listaPagamentos.add(new CLT("juju", 3040));
        listaPagamentos.add(new PJ("ruru", 3, 50));
        listaPagamentos.add(new FreeLancer("baka", 1));

        for (Pagamento p : listaPagamentos) {
            System.out.println(p.getNome() + "recebe: R$: " + p.calcularPagamento());
        }
    }
}
