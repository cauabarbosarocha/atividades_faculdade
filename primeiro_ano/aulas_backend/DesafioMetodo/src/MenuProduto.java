import java.util.Scanner;

public class MenuProduto {
    public static void main(String[] args) {
        // Criação dos objetos
        Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();

        // Declaração de variaveis
        String produto;
        int op, qtd, estoque;
        double preco, desconto;

        // Loop do menu
        do {
            // Opção de navegação
            System.out.println(
                    "Escolha uma opção: \n1-Cadastrar Produto \n2-Exibir Produto \n3-Comprar \n4-Adicionar Estoque \n5-Aplicar Desconto \n0-Sair");
            op = sc.nextInt();

            // Executa o caso da opção escolhida
            switch (op) {
                case 1:
                    // Cadastra o nome, preço e a quantidade dem estoque do produto
                    System.out.println("Digite o nome do produto:");
                    produto = sc.next() + sc.nextLine();
                    System.out.println("Digite o preço do produto:");
                    preco = sc.nextDouble();
                    System.out.println("Digite a quantidade em estoque:");
                    estoque = sc.nextInt();
                    // Atribui os valores ao objeto
                    produtos = new Produtos(produto, preco, estoque);
                    break;
                case 2:
                    // Chama o método para exibir as infos
                    produtos.exibirInformacoes();
                    break;
                case 3:
                    // Pede a quantidade da compra e chama o método de compra
                    System.out.println("Digite a quantidade para a compra:");
                    qtd = sc.nextInt();
                    produtos.comprar(qtd);
                    break;
                case 4:
                    // Pede a quantidade para adicionar ao estoque e chama o método de adiconar
                    System.out.println("Digite a quantidade para adicionar ao estoque:");
                    qtd = sc.nextInt();
                    produtos.adicionarEstoque(qtd);
                    break;
                case 5:
                    // Pede a porcentagem de desconto e chama o método para dar o desconto
                    System.out.println("Digite a porcentagem de desconto:");
                    desconto = sc.nextDouble();
                    produtos.aplicarDesconto(desconto);
                    break;
                case 0:
                    System.out.println("Finalizando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

        // Fechamento do scanner
        sc.close();

    }
}
