package br.com.fiap.game.model;

public class Item {
    // Atributos
    private String nomeItem;
    private String descricaoItem;
    private boolean raro;
    private int nivelPoderItem;

    // Construtor
    public Item(String nomeItem, String descricaoItem, boolean raro, int nivelPoderItem) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.raro = raro;
        this.nivelPoderItem = nivelPoderItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public boolean isRaro() {
        return raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }

    public int getNivelPoderItem() {
        return nivelPoderItem;
    }

    public void setNivelPoderItem(int nivelPoderItem) {
        this.nivelPoderItem = nivelPoderItem;
    }
}
