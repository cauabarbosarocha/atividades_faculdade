package aulas_backend.java.exercicios;

import java.util.Scanner;

public class Premiacao {
    public static void main(String[] args) {
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        double valorCompra;
        int frequencia;

        // Solicitação de dados do usuário
        System.out.print("Digite o valor de sua compra: ");
        valorCompra = scanner.nextDouble();
        System.out.print("Digite a frequência com que compra na loja: ");
        frequencia = scanner.nextInt();

        // Verificação das condições para a premiação
        if (valorCompra >= 2000.00 && frequencia >= 10) {
            System.out.print("Parabéns! Você se tornou um cliente VIP e ganha 25% de desconto nas próximas compras!");
        } else if (valorCompra >= 1000.00 ) {
            System.out.print("Você se tornou um cliente Gold e ganha 10% de desconto nas próximas compras!");
        } else if (valorCompra >= 500.00 || frequencia >= 2) {
            System.out.print("Você se tornou um cliente Silver e ganha 5% de desconto nas próximas compras!");
        } else {
            System.out.print("Você é um cliente Bronze, contie comprando para ganhar descontos");
        }
        scanner.close();
}
}