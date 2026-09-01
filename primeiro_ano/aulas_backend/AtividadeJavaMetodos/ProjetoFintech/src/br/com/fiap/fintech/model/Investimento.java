package br.com.fiap.fintech.model;

public class Investimento {
    // Atributos privados que caracterizam as aplicações financeiras
    private String tipoInvestimento;
    private Double valorAplicado;
    private Double taxaRendimento;
    private Integer prazoMeses;

    // Construtor padrão
    public Investimento() {
    }

    // Construtor com parâmetros
    public Investimento(String tipoInvestimento, Double valorAplicado, Double taxaRendimento, Integer prazoMeses) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorAplicado = valorAplicado;
        this.taxaRendimento = taxaRendimento;
        this.prazoMeses = prazoMeses;
    }

    // Método para realizar uma nova aplicação financeira
    public void aplicar() {
        System.out.println("Executando o método aplicar no investimento: " + tipoInvestimento);
    }

    // Método para resgatar o valor aplicado
    public void resgatar() {
        System.out.println("Executando o método resgatar para o investimento: " + tipoInvestimento);
    }

    // Método para calcular o rendimento projetado do investimento
    public void calcularRendimento() {
        System.out.println("Executando o método calcularRendimento para: " + tipoInvestimento);
    }
}