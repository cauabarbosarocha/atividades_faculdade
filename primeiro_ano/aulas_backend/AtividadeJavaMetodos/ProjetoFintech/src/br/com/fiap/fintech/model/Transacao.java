package br.com.fiap.fintech.model;

public class Transacao {
    private String tipoTransacao;
    private double valor;
    private String dataTransacao;

    // Construtor para inicializar os dados da transação
    public Transacao(String tipoTransacao, double valor, String dataTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
    }

    // Método para registrar transação manual
    public void registrarTransacaoManual() {
        System.out.println("Executando método registrarTransacaoManual para ID: " + tipoTransacao);
    }

    // Método para importar extrato bancário
    public void importarExtratoBancario() {
        System.out.println("Executando método importarExtratoBancario");
    }

    // Método para sincronizar extrato de cartão
    public void sincronizarExtratoCartao() {
        System.out.println("Executando método sincronizarExtratoCartao");
    }

    // Método para converter moeda estrangeira com base em uma taxa
    public void converterMoedaEstrangeira(double taxaConversao) {
        System.out.println("Executando método converterMoedaEstrangeira com taxa: " + taxaConversao);
    }

    // Getters e Setters
    public String getTipoTransacao() { return tipoTransacao; }
    public void setTipoTransacao(String tipoTransacao) { this.tipoTransacao = tipoTransacao; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getDataTransacao() { return dataTransacao; }
    public void setDataTransacao(String dataTransacao) { this.dataTransacao = dataTransacao; }
}