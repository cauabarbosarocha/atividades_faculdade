public class VetoresOrdenados  {
    static void main(String[] args) {
        // Ordenando com BubbleSort
        int[] bubbleSort = {64, 23, 50, 90, 11, 4, 78};

        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 1; i < bubbleSort.length; i++) {
                // Compara elementos adjacentes
                if (bubbleSort[i - 1] > bubbleSort[i]) {
                    // Troca os elementos de lugar
                    int temp = bubbleSort[i - 1];
                    bubbleSort[i - 1] = bubbleSort[i];
                    bubbleSort[i] = temp;
                    houveTroca = true; // Indica que uma troca ocorreu
                }
            }
        } while (houveTroca); // Continua enquanto houver trocas

        System.out.println("Vetor ordenado por BubbleSort:");
        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.println(bubbleSort[i]);
        }

        IO.println("-------------------------------------------");
        // Busca Binaria
        int elementoProcurado = 23;
        int inicio = 0;
        int fim = bubbleSort.length - 1;
        int posicaoencontrada = -1; // Assume inicialmente que o elemento não está presente

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (bubbleSort[meio] == elementoProcurado) {
                posicaoencontrada = meio; // Elemento encontrado
                break;
            } else if (bubbleSort[meio] < elementoProcurado) {
                inicio = meio + 1; // Continua a busca na metade superior
            } else {
                fim = meio - 1; // Continua a busca na metade inferior
            }
        }

        if (posicaoencontrada != -1) {
            System.out.println("Elemento encontrado no índice: " + posicaoencontrada);
        } else {
            System.out.println("Elemento não encontrado no vetor");
        }
    }
}