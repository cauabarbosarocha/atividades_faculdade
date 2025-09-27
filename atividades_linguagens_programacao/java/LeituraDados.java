package atividades_linguagens_programacao.java;
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sue idade: ");
        int idade = sc.nextInt();

        System.out.println(nome + " tem " + idade + " anos.");

        sc.close();
    }
}