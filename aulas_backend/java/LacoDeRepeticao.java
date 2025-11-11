package aulas_backend.java;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        // Exemplo de while
        int numeroWhile = 1;
        while (numeroWhile <= 10) {
            System.out.println("Contagem do while: " + numeroWhile);
            numeroWhile++;
        }
        // Exwmplo de do wuhile
        int numeroDoWhile = 1;
        do {
            System.out.println("Contagem do do-while: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <= 10);
        // Exemplo de for
        for (int numeroFor = 1; numeroFor <= 10; numeroFor++) {
            System.out.println("Contagem do for: " + numeroFor);
        }
    }
}
