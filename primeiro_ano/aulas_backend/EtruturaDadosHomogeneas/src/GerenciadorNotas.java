public class GerenciadorNotas {
    static void main(String[] args) {
        // Notas, cada elemento sendo uma diciplina
        double[] notasAluno = {5.5, 1, 6.5, 3, 7.8};

        // Calcula a média das notas
        double somaNotas = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            somaNotas += notasAluno[i];
        }
        double media = somaNotas / notasAluno.length;

        // Imprime a média e aprovação ou reprovação
        System.out.println("Média do aluno: " + media);

        if (media >= 5.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
