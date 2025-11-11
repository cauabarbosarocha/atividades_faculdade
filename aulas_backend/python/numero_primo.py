# Solicita ao usuário que inrira um número intieiro
numero = int(input("Digite um número inteiro positivo maior que 1: "))

# Verifica se o número é primo
if numero <= 1:
    print("Número inválido. Por favor, insira um número maior ou iqual que 1.")
else:
    eh_primo = True

    for i in range(2, numero):
        if numero % i == 0:
            eh_primo = False
            break

    if eh_primo:
        print(f"O número {numero} é primo.")
    else:
        print(f"O número {numero} não é primo.")
