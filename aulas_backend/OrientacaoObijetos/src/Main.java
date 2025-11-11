import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);
        // Criação do objeto PersonagemMagico
        PersonagemMagico personagem = null;
        // Declaração de variáveis
        int op, nivelMana;
        String nome, poderMagico;

        // Loop do menu
        do {
            System.out.println("Escolha uma opção: \n1. Personagem \n2. Exibir Personagem \n0. Sair");
            op = sc.nextInt();

            // Processamento da opção escolhida
            switch (op) {
                case 1:
                    // Entrada dos dados do personagem
                    System.out.println("Digite o nome do personagem:");
                    nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder mágico do personagem:");
                    poderMagico = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de mana do persoangem:");
                    nivelMana = sc.nextInt();
                    // Atribuição dos valores ao objeto personagem
                    personagem =  new PersonagemMagico(nome, poderMagico, nivelMana);
                    break;
                case 2:
                    // Exibição dos dados do personagem
                    if (personagem != null) {
                        System.out.printf("Nome: %s%nPoder Mágico: %s%nNível de Mana: %d%n", personagem.nome, personagem.poderMagico, personagem.nivelMana);
                        break;
                    } else {
                        System.out.println("Nenhum personagem cadastrado ainda.");
                    }
                    continue;
                case 0:
                    // Saída do programa
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
                    continue;
            }
        } while (op != 0);
        sc.close();
    }
}
