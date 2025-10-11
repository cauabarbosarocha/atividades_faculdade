# Solicitação de dados ao usuário
ValorCompra = float(input("Digite o valor de suas compras: "))
Frequencia = int(input("Digite o número de vezes que você comprou na loja: "))

#  Verificação das condições para a premiação
if ValorCompra >= 2000.00 and Frequencia >= 10:
    print("Parabéns! Você se tornou um cliente VIP e ganha 25& de desconto em suas próximas compras!")
elif ValorCompra >= 1000.00:
    print("voc~e se tornou um cliente Gold e ganha 10% de desnconto em suas próximas compras!")
elif ValorCompra >= 500.00 or Frequencia >= 2:
    print("Você se tornou um cliente Silver e ganha 5% de desconto em suas próximas compras!")
else:
    print("Você é um cliente Bronze, continue comprando para ganhar descontos!")
