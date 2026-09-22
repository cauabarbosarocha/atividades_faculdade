import java.util.Scanner;

public class PoltronaCinema {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz representado as poltronas do cinema
        int[][] salaCinema = { // [0] = livre; [1] = ocupado
                {0,0,1,0,0},
                {0,1,1,1,0},
                {1,0,1,0,0},
                {0,0,1,1,1}
        };

        // Exibe uma legenda
        System.out.println("[L]ivre | [O]cupado");

        // Exibe situação atual das poltronas
        for (int i = 0; i < salaCinema.length; i++) {
            for (int j = 0; j < salaCinema[i].length; j++) {
                System.out.print(salaCinema[i][j] == 0 ? "L ": "O ");
            }
        System.out.println(" <- Fila " + (i + 1));
        }

        // Recebendo escolha de fila do usuário
        System.out.println("Escolha a fila:");
        int filaEscolhida = sc.nextInt() - 1; // Ajusta para o índice certo do vetor

        // Recebendo escolha da poltrona do usuário
        System.out.println("Escolha o número da poltrona:");
        int poltronaEscolhida = sc.nextInt() - 1; // Ajusta para o índice certo do vetor

        // Verifica e atualiza a reserva da poltrona
        if (filaEscolhida >= 0 && filaEscolhida < salaCinema.length &&
        poltronaEscolhida >= 0 && poltronaEscolhida < salaCinema[filaEscolhida].length) {
            if (salaCinema[filaEscolhida][poltronaEscolhida] == 0) {
                salaCinema[filaEscolhida][poltronaEscolhida] = 1;
                System.out.println("Poltrona reservada com sucesso!");
            } else {
            System.out.println("A poltrona já está ocupada, por favor escolha novamente uma livre.");
            }
        } else {
            System.out.println("Escolha inválida, tente novamente.");
        }

        // Fechamento do scanner
        sc.close();
    }
}
