public class Produtos {
    // Atributos
    String nomeProduto;
    double precoProduto;
    int quantidadeProduto;

    // Contrutor
    public Produtos(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produtos(){

    }

    // Método de exibição do produto
    public void exibirInformacoes() {
        System.out.println("Exibindo intformações do produto");
        System.out.printf("Produto: %s%nPreço: %.2f%nQuantidade em estoque: %d%n", nomeProduto, precoProduto, quantidadeProduto);
    }
    // Método de compra do produto
    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada <= quantidadeProduto) {
            quantidadeProduto -= quantidadeComprada;
            double valorPagar = quantidadeComprada * precoProduto;
            System.out.printf("Compra realizada com sucesso!%nValor à ser pago: R$ %.2f%n", valorPagar);
        } else {
            System.out.println("Estoque insuficiente para efetuar a compra.");
        }
    }
    // Método para adicionar Estoque
    public void adicionarEstoque(int quantidadeAdicional) {
        quantidadeProduto += quantidadeAdicional;
        System.out.println("Quantidade adcionada ao estoque.");
    }
    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        double desconto = precoProduto * (percentual / 100);
        precoProduto -= desconto;
        System.out.printf("Desconto aplicado. Novo preço: R$ %.2f%n", precoProduto);
    }
}
