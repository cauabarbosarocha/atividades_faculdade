print(
    "Bem-vindo ao Café Python!" \
    "\nEscolha o tamnho do seu café:" \
    "\n(P)equeno" \
    "\n(M)édio" \
    "\n(G)rande" \
    )
tamanho_cafe = input("Tamanho escolhido: ").upper()

print(
    "Escolha o tipo de café:" \
    "\n(C)appuccino" \
    "\n(L)atte" \
    "\n(E)xpresso" \
)
tipo_cafe = input("Tipo escollhido: ").upper()

preco = 0

match tamanho_cafe:
    case "P":
        preco += 2.50
    case "M":
        preco += 3.00
    case "G":
        preco += 3.50
    case _:
        print("Tamanho inválido")
        exit()

match tipo_cafe:
    case "C":
        preco += 1.50
        print(f"O preço total do seu Cappuccino é: R$ {preco:.2f}")
    case "L":
        preco += 2.00
        print(f"O preço total do seu Latte é: R$ {preco:.2f}")
    case "E":
        preco += 2.50
        print(f"O preço total do seu Expresso é: R$ {preco:.2f}")
    case _:
        print("Tipo inválido")
        exit()

print(
    "Seu pedido foi confirmado!\n" \
    f"Total a ser pago: R$ {preco:.2f}")
