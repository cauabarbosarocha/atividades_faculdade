// Importação das classes de modelo criadas no subpacote model
import br.com.fiap.fintech.model.Conta;
import br.com.fiap.fintech.model.Investimento;
import br.com.fiap.fintech.model.Relatorio;
import br.com.fiap.fintech.model.Transacao;

// Importação da classe Scanner para permitir a leitura de dados digitados pelo usuário no console
import java.util.Scanner;

public class MenuGestao {
    public static void main(String[] args) {

        // Bloco de Inicialização: Instancia o Scanner para capturar a entrada do teclado e cria a variável de controle do menu
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Bloco de Instanciação de Objetos: Cria objetos com dados iniciais para testar os métodos das classes do projeto
        Transacao transacao = new Transacao(1, "Débito", 250.0, "2026-09-01");
        Relatorio relatorio = new Relatorio(1, "Agosto/2026", 3200.0);
        Investimento investimento = new Investimento("CDB", 1000.0, 0.12, 12);
        Conta conta = new Conta("12345-6", "0001", 1500.0, "Corrente");

        // Bloco de Repetição (Do-While): Garante que o menu continue aparecendo na tela até que o usuário escolha a opção de sair (0)
        do {
            // Exibição das opções do menu interativo para o usuário
            System.out.println("\n===== MENU GESTÃO - FINTECH =====");
            System.out.println("1. Registrar Transação Manual (UC02)");
            System.out.println("2. Importar Extrato Bancário (UC03)");
            System.out.println("3. Sincronizar Fatura de Cartão (UC04)");
            System.out.println("4. Converter Moeda Estrangeira (UC05)");
            System.out.println("5. Gerar Relatório de Gastos (UC06)");
            System.out.println("6. Operações de Conta e Investimentos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Leitura da opção numérica escolhida pelo usuário
            opcao = scanner.nextInt();

            // Bloco de Decisão (Switch-Case): Direciona a execução para o método correspondente à opção digitada
            switch (opcao) {
                case 1:
                    // Executa o caso de uso de transação manual
                    transacao.registrarTransacaoManual();
                    break;
                case 2:
                    // Executa o caso de uso de importação de extrato
                    transacao.importarExtratoBancario();
                    break;
                case 3:
                    // Executa o caso de uso de sincronização de fatura
                    transacao.sincronizarFaturaCartao();
                    break;
                case 4:
                    // Solicita dado adicional (taxa) e executa a conversão de moeda
                    System.out.print("Informe a taxa de conversão: ");
                    Double taxa = scanner.nextDouble();
                    transacao.converterMoedaEstrangeira(taxa);
                    break;
                case 5:
                    // Executa a geração do relatório de gastos
                    relatorio.gerarRelatorioGastos();
                    break;
                case 6:
                    // Executa métodos complementares de conta e investimentos
                    System.out.println("\n--- Operações de Conta e Investimentos ---");
                    conta.consultarSaldo();
                    investimento.calcularRendimento();
                    investimento.aplicar();
                    break;
                case 0:
                    // Mensagem de encerramento do sistema
                    System.out.println("Encerrando o Menu Gestão. Até logo!");
                    break;
                default:
                    // Tratamento para entradas numéricas inválidas
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0); // Condição para manter o loop rodando enquanto o valor for diferente de 0

        // Bloco de Fechamento: Encerra o uso do scanner para liberar recursos de sistema
        scanner.close();
    }
}