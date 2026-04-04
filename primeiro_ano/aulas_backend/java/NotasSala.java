package aulas_backend.java;
import java.util.Scanner;

public class NotasSala {
    public static void main(String[] args) {
        // Configuração para o escnaner
        Scanner scanner = new Scanner(System.in);
        // Definindo as variáveis e valores iniciais
        int totalAlunos = 10;
        double somaNotas = 0;
        double nota;
        double media;

        // Mensagem inicial
        System.out.println("Informe as notas dos " + totalAlunos + " alunos:");
        // Loop para coleta de notas
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            nota = scanner.nextDouble();
            somaNotas += nota;
        }
        // Cálculo da média
        media = somaNotas / totalAlunos;
        // Exibição do resultado
        System.out.println("A média da sala é: " + media);
        // Fechamento do scanner
        scanner.close();
    }
}
