public class Item {
    // Atributos
    String nomeItem;
    String descricaoItem;
    boolean raro;
    int nivelPoderItem;

    // Construtor
    public Item(String nomeItem, String descricaoItem, boolean raro, int nivelPoderItem) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.raro = raro;
        this.nivelPoderItem = nivelPoderItem;
    }
}
