package aulas_backend.java;

public class Vetores {
    public static void main(String[] args) {

        // Outros tipos de vetores
        // String[] nomes = new String[50]; // Vetor de strings com 50 posições
        // double[] valores = new double[10]; // Vetor de double com 10 posições
        // boolean[] flags = new boolean[4]; // Vetor de boolean com 4 posições

        // int[] vetor = new int[5]; // Declaração de um vetor com 5 elementos
                              // Pode declarado com mais elementos ou menos

        int[] vetorNumeros = {10, 20, 30, 40, 50}; // Declaração e inicialização de um vetor

        int elemento = vetorNumeros[2]; // Acessando o elemento na posição 2 (terceiro elemento)
        System.out.println("Valor da posição [2] do vetor: " + elemento);

        vetorNumeros[4] = 453; // O quinto elemento do vetor agora é 453
        System.out.println("Novo valor da posição [4] do vetor: " + vetorNumeros[4]);

        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("[" + i + "] = " + vetorNumeros[i]);
        }

        int[] outroVetor = new int[5]; // Declarando e inicializando outro vetor com 5 posições
        System.out.println("Valores do outro vetor:");
        for (int i = 0; i < outroVetor.length; i++) {
            System.out.println("[" + i + "] = " + outroVetor[i]); // Valore padrão [0]
        } 
    }
}
