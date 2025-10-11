package aulas_backend.java.exercicios;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ensolarado, fimDeSemana;
        // boolean ensolarado;
        // boolean fimDeSemana;

        // Recebe as informações
        System.out.println("Está ensolarado? [true para sim | false para não] ");
        ensolarado = scanner.nextBoolean();
        System.out.println("É fim de semana? [true para sim | false para não] ");
        fimDeSemana = scanner.nextBoolean();

        // Verifica as condições para o destino
        if (ensolarado && fimDeSemana) {
            System.out.print("Vamos para a praia e aproveitar o Sol.");
        } else {
            System.out.print("Vamos para o parque e andar por lá.");
        }

        scanner.close();

    }
}