package br.com.fiap.restaurante.model;

// Classe abstrata que não pode ser instaciada diretamente
public abstract class Produto {
    // Atributos que serão herdadros
    private String nome;
    private String ingredientes;
    private double preco;

    // Contrutores (que não serão herdados podendo ser acessados através de super())
    public Produto() {
    }

    public Produto(String nome, String ingredientes, double preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    // Métodos que serão herdados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método abstrato que obriga a classe filha a implementar
    public abstract String getResumo();

}