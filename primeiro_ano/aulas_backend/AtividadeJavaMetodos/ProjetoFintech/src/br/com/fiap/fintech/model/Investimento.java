package br.com.fiap.fintech.model;

public class Investimento {
    // Atributos privados garantindo o encapsulamento
    private String tipoInvestimento;
    private double valorAplicado;
    private double taxaRendimento;
    private int prazoMeses;

    // Construtor para inicializar o investimento
    public Investimento(String tipoInvestimento, double valorAplicado, double taxaRendimento, int prazoMeses) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorAplicado = valorAplicado;
        this.taxaRendimento = taxaRendimento;
        this.prazoMeses = prazoMeses;
    }

    // Método para simular a aplicação de dinheiro
    public void aplicar() {
        System.out.println("Executando método aplicar no investimento: " + tipoInvestimento);
    }

    // Método para simular o resgate
    public void resgatar() {
        System.out.println("Executando método resgatar para o investimento: " + tipoInvestimento);
    }

    // Método para calcular o rendimento estimado
    public void calcularRendimento() {
        System.out.println("Executando método calcularRendimento para: " + tipoInvestimento);
    }

    // Getters e Setters para encapsulamento
    public String getTipoInvestimento() { return tipoInvestimento; }
    public void setTipoInvestimento(String tipoInvestimento) { this.tipoInvestimento = tipoInvestimento; }

    public double getValorAplicado() { return valorAplicado; }
    public void setValorAplicado(double valorAplicado) { this.valorAplicado = valorAplicado; }

    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }

    public int getPrazoMeses() { return prazoMeses; }
    public void setPrazoMeses(int prazoMeses) { this.prazoMeses = prazoMeses; }
}