// Import para leitura de dados
import java.util.Scanner;
// Import das classes para cadastro
import br.com.fiap.usbsystem.model.Endereco;
import br.com.fiap.usbsystem.model.Programador;

public class ViewProgramador {
    // Exibindo menu para o usuário
    private static void exibirMenu() {
        String menu = """
                ======== MENU PROGRAMADOR ========
                1. Cadastrar/Alterar Programador
                2. Exibir Programador
                3. Sair
                Digite a opção desejada:
                ==================================
                """;
        System.out.println(menu);
    }
    // Método de cadastro do programador
    private static Programador cadastrarProgramador(Scanner scanner) {
        // Objeto para armazenar os dados do programador
        Programador programador = new Programador();
        // Solicita o nome do programador
        System.out.println("Digite o nome do programador:");
        programador.setNome(scanner.nextLine());
        // Solicita o endereço do programador
        System.out.println("Informe o nome da rua, "+
                "o número, o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando [enter] ao final de cada um:");
        programador.setEndereco(new Endereco(
            scanner.nextLine(),
            Integer.parseInt(scanner.nextLine()),
            scanner.nextLine(),
            Integer.parseInt(scanner.nextLine()),
            scanner.nextLine(),
            scanner.nextLine()));
        // Solicita o CPF do programador
        System.out.println("Digite o CPF do programador:");
        programador.setCpf(scanner.nextLine());
        // Solicita o salário do programador
        System.out.println("Digite o salário do programador:");
        programador.setSalarioFixo(scanner.nextDouble());
        // Solicita o ramal do programador
        System.out.println("Digite o ramal do programador:");
        programador.setRamal(scanner.nextInt());
        // Retorna o objeto programador preenchido
        return programador;
    }
    // Método principal da classe em loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programador programador = null;
        int opcao = 0;
        // Loop do menu
        do {
            exibirMenu();
            opcao = scanner.nextInt(); 
            scanner.nextLine();
            // Switch para tratar as opções do menu
            switch (opcao) {
                case 1:
                    // Chama o método de cadastro
                    programador = cadastrarProgramador(scanner);
                    break;
                case 2:
                    // Exibe os dados do programador cadastrado
                    if (programador != null) {
                        System.out.println(programador.getDetalhamento());
                    } else {
                        System.out.println("Nenhum programador cadastrado.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        // Fechamento do scanner
        scanner.close();
    }

}
