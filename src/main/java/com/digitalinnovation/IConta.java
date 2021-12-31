package com.digitalinnovation;

public interface IConta {

    default void sacar(double valor) {}

    default void depositar(double valor) {}

    default void transferir(double valor, Conta contaDestino) {}

    void imprimeExtrato();

}
