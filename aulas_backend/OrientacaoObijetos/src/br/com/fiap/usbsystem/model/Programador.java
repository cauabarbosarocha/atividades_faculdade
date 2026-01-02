package br.com.fiap.usbsystem.model;

public class Programador extends Funcionario {
    // Atributos da classe
    public int ramal;

    // Contrutor
    public Programador() {
        super();
    }

    public Programador(String nome, String cpf, Endereco endereco, double salarioFixo, int ramal) {
        super(nome, cpf, endereco, salarioFixo);
        this.ramal = ramal;
    }

    // Getters e Setters
    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public double getBonus() {
        return this.getSalarioFixo() * 0.02;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\n"
                + "Ramal: " + this.getRamal() + "\n"
                + "Endereco: " + this.getEndereco().getEnderecoCompleto() + "\n"
                + "Salario mensal: " + this.getSalarioFixo() + "\n"
                + "Bonus: " + this.getBonus() + "\n";
    }
    
}
