package br.com.fiap.fintech.model;

public class Transacao {
    // Declaração dos atributos privados da transação (encapsulamento)
    private Integer idTransacao;
    private String tipoTransacao;
    private Double valor;
    private String dataTransacao;

    // Construtor padrão (sem parâmetros) exigido pela atividade
    public Transacao() {
    }

    // Construtor com parâmetros para inicializar os atributos ao instanciar o objeto
    public Transacao(Integer idTransacao, String tipoTransacao, Double valor, String dataTransacao) {
        this.idTransacao = idTransacao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
    }

    // Método correspondente ao UC02: Registra uma transação manual no sistema
    public void registrarTransacaoManual() {
        System.out.println("Executando o método registrarTransacaoManual para o ID: " + idTransacao);
    }

    // Método correspondente ao UC03: Importa o extrato bancário
    public void importarExtratoBancario() {
        System.out.println("Executando o método importarExtratoBancario.");
    }

    // Método correspondente ao UC04: Sincroniza a fatura do cartão
    public void sincronizarFaturaCartao() {
        System.out.println("Executando o método sincronizarFaturaCartao.");
    }

    // Método correspondente ao UC05: Realiza a conversão de moeda estrangeira recebendo a taxa
    public void converterMoedaEstrangeira(Double taxaConversao) {
        System.out.println("Executando o método converterMoedaEstrangeira com taxa: " + taxaConversao);
    }
}