package aulas_backend.java;

public class Tabuada {
    public static void main(String[] args) {
        // Imprime a mensagem de cabeçalho
        System.out.println("Tabela de Multiplicação");

        // Loop para a tabuada de 1 à 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do %d:%n", i);

            // Loop para multiplicar de 1 à 10
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }

            // Linha em branco para separar as tabelas
            System.out.println();
        }
    }
}
