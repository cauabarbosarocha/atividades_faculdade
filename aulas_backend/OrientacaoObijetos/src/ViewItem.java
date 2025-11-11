import java.util.Scanner;

public class ViewItem {
    public static void main(String[] args) {
        // Criaçaõ do objeto Scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);
        // Criação do objeto item
        Item item = null;
        // Declaração de variáveis
        int op, nivelPoder;
        String nome, descricao;
        boolean raro;

        // Loop do menu
        do {
            // Exibição do menu
            System.out.println("Escolha uma opção: \n1. Cadastrar item \n2. Exibir item \n0. Sair");
            op = sc.nextInt();

            // Processamento da opção escolhdia
            switch (op) {
                case 1:
                    // Entrada dos dados do item
                    System.out.println("Digite o nome do itme:");
                    nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do itme:");
                    descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? [true/false]:");
                    raro = sc.nextBoolean();
                    System.out.println("Digite o nível de poder do item:");
                    nivelPoder = sc.nextInt();
                    // Atribuição dos valores ao item
                    item = new Item(nome, descricao, raro, nivelPoder);
                    break;
                case 2:
                    // Exibição dos dados do item
                    if (item != null) {
                        System.out.printf("Nome: %s%nDescrição: %s%nRaro: %b%nNível de Poder: %d%n", item.nome, item.descricao, item.raro, item.nivelPoder);
                    } else {
                        System.out.println("Nenhum item cadastrado ainda.");
                    }
                    continue;
                case 0:
                    System.out.println("Finalizando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    continue;
            }
        } while (op != 0);
        // Fechamento do Scanner
        sc.close();
    }
}
