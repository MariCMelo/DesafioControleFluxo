import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws InvalidParameterException {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();

            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
            System.out.println("Envie valores inteiros");
            sc.nextLine();

        } catch (InvalidParameterException e2) {
            System.out.println("O primeiro número enviado não pode ser maior que o primeiro, reenvie novos valores!");
        } finally {
            sc.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws InputMismatchException {

        if (parametroUm < parametroDois)
            throw new InvalidParameterException(
                    "O primeiro número enviado não pode ser maior que o primeiro, reenvie novos valores!");

        int contagem = parametroUm - parametroDois;
        System.out.println(contagem);

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}