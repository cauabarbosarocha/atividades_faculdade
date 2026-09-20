public class Vetores {
     static void main(String[] args) {
         // Definnindo um vetor com uma quantidade expecifica de posições
         int[] meuVetor1 = new int[5];
         System.out.println(meuVetor1[1]);

         // Inicializando com valores específicos
         int[] meuVetor2 = {10, 20, 30, 40, 50};
         System.out.println(meuVetor2[4]); // acessando um valor específico

         meuVetor1[1] = 25; // Modifica o segundo índice
         System.out.println(meuVetor1[1]);

         // Retornando o tamanho do vetor usando o laço for
         for (int i = 0; i < meuVetor2.length; i++) {
             System.out.println(meuVetor2[i]); // Exibe todos os elementos
         }

         // Vetores de diferentes tipos
//         String[] nomes = new String[50]; //vetor de Strings
//                  double[] valores = new double[10]; //vetor de double
//                  Produto[] produtos = new Produto[8]; //vetor de Produtos
     }
}