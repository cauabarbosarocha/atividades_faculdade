package atividades_linguagens_programacao.java.operadores_aritimeticos;

public class OperadoresAritimericos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int soma = a + b; // Adição
        int subtracao = a - b; // Subtração
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b; // Divisão de inteiros e descata as casas decimais
        int modulo = a % b;  // Módulo (resto da divisão)
        int decremeto = --a; // Decremento
        int incremento = ++b; // Incremento

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Decremento: " + decremeto);
        System.out.println("Incremento: " + incremento);
    }
} 