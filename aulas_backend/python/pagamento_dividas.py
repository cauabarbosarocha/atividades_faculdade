# Entrada do valor da dívida
valor_original = float(input("Digite o valor da dívida: R$ "))

# Tabela de juros por número de parcelas
tabela_juros = {
    1: 0,
    3: 10,
    6: 15,
    9: 20,
    12: 25
}

# Cabeçalho da tabela
print(f"\n{'Valor da Dívida':>15} | {'Juros (%)':>10} | {'Parcelas':>10} | {'Valor da Parcela':>18}")
print("-" * 65)

# Estrutura de repetição para montar a tabela
for parcelas, juros in tabela_juros.items():
    valor_juros = valor_original * (juros / 100)
    valor_final = valor_original + valor_juros
    valor_parcela = valor_final / parcelas
    print(f"R${valor_final:13.2f} | {juros:10.0f}% | {parcelas:10} | R${valor_parcela:16.2f}")
