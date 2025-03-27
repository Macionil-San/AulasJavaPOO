package com.senai.aula05_polimorfismo.exemplos.exemplo03_Pagamento;

public class CLT extends Pagamento{
    double salario;


    public CLT(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
