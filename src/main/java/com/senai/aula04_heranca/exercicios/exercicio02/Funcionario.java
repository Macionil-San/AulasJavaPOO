package com.senai.aula04_heranca.exercicios.exercicio02;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaDeCargos = {"Professor", "Coordenador", "Outro"};

    public Funcionario(String nome, double salario, int idCargo) {
        if (nome.isBlank()) {
            System.out.println("Nome não pode ser nulo ou  vazio!");
            System.out.println("Nome sera atribuido como vazio");
            this.nome = "Noname";
        } else {
            this.nome = nome;
        }
        if (salario <= 1320.0) {
            System.out.println("Salário muito baixo");
        } else {
            this.salario = salario;
        }

        if (idCargo >= 1 && idCargo <= listaDeCargos.length) {
            this.cargo = listaDeCargos[idCargo - 1];
        } else {
            System.out.println("Cargo inválido!");
            System.out.println("O cargo será atribuído como 'Outro'");
            this.cargo = listaDeCargos[2];
        }
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()){
            System.out.println("Nome invalido!!");
        }else{
            this.nome = nome;
        }
    }

    public double setSalario(double salario) {
        return salario;
    }

    public void getSalario() {
        if (salario <= 1320.0) {
            System.out.println("Salário muito baixo");
        } else {
            this.salario = salario;
        }
    }

    public void aumentarSalario(int pporcentagem){
        if (pporcentagem<=0){
            System.out.println("Numero invalido!");
        }else {
            this.salario += (salario*pporcentagem) / 100;
        }

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(int idCargo) {
       if (idCargo >= 1 && idCargo <= listaDeCargos.length){
           this.cargo = listaDeCargos[idCargo - 1];
            System.out.println("Numero invalido");
        }else {
           System.out.println("Numero invalido");

        }
    }



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

}
