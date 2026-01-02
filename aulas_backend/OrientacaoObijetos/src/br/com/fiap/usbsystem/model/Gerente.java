package br.com.fiap.usbsystem.model;

public class Gerente extends Funcionario {
    // Atributos da classe
    public int sala;
    public int ramal;
    public double faturamentoSemestral;

    // Contrutor
    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, Endereco endereco, double salarioFixo, int sala, int ramal, double faturamentoSemestral) {
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    // Getters e Setters
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public void setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
    }

    @Override
    public double getBonus() {
        return this.faturamentoSemestral * 0.05;
    }
    
    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\n"
                + "Sala: " + this.getSala() + "\n"
                + "Ramal: " + this.getRamal() + "\n"
                + "Endereco: " + this.getEndereco().getEnderecoCompleto() + "\n"
                + "Salario mensal: " + this.getSalarioFixo() + "\n"
                + "Faturamento Semestral: " + this.getFaturamentoSemestral() + "\n"
                + "Bonus: " + this.getBonus() + "\n";
            }

}
