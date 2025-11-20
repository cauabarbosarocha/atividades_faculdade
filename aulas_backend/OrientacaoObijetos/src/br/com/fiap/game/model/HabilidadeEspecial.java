package br.com.fiap.game.model;
public class HabilidadeEspecial {
    // Atributos
    private String nomeHabilidade;
    private int custoMana;
    private boolean habilitada;

    // Construtor
    public HabilidadeEspecial(String nomeHabilidade, int custoMana, boolean habilitada){
        this.nomeHabilidade = nomeHabilidade;
        this.custoMana = custoMana;
        this.habilitada = habilitada;
    }
}
