import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Digite um número inteiro...");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String input = reader.readLine();

            int number = Integer.parseInt(input);

            System.out.println("Tabela de multiplicação de " + number);

            for (int i = 0; i <= 10; i++) {
                int result = number * i;

                System.out.println(number + " x " + i + " = " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }

    }
}
