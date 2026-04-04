package br.com.fiap.usbsystem.model;

public class Vendedor extends Funcionario {
    // Atributos da classe
    public double vendasSemestrias;

    // Construtor
    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String cpf, Endereco endereco, double salarioFixo, double vendasSemestrias) {
        super(nome, cpf, endereco, salarioFixo);
        this.vendasSemestrias = vendasSemestrias;
    }

    // Getters e Setters
    public double getVendasSemestrias() {
        return vendasSemestrias;
    }

    public void setVendasSemestrias(double vendasSemestrias) {
        this.vendasSemestrias = vendasSemestrias;
    }

    @Override
    public double getBonus() {
        return this.vendasSemestrias * 0.015;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\n"
                + "Endereco: " + this.getEndereco().getEnderecoCompleto() + "\n"
                + "Salario mensal: " + this.getSalarioFixo() + "\n"
                + "Vendas Semestrias: " + this.getVendasSemestrias() + "\n"
                + "Bonus: " + this.getBonus() + "\n";
    }

}
