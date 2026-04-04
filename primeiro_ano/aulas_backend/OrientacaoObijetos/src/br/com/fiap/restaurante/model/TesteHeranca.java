package br.com.fiap.restaurante.model;
public class TesteHeranca {
     public static void main(String[] args) {
        Bebida bebida = new Bebida("Suco de Laranja", "Laranja, Água, Açúcar", 5.0, 500);
        PratoQuente prato = new PratoQuente("Strogonoff", "Carne, Creme de Leite, Molho de Tomate", 20.0, 2);
      //   Produto produto = new Produto(); // Isso causará um erro de compilação 

        System.out.println(bebida.getResumo());
        System.out.println(prato.getResumo());
     }
}
