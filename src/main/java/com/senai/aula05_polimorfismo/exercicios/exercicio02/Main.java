package com.senai.aula05_polimorfismo.exercicios.exercicio02;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new ReservaSimples("juju", 300, 50, 3, 0, 100);
        Reserva reserva1 = new ReservaVip("ruru", 2000, 200, 2, 0, 200);

        System.out.println("reserva simples:r$ " + reserva.calcularReserva());
        System.out.println("reserva VIP: r$ " + reserva1.calcularReserva());
    }
}
