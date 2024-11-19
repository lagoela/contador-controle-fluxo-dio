import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, inserir um valor númerico");
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }

    }
}
