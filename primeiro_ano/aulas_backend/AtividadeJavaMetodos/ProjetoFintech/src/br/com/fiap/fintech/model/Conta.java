package br.com.fiap.fintech.model;

public class Conta {
    // Atributos privados para gerenciar os dados da conta bancária
    private String numeroConta;
    private String agencia;
    private Double saldo;
    private String tipoConta;

    // Construtor padrão
    public Conta() {
    }

    // Construtor com parâmetros
    public Conta(String numeroConta, String agencia, Double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    // Método para realizar depósito na conta
    public void depositar(Double valor) {
        System.out.println("Executando o método depositar no valor de: R$ " + valor);
    }

    // Método para realizar saque na conta
    public void sacar(Double valor) {
        System.out.println("Executando o método sacar no valor de: R$ " + valor);
    }

    // Método para consultar o saldo atual da conta
    public void consultarSaldo() {
        System.out.println("Executando o método consultarSaldo. Saldo atual: R$ " + saldo);
    }
}