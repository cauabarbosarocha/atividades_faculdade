ensolarado = input("Está ensolarado? [True para sim | False para não] ").lower() == 'true'
fim_de_semana = input("è final de semana? [True para sim | False para não] ").lower() == 'true'

if ensolarado and fim_de_semana:
    print("Vamos para a praia aproveitar o Sol.")