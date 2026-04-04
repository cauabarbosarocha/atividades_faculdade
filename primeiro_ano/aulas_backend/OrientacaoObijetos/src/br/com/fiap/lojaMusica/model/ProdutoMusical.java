package br.com.fiap.lojaMusica.model;

public abstract class ProdutoMusical {
    // Atributos
    public String nome;
    public String marca;
    
    // Construtores
    public ProdutoMusical() {
    }

    public ProdutoMusical(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public ProdutoMusical setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public ProdutoMusical setMarca(String marca) {
        this.marca = marca;
        return this;
    }
 
    public String getFormaEntrega() {
        return "Entregamos esse produto";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProdutoMusical{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
