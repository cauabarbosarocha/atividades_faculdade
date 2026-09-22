public class Matrizes {
    static void main(String[] args) {
//      int [][] matriz = new int[3][2]; // Matriz de 3 linhas por 2 colunas
//        int[][] matrizDireta = {{1,2}, {3,4}, {5,6}}; // 3 linha, 2 colunas com valores específicos
//        int elemento = matrizDireta[0][1]; // Acessa o elemteno da primeira linha e segunda coluna
//        matrizDireta[0][1] = 10; // Modifica o elemento da primeira linha na segunda coluna

//        for (int i = 0; i < matrizDireta.length; i++) { // Percorre linhas
//            for (int j = 0; j < matrizDireta[i].length; j++) { // Percorre colunas
//                IO.println(matrizDireta[i][j]);
//            }
//        }

        // Inicialização da matriz 3x3 com valores específicos
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Acessando um elemento específico
        System.out.println("Valor original na posição [1][2]: " + matriz[1][2]);

        // Modificando o valor na posição [1][2]
        matriz[1][2] = 67;

        // Exibindo todos os elementos da matriz após a modificação
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para formatação do print
        }
    }
}
