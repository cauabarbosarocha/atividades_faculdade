package aulas_backend.java;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        // Cira um objeto scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar o número e o resultado
        int numero;
        boolean ehPrimo = true;

        // Solicita ao usuário que insira um número
        System.out.print("digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        // Verifica se o númeor é primo
        if (numero <= 1) {
            System.out.print("Número inválido. Digite um número inteiro poritivo maior que 1.");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            // Exibe o resultado
            if (ehPrimo) {
                System.out.printf("%d é um número primo.%n", numero);
            } else {
                System.out.printf("%d não é um número primo.%n", numero);
            }
        }
        // Fecha o scanner
        scanner.close();
    }
}
