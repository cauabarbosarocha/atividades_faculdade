package aulas_backend.java;

import java.util.Scanner;

public class PedidoCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variáveis
        String tamanhoCafe;
        int tipoCafe;
        double valorCafe = 0.0;
        double valorTotal = 0.0;
        int quantidadeCafe = 0;
        boolean continuarPedido = true;
        // Laço para realizar o pedido
        while (continuarPedido) {
            // Recebe o tamanho do café
            System.out.print(
                    "Bem-vindo à cafeteria Java! \nDigite [F] para finalizar \nEscolha o tamanho do café: \n [P] Pequeno (R$ 2,50) \n [M] Médio (R$ 3,00) \n [G] Grande (R$ 3,50) \nOpção escolhida: ");
            tamanhoCafe = scanner.nextLine().toUpperCase();
            // Verifica se o cliente deseja finalizar o pedido
            if (tamanhoCafe.equals("F")) {
                continuarPedido = false;
                System.out.print("Pedido finalizado. Obrigado por escolher a cafeteria Java!");
                scanner.close();
            } else {
                // Verifica o tamanho do café e atribui ao valor
                switch (tamanhoCafe) {
                    case "P":
                        valorCafe += 2.50;
                        break;
                    case "M":
                        valorCafe += 3.00;
                        break;
                    case "G":
                        valorCafe += 3.50;
                        break;
                    default:
                        System.out.println("[ERRO] Tamanho inválido.");
                        continue;
                }
                // Recebe o tipo do café
                System.out.print(
                        "Escolha o tipo do café: \n [1] Expresso (R$ 1,50) \n [2] Cappuccino (R$ 2,00) \n [3] Latte (R$ 2,50) \nTipo escolhido: ");
                tipoCafe = scanner.nextInt();
                // Verifica o tipo de café e atribui ao valor
                switch (tipoCafe) {
                    case 1:
                        valorCafe += 1.50;
                        break;
                    case 2:
                        valorCafe += 2.00;
                        break;
                    case 3:
                        valorCafe += 2.50;
                        break;
                    default:
                        System.out.println("[ERRO] Tipo inválido.");
                        continue;
                }
                // Adiciona a quantidade de cafés e o valor total
                valorTotal += valorCafe;
                quantidadeCafe++;
                System.out.println("Café adicionado ao pedido. Valor atual: R$" + valorTotal);
                // Limpa o buffer do scanner
                scanner.nextLine();
            }
        }
        // Exbe o valor total do pedido
        System.out.println(
                "Seu pedido foi finalizado.\nTotal a pagar por " + quantidadeCafe + " café(s) é: R$" + valorTotal);
        scanner.close();
    }
}
