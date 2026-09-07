package br.com.fiap.fintech.model;

// Superclasse que serve de base para os tipos de conta
public class Conta {
    // Atributos protegidos (protected) para que as subclasses possam acessá-los diretamente
    protected String numeroConta;
    protected String agencia;
    protected double saldo;
    protected String tipo;

    // Construtor da superclasse para inicializar os atributos ao criar um objeto
    public Conta(String numeroConta, String agencia, double saldo, String tipo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Método para realizar depósito e somar ao saldo
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Executando método depositar no valor de: R$ " + valor);
    }

    // Método para realizar saque e subtrair do saldo
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Executando método sacar no valor de: R$ " + valor);
    }

    // Método para exibir o saldo atual da conta
    public void consultarSaldo() {
        System.out.println("Executando método consultarSaldo. Saldo atual: R$ " + this.saldo);
    }

    // Método que será sobrescrito (polimorfismo) nas subclasses
    public void calcularTaxaManutencao() {
        System.out.println("Executando método calcularTaxaManutencao padrão.");
    }

    // Getters e Setters (Encapsulamento para proteger e acessar os atributos privados/protegidos)
    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}