// Import para leittura de dados e armazenamento
import java.util.Scanner;

import br.com.fiap.usbsystem.model.Endereco;
import br.com.fiap.usbsystem.model.Vendedor;

public class ViewVendedor {
    // Exibindo menu para o usuário
    private static void exibirMenu() {
        String menu = """
                ========= MENU VENDEDOR ========
                1. Cadastrar/Alterar Vendedor
                2. Exibir Vendedor
                3. Sair
                Digite a opção desejada:
                ==================================
                """;
        System.out.println(menu);
    }
    // Método de cadastro do vendedor
    private static Vendedor cadastrarVendedor(Scanner scanner) {
        // Objeto para armazenar os dados do vendedor
        Vendedor vendedor = new Vendedor();
        // Solicita o nome do vendedor
        System.out.println("Digite o nome do vendedor:");
        vendedor.setNome(scanner.nextLine());
        // Solicita o endereço do vendedor
        System.out.println("Informe o nome da rua, "+
                "o número, o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando [enter] ao final de cada um:");
        vendedor.setEndereco(new Endereco(
            scanner.nextLine(),
            Integer.parseInt(scanner.nextLine()),
            scanner.nextLine(),
            Integer.parseInt(scanner.nextLine()),
            scanner.nextLine(),
            scanner.nextLine()));
        // Solicita o CPF do vendedor
        System.out.println("Digite o CPF do vendedor:");
        vendedor.setCpf(scanner.nextLine());
        // Solicita o salário do vendedor
        System.out.println("Digite o salário do vendedor:");
        vendedor.setSalarioFixo(scanner.nextDouble());
        // Solicita o total de vendas semestrais do vendedor
        System.out.println("Digite o total de vendas semestrais do vendedor:");
        vendedor.setVendasSemestrias(scanner.nextDouble());
        // Retorna o objeto vendedor preenchido
        return vendedor;
    }
    // Método principal da classe em loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedor vendedor = null;
        int opcao = 0;
        // Loop do menu
        do {
            exibirMenu();
            opcao = scanner.nextInt(); 
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    vendedor = cadastrarVendedor(scanner);
                    break;
                case 2:
                    if (vendedor != null) {
                        System.out.println(vendedor.getDetalhamento());
                    } else {
                        System.out.println("Nenhum vendedor cadastrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }
}
