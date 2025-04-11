package com.senai.aula06_abstracao.exemplos.exemplo_Controle_Equipamento;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new TVSmart());
        testarAparelhos(new LampadaInteligente());
    }
    public static void testarAparelhos(AparelhosInteligentes aparelhosInteligentes){
        System.out.printf("------ teste %s-----\n", aparelhosInteligentes.getClass().getSimpleName());
        aparelhosInteligentes.ligar();
        if(aparelhosInteligentes instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
        } else if (aparelhosInteligentes instanceof  TVSmart tvsmart) {
            tvsmart.aumentarVolume();
            tvsmart.aumentarVolume();
            tvsmart.baixarVolume();
            tvsmart.baixarVolume();
            tvsmart.baixarVolume();
        }
        aparelhosInteligentes.desligar();
    }
}
