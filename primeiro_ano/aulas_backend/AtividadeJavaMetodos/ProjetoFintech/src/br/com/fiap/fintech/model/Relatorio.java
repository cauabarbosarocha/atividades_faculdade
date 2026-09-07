package br.com.fiap.fintech.model;

public class Relatorio {
    private String dataRelatorio;
    private String periodo;
    private double totalGastos;

    // Construtor da classe Relatorio
    public Relatorio(String dataRelatorio, String periodo, double totalGastos) {
        this.dataRelatorio = dataRelatorio;
        this.periodo = periodo;
        this.totalGastos = totalGastos;
    }

    // Método para gerar o relatório detalhado de gastos
    public void gerarRelatorioDetalhado() {
        System.out.println("Executando método gerarRelatorioDetalhado para o período: " + periodo);
    }

    // Getters e Setters
    public String getDataRelatorio() { return dataRelatorio; }
    public void setDataRelatorio(String dataRelatorio) { this.dataRelatorio = dataRelatorio; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public double getTotalGastos() { return totalGastos; }
    public void setTotalGastos(double totalGastos) { this.totalGastos = totalGastos; }
}