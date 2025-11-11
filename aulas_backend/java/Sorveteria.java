package aulas_backend.java;

import java.util.Scanner;

public class Sorveteria {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int qtdSorvetes = 0;
        int opcaoSorvete;
        int qtd;
        int escolhaCobertura;
        int opcaoCobertura;
        double valorTotal = 0.0;
        double valorSorvete = 0.0;
        boolean finalizarPedido = false;

        // Mensagem de boas-vindas
        System.out.println("Bem-vindo à Sorvereria JavaGeLato!");

        // Loop principal do pedido
        while (!finalizarPedido) {
            // Exibição do menu de sorvetes
            System.out.printf(
                    "Menu de Sorvetes:%n1. 1 Bola casquinha - R$6,00%n2. 2 Bolas casquinha - R$9,00%n3. 3 Bolas casquinha - R$12,00%nEscolha uma opção [1-3] (Para finalizar o pedido digite 0): ");
            opcaoSorvete = scanner.nextInt();

            // Determina o valor com base na escolha
            switch (opcaoSorvete) {
                case 0:
                    finalizarPedido = true;
                    System.out.println("Finalizando pedido...");
                    break;
                case 1:
                    valorSorvete = 6.00;
                    break;
                case 2:
                    valorSorvete = 9.00;
                    break;
                case 3:
                    valorSorvete = 12.00;
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
                    continue;
            }
            // Determina a quantidade de sorvetes e multiplica pelo valor
            if (opcaoSorvete >= 1 && opcaoSorvete <= 3) {
                System.out.print("Qauntos sorvetes deseja desta opção? ");
                qtd = scanner.nextInt();
                qtdSorvetes += qtd;
                valorTotal += valorSorvete * qtd;

                // Loop para escolha da cobertura
                for (int i = 0; i < qtd; i++) {
                    
                    // Dá a opção de escolher cobertura
                    System.out.print("Deseja adicionar cobertura? [1-Sim / 2-Não]: ");
                    escolhaCobertura = scanner.nextInt();

                    // Exibe o menu de coberturas se a resposta for sim
                    if (escolhaCobertura == 1) {
                        System.out.printf("Menu de Coberturas:%n1. Chocolate - R$2,00%n2. Morango - R$2,00%n3. Caramelo - R$3,00%nEscolha uma opção [1-3]: ");
                        opcaoCobertura = scanner.nextInt();
                        switch (opcaoCobertura) {
                            case 1:
                                valorTotal += 2.00;
                                break;
                            case 2:
                                valorTotal += 2.00;
                                break;
                            case 3:
                                valorTotal += 3.00;
                                break;
                            default:
                                System.out.println("Opção inválida. Nenhuma cobertura adicionada.");
                                break;
                        }
                    }
                }
            }
        }
        // Exibição do resumo do pedido
        System.out.printf("Resumo do pedido:%nQuantidade de sorvetes: %d%nValor total a pagar: R$ %.2f%n",
                qtdSorvetes,
                valorTotal);
        // Fechamento do scanner
        scanner.close();
    }
}
