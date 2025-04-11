package com.senai.aula06_abstracao.exercicios.exercicio01;

public interface CheFky {
    double PESO_MAXIMO_BAGAGEM = 23;
    double QTD_MAXIMA_BAGAGENS = 5;

    void validarDocumento();
    void emitirCartaoEmbarque();
    void realizarCheckIn();

    static void mensagemBoasVindas() {
        System.out.println("Seja bem-vindo ao FlySecure!");
    }

    static void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado pela FlySecure");
    }

    default void validarPesoBagagem(int pesoBagagem){
        if (pesoBagagem > PESO_MAXIMO_BAGAGEM) {
            System.out.println("Bagagem de mão não autorizada (acima do peso máximo)!");
        } else {
            System.out.println("Bagagem de mão autorizada!");
        }
    }

    default void validarQtdBagagem(int qtdBagagem){
        if (qtdBagagem > QTD_MAXIMA_BAGAGENS) {
            System.out.println("Quantidade de bagagens não permitida (excedeu o limite)!");
        } else {
            System.out.println("Quantidade de bagagens autorizada!");
        }
    }

    default void mensagemDadosValidados (String dados) {
        if (validarDados(dados)) {
            System.out.println("Dados validados!");
        } else System.out.println("Dados não validados!");
    }

    private boolean validarDados(String dados){
        return !dados.isEmpty();
    }
}
