total_alunos = 10
soma_notas = 0.0

print(f"Digite as notas de {total_alunos} alunos:")

for i in range(total_alunos):
    nota = float(input(f"Nota do aluno {i + 1}: "))
    soma_notas += nota

media_sala = soma_notas / total_alunos
print(f"A média das notas da sala é; {media_sala:.1f}")