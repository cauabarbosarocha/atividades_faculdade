public class NotasEstudantes {
    static void main(String[] args) {
        // Matriz representando alunos e suas notas
        // linhas = alunos | colunas = notas
        double[][] notasEstudantes = {
                {7.5, 6.4, 10.0}, // Notas aluno 1
                {9.5, 8.4, 10.0}, // Notas aluno 2
                {2.3, 2.5, 5.0, 0} // Notas aluno 3
        };

        // Calcula e exibe a média das notas para cada estudante
        for (int i = 0; i < notasEstudantes.length; i++) {
            double somaNotas = 0;
            for (int j = 0; j < notasEstudantes[i].length; j++) {
                somaNotas += notasEstudantes[i][j];
            }
            double media = somaNotas / notasEstudantes[i].length;
            System.out.printf("Média do estudante %d: %.2f\n", i + 1, media);
        }
    }
}
