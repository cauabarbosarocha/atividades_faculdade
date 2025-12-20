public class TesteHeranca {
     public static void main(String[] args) {
        Bebida bebida = new Bebida("Suco de Laranja", "Laranja, Água, Açúcar", 5.0, 500);

        System.out.println("Bebida: " + bebida.getNome());
        System.out.println("Ingredientes: " + bebida.getIngredientes());
        System.out.println("Custa R$ " + bebida.getPreco());
        System.out.println("Seu tamanho é de " + bebida.getTamanho() + "ml");
     }
}
