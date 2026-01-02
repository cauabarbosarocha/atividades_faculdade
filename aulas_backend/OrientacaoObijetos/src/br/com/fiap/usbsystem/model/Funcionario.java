package br.com.fiap.usbsystem.model;

public abstract class Funcionario {
    // Atributos da classe
    private String nome;
    private String cpf;
    private Endereco endereco;
    private double salarioFixo;

    // Construtor
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salarioFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salarioFixo = salarioFixo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    // Métodos abstratos
    public abstract double getBonus();

    public abstract String getDetalhamento();
}
