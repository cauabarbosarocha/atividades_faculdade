package br.com.fiap.fintech.model;

// Subclasse que herda de Conta (Herança: 'extends Conta')
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial; // Atributo exclusivo da Conta Corrente

    // Construtor da subclasse que reutiliza o construtor da superclasse usando 'super'
    public ContaCorrente(String numeroConta, String agencia, double saldo, String tipo, double limiteChequeEspecial) {
        super(numeroConta, agencia, saldo, tipo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Polimorfismo: Sobrescrita do método da superclasse para ter comportamento próprio
    @Override
    public void calcularTaxaManutencao() {
        double taxa = 20.0;
        this.saldo -= taxa;
        System.out.println("Executando método calcularTaxaManutencao (Polimórfico - Conta Corrente). Taxa de R$ " + taxa + " aplicada.");
    }

    // Getter e Setter do atributo específico
    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) { this.limiteChequeEspecial = limiteChequeEspecial; }
}