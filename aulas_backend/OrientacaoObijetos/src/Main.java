import java.util.Scanner;

import br.com.fiap.loja.model.Produto;


public class Main {
    public static void main(String[] args) {
        // Cria um objeto para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine(); // Lê e armazena o nome do produto
        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble(); // Lê e armazena o preço do produto
        sc.nextLine(); // Consumir a quebra de linha

        // Cria um objeto Produto com os dados fornecidos
        Produto produto = new Produto(nome, preco);

        System.out.println("""
                Escolha a opção de desconto:
                1 - Valor em reais
                2 - Valor em porcentagem
                3 - Cupom de desconto
                """);
        int opcao = sc.nextInt(); // Lê e armazena a opção escolhida
        
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do desconto em reais:");
                double desconto = sc.nextDouble(); // Lê e armazena o valor do desconto
                // Calcula e exibe o preço com desconto em reais
                System.out.println("Valor com desconto: R$ " + produto.calcularDesconto(desconto));
                break;
            case 2:
                System.out.println("Digite o valor do desconto em porcentagem:");
                int porcentagem = sc.nextInt(); // Lê e armazena o valor do desconto em porcentagem
                // Calcula e exibe o preço com desconto em porcentagem
                System.out.println("Valor com desconto: R$ " + produto.calcularDesconto(porcentagem));
                break;
            case 3:
                System.out.println("Digite o cupom de desconto:");
                String cupom = sc.next(); // Lê e armazena o cupom de desconto
                // Calcula e exibe o preço com desconto usando o cupom
                System.out.println("Valor com desconto: R$ " + produto.calcularDesconto(cupom));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        };
        sc.close(); // Fecha o scanner
    }
}
