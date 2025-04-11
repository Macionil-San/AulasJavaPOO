package com.senai.aula06_abstracao.exemplos.exemplo_Controle_Equipamento;

public interface AparelhosInteligentes {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajusteNivel(int nivelAtual, int ajuste){
        if(validarNivel(nivelAtual,ajuste)){
            return nivelAtual + ajuste;
        }else {
            return nivelAtual;
        }
    }

    private boolean validarNivel(int nivelAtual, int ajuste){
        return nivelAtual >=0 &&
                nivelAtual <= NIVEL_MAXIMO &&
                (nivelAtual + ajuste) != -1 &&
                (nivelAtual + ajuste) != 100;
    }

    static void mensagemBoasVindas(){
        System.out.println("Bem-vindo ao controle remoto inteligente");
    }
}
