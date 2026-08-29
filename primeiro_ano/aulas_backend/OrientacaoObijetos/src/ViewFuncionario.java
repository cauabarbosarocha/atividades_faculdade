import br.com.fiap.empresa.model.PercentualInvalidoException;
import br.com.fiap.empresa.model.Funcionario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario("Thiago", 1481);
        try {
            System.out.println("Qual o percentual para o aumento do salário?");
            int per = sc.nextInt();
            fun.aumentarSalario(per);
            System.out.println("Novo salário: " + fun.getSalario());
        } catch (PercentualInvalidoException e) {
            System.out.println("O percentual não pode ser negativo");
        } catch (InputMismatchException e) {
            System.err.println("Valor percentual inválido");
        } finally {
            sc.close();
        }
    }
}
