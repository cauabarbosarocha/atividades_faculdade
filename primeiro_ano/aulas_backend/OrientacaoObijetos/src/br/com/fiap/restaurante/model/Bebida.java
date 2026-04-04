package br.com.fiap.restaurante.model;

// Subclasse que herda de Produto
public class Bebida extends Produto {
    // Atributo especifico de Bebida
    private Integer tamanho;

    // Contrutores
    public Bebida() {
        super();
    }

    public Bebida(String nome, String ingredientes, double preco, Integer tamanho) {
        // Invocando o construtor da superclasse
        super(nome, ingredientes, preco);
        // Inicializando o atributo especifico
        this.tamanho = tamanho;
    }

    // Métodos exlusivos da subclasse
    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    // A supercalsse nos obriga a implementar este método
    // Ele retorna um resumo do produto em string
    @Override
    public String getResumo() {
        return "Bebida: " + getNome() + ", Preço: R$ " + getPreco() + ", Tamanho: " + tamanho + "ml";
    }

}
