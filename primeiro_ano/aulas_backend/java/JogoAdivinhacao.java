package aulas_backend.java;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        System.out.println("Bem-vindo ao jogo de adivinhação! \nTente adivinhar o número entre 1 e 100.");

        // Variaveis para controle do jogo
        int tentativas = 0;
        boolean adivinhou = false;

        // Loop principal do jogo
        while (!adivinhou) {
            System.out.print("Digite seu palpite: ");
            int tentativa = scanner.nextInt();
            tentativas++;

            // Validação da entrada
            if (tentativa < 1 || tentativa > 100) {
                System.out.print("Por favor, difite um númeor entre 1 e 100.");
                continue;
            }

            // Validação da tetantiva
            if (tentativa == numeroSecreto) {
                adivinhou = true;
                System.out.println(
                        "Parabéns! Você adivinhou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        scanner.close();
    }
}
