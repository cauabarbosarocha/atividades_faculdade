package br.com.fiap.restaurante.model;

// Subclasse que herda de Produto
public class PratoQuente extends Produto {
    // Atributo especifico de PratoQuente
    private int serve;
 
    // Contrutores
    public PratoQuente() {
        super();
    }

    public PratoQuente(String nome, String ingredientes, double preco, int serve) {
        super(nome, ingredientes, preco);
        this.serve = serve;
    }

    // Métodos exlusivos da subclasse
    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }

    // A supercalsse nos obriga a implementar este método
    // Ele retorna um resumo do produto em string
    @Override
    public String getResumo() {
        return "Prato Quente: " + getNome() + ", Preço: R$ " + getPreco() + ", Serve: " + serve + " pessoas";
    }

}
