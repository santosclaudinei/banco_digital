package com.digitalinnovation;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente nomeCliente) {
        super(nomeCliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("\n--__--__-- Extrato da conta poupança --__--__--\n");
        super.mostraInformacoesComuns();
    }
}
