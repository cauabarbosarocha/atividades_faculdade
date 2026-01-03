// Imports necessários para a leitura de dados e ultilização das classes
import java.util.Scanner;

import br.com.fiap.usbsystem.model.Endereco;
import br.com.fiap.usbsystem.model.Gerente;

public class ViewGerente {
    // Menu de interação com o uruário
    private static void exibirMenu() {
        String menu = """
                ====== MENU GERENTE ======
                1. Cadastrar/Alterar Gerente
                2. Exibir gerentes
                3. Sair
                Digite a opção desejada:
                """;
        System.out.println(menu);
    }

    // Método de cadastro de gerente
    private static Gerente cadastraGerente(Scanner scanner) {
        // Objeto para armazenar os dados do gerente e ler os dados do usuário
        Gerente gerente = new Gerente();
        // Solicita o nome do gerente
        System.out.println("Digite o nome do gerente:");
        gerente.setNome(scanner.nextLine());
        // Solicita o endereço do gerente
        System.out.println("Informe o nome da rua," +
                " o número, o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando [enter] ao final de cada um: ");
        gerente.setEndereco(new Endereco(scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()),
                scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine()));
        // Solicita o CPF do gerente
        System.out.println("Digite o CPF do gerente:");
        gerente.setCpf(scanner.nextLine());
        // Solicita o salário fixo do gerente
        System.out.println("Informe o salário fixo do gerente:");
        gerente.setSalarioFixo(scanner.nextDouble());
        scanner.nextLine();
        // Solicita a sala do gerente
        System.out.println("Informe a sala do gerente:");
        gerente.setSala(scanner.nextInt());
        // Solicita o ramal do gerente
        System.out.println("Informe o ramal do gerente:");
        gerente.setRamal(scanner.nextInt());
        scanner.nextLine();
        // Solicita o faturamento semestral do gerente
        System.out.println("Informe o faturamento semestral do gerente:");
        gerente.setFaturamentoSemestral(scanner.nextDouble());

        return gerente;
    }

    // Método principal da classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = null;
        int opcao;
         
        // Loop do menu
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            // Switch para tratar as opções do menu
            switch (opcao) {
                case 1:
                    gerente = cadastraGerente(scanner);
                    break;
                case 2:
                     if (gerente != null) {
                        System.out.println(gerente.getDetalhamento());
                     } else {
                        System.out.println("Nenhum gerente cadastrado.");
                     };
                     break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }

}
