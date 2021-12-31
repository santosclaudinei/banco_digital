package com.digitalinnovation;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1608;
    private static int SEQUENCIAL = 1;

    protected int nroAgencia;
    protected int nroConta;
    protected double saldoConta;
    protected Cliente nomeCliente;

    public Conta(Cliente nomeCliente) {
        this.nroAgencia = Conta.AGENCIA_PADRAO;
        this.nroConta = SEQUENCIAL++;
        this.nomeCliente = nomeCliente;
    }

    public void sacar(double valor) {
        this.saldoConta -= valor;
    }

    public void depositar(double valor) {
        this.saldoConta += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void mostraInformacoesComuns() {
        System.out.println("Titular: " + this.nomeCliente.getNome());
        System.out.println("Agencia: " + this.nroAgencia);
        System.out.println("Número da conta: " + this.nroConta);
        System.out.printf("Saldo da conta: R$ %.2f%n", this.saldoConta);
    }

}
