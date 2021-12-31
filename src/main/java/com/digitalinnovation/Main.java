package com.digitalinnovation;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente novoCliente = new Cliente();
        Cliente novoCliente1 = new Cliente();
        novoCliente.setNome("Claudinei José Santos");
        novoCliente1.setNome("Luana Cristina Soares");

        Conta cc = new ContaCorrente(novoCliente);
        Conta cp = new ContaPoupanca(novoCliente);
        Conta cc1 = new ContaCorrente(novoCliente1);
        Conta cp1 = new ContaPoupanca(novoCliente1);

        cc.depositar(100.50);
        cc1.depositar(50.00);

        cc.imprimeExtrato();
        cp.imprimeExtrato();
        cc1.imprimeExtrato();
        cp1.imprimeExtrato();

        cc.transferir(30.50, cp);
        cc1.transferir(30.50, cp1);

        cc.imprimeExtrato();
        cp.imprimeExtrato();

    }

}
