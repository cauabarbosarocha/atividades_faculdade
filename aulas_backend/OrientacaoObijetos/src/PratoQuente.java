public class PratoQuente extends Produto {
    private int serve;

    public PratoQuente() {
        super();
    }

    public PratoQuente(String nome, String ingredientes, double preco, int serve) {
        super(nome, ingredientes, preco);
        this.serve = serve;
    }

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }

}
