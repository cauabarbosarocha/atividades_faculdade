package br.com.fiap.game.model;

public class HabilidadeEspecial {
    // Atributos
    private String nomeHabilidade;
    private int custoMana;
    private boolean habilitada;

    // Construtor
    public HabilidadeEspecial(String nomeHabilidade, int custoMana, boolean habilitada) {
        this.nomeHabilidade = nomeHabilidade;
        this.custoMana = custoMana;
        this.habilitada = habilitada;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
}
