package br.com.fiap.fintech.model;

public class Relatorio {
    // Atributos privados para controle do relatório financeiro
    private Integer idRelatorio;
    private String periodo;
    private Double totalGastos;

    // Construtor padrão
    public Relatorio() {
    }

    // Construtor com parâmetros
    public Relatorio(Integer idRelatorio, String periodo, Double totalGastos) {
        this.idRelatorio = idRelatorio;
        this.periodo = periodo;
        this.totalGastos = totalGastos;
    }

    // Método correspondente ao UC06: Gera o relatório detalhado de gastos
    public void gerarRelatorioGastos() {
        System.out.println("Executando o método gerarRelatorioGastos para o período: " + periodo);
    }
}