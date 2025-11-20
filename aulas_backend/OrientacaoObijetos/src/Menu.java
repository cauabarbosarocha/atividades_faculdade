import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.Item;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);
        // Criação dos objetos
        PersonagemMagico personagem = null;
        HabilidadeEspecial habilidade = null;
        Item item = null;

        // Declaração de variáveis
        int op, nivelMana, custoMana, nivelPoder, qtd, nivelAtual;
        String nome, poderMagico, nomeHabilidade, nomeItem, descricaoItem, ataque;
        boolean habilitada, raro;

        // Loop do menu
        do {
            System.out.println(
                    "Escolha uma opção: \n1. Personagem \n2. Exibir Personagem \n3. Itens \n4. Exibir item \n5. Atacar \n6. Aumentar a Mana \n7. Ativar Habilidade Especial \n0. Sair");
            op = sc.nextInt();

            // Processamento da opção escolhida
            switch (op) {
                case 1:
                    // Entrada dos dados do personagem
                    System.out.println("Digite o nome do personagem:");
                    nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder mágico do personagem:");
                    poderMagico = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de mana do personagem:");
                    nivelMana = sc.nextInt();
                    // Atribuição dos valores ao objeto personagem
                    personagem = new PersonagemMagico(nome, poderMagico, nivelMana);

                    // Entrada dos dados da habilidade especial
                    System.out.println("Digite o nome da habilidade especial:");
                    nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de mana da Habilidade:");
                    custoMana = sc.nextInt();
                    System.out.println("A hailidade está ativa? [true/false]");
                    habilitada = sc.nextBoolean();
                    // Atribuição dos valores ao objeto da habilidade
                    habilidade = new HabilidadeEspecial(nomeHabilidade, custoMana, habilitada);
                    // atribui a habilidade ao personagem criado
                    if (personagem != null) {
                        personagem.setHabilidadeEspecial(habilidade);
                    }
                    break;
                case 2:
                    // Exibição dos dados do personagem
                    if (personagem != null && habilidade != null) {
                        System.out.printf(
                                "Nome: %s%nPoder Mágico: %s%nNível de Mana: %d%nNome da Habilidade: %s%nCusto de mana: %d%nHabilidade ativa: %b%n",
                                personagem.getNome(), personagem.getPoderMagico(), personagem.getNivelMana(),
                                habilidade.getNomeHabilidade(), habilidade.getCustoMana(), habilidade.isHabilitada());
                        break;
                    } else {
                        System.out.println("Nenhum personagem cadastrado ainda.");
                    }
                    continue;
                case 3:
                    // Entrada dos dados do item
                    System.out.println("Digite o nome do item:");
                    nomeItem = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item:");
                    descricaoItem = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? [true/false]:");
                    raro = sc.nextBoolean();
                    System.out.println("Digite o nível de poder do item:");
                    nivelPoder = sc.nextInt();
                    // Atribuição dos valores ao item
                    item = new Item(nomeItem, descricaoItem, raro, nivelPoder);
                    break;
                case 4:
                    // Exibição dos dados do item
                    if (item != null) {
                        System.out.printf("Nome: %s%nDescrição: %s%nRaro: %b%nNível de Poder: %d%n", item.getNomeItem(),
                                item.getDescricaoItem(), item.isRaro(), item.getNivelPoderItem());
                    } else {
                        System.out.println("Nenhum item cadastrado ainda.");
                    }
                    continue;
                case 5:
                    // Realiza o ataque do personagem
                    System.out.println("Digite o nome do ataque:");
                    ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 6:
                    System.out.println("Digite a quantidade de energia:");
                    qtd = sc.nextInt();
                    nivelAtual = personagem.aumentarMana(qtd);
                    System.out.printf("Nivel atual de energia: %d", nivelAtual);
                    break;
                case 7:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 0:
                    // Saída do programa
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        } while (op != 0);
        sc.close();
    }
}
