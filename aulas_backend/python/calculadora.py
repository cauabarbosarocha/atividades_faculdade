# Variáveis
operador = int(input(
    "Bem-vindo à calculadora!" \
    " \nPor favor, escolha a operação:" \
    " \n1 - Soma" \
    " \n2 - Subtração" \
    " \n3 - Multiplicação" \
    " \n4 - Divisão" \
    " \nOperador escolhido: "
    ))
numero_1 = float(input("Digite o primeiro número: "))
numero_2 = float(input("Digite o segundo número: "))

# Processamento
resultado = 0
match operador:
    case 1:
        resultado = numero_1 + numero_2
        print(f"O resutado da soma é: {resultado}")
    case 2:
        resultado = numero_1 - numero_2
        print(f"O reultado da subtração é: {resultado}")
    case 3:
        resultado = numero_1 * numero_2
        print(f"o Resultado da multiplicação é: {resultado}")
    case 4:
        if numero_2 != 0:
            resultado = numero_1 / numero_2
            print(f"O resultado da Divisão é: {resultado}")
        else:
            print("[ERRO] Impossível dividir por zero")
    case _:
        print("[ERRO] Operador inválido")