# irá informar a quantidade de membros na reunião
numero_membros = int(input('Defina o número de membros da reunião: '))
# guarda os dias votados
dias_votados = []

# gera um loop para votar o dia da reunião
for x in range(numero_membros):
    dias = input('Escolha um dia para a reunião (segunda-feira, terça-feira, quarta-feira, quinta-feira e sexta-feira): ')
    dias_votados.append(dias)

# cria um dicionário para quantidade de votos de cada dia
contagem_dias = {dia: dias_votados.count(dia) for dia in set(dias_votados)}

# determina o maior número
max_votos = max(contagem_dias.values())

# identidica os dias mais votados caso haja empate
dias_mais_votados = [dia for dia, votos in contagem_dias.items() if votos == max_votos]

# exibe o resultado
if len(dias_mais_votados) == 1:
    print(f'O dia para a reunião foi o {dias_mais_votados[0]}')
else:
    print('Houve empate! Os dias mais votados foram: ')
    for dia in dias_mais_votados:
        print(f'{dia} com {max_votos} voto(s).')
