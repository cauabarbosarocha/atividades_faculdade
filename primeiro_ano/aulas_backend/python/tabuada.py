print("Tabela de Multiplição")

while range(1, 11):
    for i in range(1, 11):
        # Linha em branco entre as tabuadas
        print()

        print(f"Tabuada do {i}: ")

        for j in range(1, 11):
            print(f"{i} x {j} = {i * j}")

    break