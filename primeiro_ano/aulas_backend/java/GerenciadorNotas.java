package aulas_backend.java;

public class GerenciadorNotas {
    public static void main(String[] args) {
        // Notas do aluno, cada elemento representa uma diciplina
        double[] notas = {7.0, 8.0, 6.5, 9.5, 3.5};

        // Calculando a média das notas
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        // Imprimindo a média e a situação do aluno
        System.out.println("Média do aluno: " + media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
