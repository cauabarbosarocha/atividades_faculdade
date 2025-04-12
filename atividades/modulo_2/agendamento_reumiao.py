# irá informar a quantidade de membros na reunião
numero_membros = int(input('Defina o número de membros da reunião: '))
# guarda os dias votados
dias_votados = []

# gera um loop para votar o dia da reunião
for x in range(numero_membros):
    dias = input('Escolha um dia para a reunião (segunda-feira, terça-feira, quarta-feira, quinta-feira e sexta-feira): ')
    dias_votados.append(dias)

dias_votados.count()

print(dias_votados)
