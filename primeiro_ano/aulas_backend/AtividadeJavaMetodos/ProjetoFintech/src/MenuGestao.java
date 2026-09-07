import br.com.fiap.fintech.model.ContaCorrente;
import br.com.fiap.fintech.model.Investimento;
import br.com.fiap.fintech.model.Relatorio;
import br.com.fiap.fintech.model.Transacao;

import java.util.Scanner;

public class MenuGestao {
    public static void main(String[] args) {
        // Inicializa o leitor de entrada do console (teclado)
        Scanner scanner = new Scanner(System.in);

        // Instanciação dos objetos exigida pela atividade (incluindo ContaCorrente para herança/polimorfismo)
        ContaCorrente conta = new ContaCorrente("12345-6", "0001", 1500.0, "Corrente", 500.0);
        Transacao transacao = new Transacao("PIX", 150.0, "2026-09-07");
        Relatorio relatorio = new Relatorio("2026-09-07", "Mensal", 3200.0);
        Investimento investimento = new Investimento("CDB", 1000.0, 0.12, 12);

        int opcao;

        // Laço de repetição do menu interativo
        do {
            System.out.println("\n--- Menu Gestao ---");
            System.out.println("1. Registrar Transação Manual");
            System.out.println("2. Importar Extrato Bancário");
            System.out.println("3. Sincronizar Extrato Cartão");
            System.out.println("4. Converter Moeda Estrangeira");
            System.out.println("5. Gerar Relatório de Gastos");
            System.out.println("6. Operações de Conta e Investimentos (Testes)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção digitada pelo usuário
            opcao = scanner.nextInt();

            // Estrutura de decisão para direcionar a execução baseada na opção escolhida
            switch (opcao) {
                case 1:
                    transacao.registrarTransacaoManual();
                    break;
                case 2:
                    transacao.importarExtratoBancario();
                    break;
                case 3:
                    transacao.sincronizarExtratoCartao();
                    break;
                case 4:
                    System.out.print("Informe a taxa de conversão: ");
                    double taxa = scanner.nextDouble();
                    transacao.converterMoedaEstrangeira(taxa);
                    break;
                case 5:
                    relatorio.gerarRelatorioDetalhado();
                    break;
                case 6:
                    // Chamada de métodos dos objetos instanciados para cumprir a atividade
                    conta.consultarSaldo();
                    conta.depositar(200.0);
                    conta.calcularTaxaManutencao(); // Executa o método polimórfico da ContaCorrente
                    investimento.aplicar();
                    break;
                case 7:
                    System.out.println("Encerrando o Menu. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7); // Continua rodando o menu até que a opção seja 7 (Sair)

        // Fecha o scanner para liberar recursos do sistema
        scanner.close();
    }
}