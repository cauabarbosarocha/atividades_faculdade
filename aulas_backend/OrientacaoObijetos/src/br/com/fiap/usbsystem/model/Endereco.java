package br.com.fiap.usbsystem.model;

public class Endereco {
    // Atributos da classe
    private String logradouro;
    private int numero;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;

    // Contrutor
    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String complemento, int cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep; 
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters e Setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString
    public String getEnderecoCompleto() {
        return this.logradouro + ", "
                + this.numero + ", "
                + this.complemento + ", "
                + this.cidade + " - "
                + this.estado + ", "
                + this.cep;
    }

}
