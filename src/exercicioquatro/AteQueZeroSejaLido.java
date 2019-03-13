package exercicioquatro;

import java.util.Locale;
import java.util.Scanner;

public class AteQueZeroSejaLido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero;

        do {
            System.out.println("Entre com o valor: ");
            numero = scanner.nextDouble();

            double sqrt = Math.pow(numero, 2);
            System.out.println(sqrt);
        } while (numero != 0);

        scanner.close();
    }

}
