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
    }
}