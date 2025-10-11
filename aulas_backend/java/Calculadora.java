package aulas_backend.java;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variáveis
        double numero1, numero2, resultado;
        int operador;

        // Recebe o operador
        System.out.print("Bem-vindo(a) à Calculadora! \nDigite a operação desejada: \n1 - Soma (+) \n2 - Subtração (-) \n3 - Multiplicação (*) \n4 - Divisão (/) \nOperador escolhido: ");
        operador = sc.nextInt();

        // Recebe os números
        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextDouble();

        // Realiza a operação confome a escolha do usuário
        switch (operador) {
            case 1:
                resultado = numero1 + numero2;
                System.out.print("O resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.print("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.print("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.print("O resultado da divisão é: " + resultado);
                } else {
                    System.out.print("[ERRO] Impossícel dividr por zero.");
                }
                break;
            default:
                System.out.print("[ERRO] Operador inválido.");
                break;
        }
        sc.close();
    }
}
        // System.out.println("Digite o primeiro número para as operações: ");
        // double num1 = sc.nextDouble();

        // System.out.println("Digite o segundo número para as operações: ");
        // double num2 = sc.nextDouble();

        // double soma = num1 + num2;
        // double subtracao = num1 - num2;
        // double multiplicacao = num1 * num2;
        // double divisao = num1 / num2;

        // System.out.println("O resultado da soma é: " + soma);
        // System.out.println("O resultado da subtração é: " + subtracao);
        // System.out.println("O resultado da multiplicação é: " + multiplicacao);
        // System.out.println("O resultado da divisão é: " + divisao);

        // sc.close();