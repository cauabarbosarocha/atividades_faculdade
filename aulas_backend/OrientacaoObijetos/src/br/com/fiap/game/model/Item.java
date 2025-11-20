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
}
