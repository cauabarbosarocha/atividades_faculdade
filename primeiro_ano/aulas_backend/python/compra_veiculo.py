# pega o valor do carro
preco_carro = int(input('Digite o valor do carro: '))
# dá o valor final se for à vista
desconto_vinte = (20 / 100) * preco_carro
valor_final_com_desconto_vinte = preco_carro - desconto_vinte

print(f'O preço final à vista com desconto de 20% é de: {valor_final_com_desconto_vinte}')

# irá calcular o valor de cada parcela e valor final com a taxa
def simula_parcelamento(preco):
    for parcelas in range(6,61,6): # gera parcelas de 6 à 60
        taxa_parcela = (parcelas // 6) * 0.03 # 30% de desconto
        valor_juros = preco * (1 + taxa_parcela) # gera valor final com taxa
        valor_parcela = valor_juros / parcelas # gera valor das parcelas
        print(f'{parcelas}x de R${valor_parcela:.2f} | Total: R${valor_juros:.2f}')

simula_parcelamento(preco_carro)