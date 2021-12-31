package com.digitalinnovation;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente nomeCliente) {
        super(nomeCliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("\n--__--__-- Extrato da conta corrente --__--__--\n");
        super.mostraInformacoesComuns();
    }
}
