package aulas_backend.java;

import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        // Solicitação da idade do usuário
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        
        // Validação da idade do usuário
        if (idade >= 18) {
            System.out.print("Acesso permitido.");
        } else {
            System.out.print("Acesso negado!");
        }
        
         scanner.close();

    }
}
