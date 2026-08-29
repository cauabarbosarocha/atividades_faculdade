import java.util.InputMismatchException;
import java.util.Scanner;
public class ViewTratamentoExcecoes {
    static void main(String[] args) {
//      Exemplo de utilização de try catch
//        double valorDigitado;
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um valor numérico:");
//        try {
//            valorDigitado = leitor.nextDouble();
//        } catch (Exception e){
//            System.out.println("Algo errado ocorreu ao tentar armazenar");
//        }
//        System.out.println("Finalizando o prgrama");

        // variaveis e array
        double notas[] = new double[3];
        double somaNotas = 0;
        int posicao = 0;

        // criação do scanner para leitura de dados
        Scanner ler = new Scanner(System.in);

        try {
            // loop para inserir as notas
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota da " + (i + 1) + "º avaliação:");
                notas[i] = ler.nextDouble();
                somaNotas += notas[i];
            }

            // loop para exibição da nota de cada avaliação escolhida pelo user
            while (posicao != -1) {
                System.out.println("Digite o número da avaliação para ver a nota, ou -1 para seguir o programa");
                posicao = ler.nextInt();
                if (posicao != -1) {
                    System.out.println("A nota da " + posicao + "º avaliação é " + notas[posicao - 1]);
                }
            }
            // exibe a média do aluno e finaliza o scanner
            System.out.println("A média do aluno é " + somaNotas / notas.length);
            ler.close();
        // Exibe uma mensagem para cada tipo de erro
        } catch (InputMismatchException error) {
            System.out.println("Foi digitado um valor inválido");
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("O número da avaliação não existe.");
        }

        // exibe uma mensagem de finalização
        System.out.println("Finalizando execução.");
    }
}