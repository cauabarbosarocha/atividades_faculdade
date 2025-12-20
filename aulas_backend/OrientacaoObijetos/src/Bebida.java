public class Bebida extends Produto {
    private Integer tamanho;

    public Bebida() {
        super();
    }

    public Bebida(String nome, String ingredientes, double preco, Integer tamanho) {
        super(nome, ingredientes, preco);
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

}
