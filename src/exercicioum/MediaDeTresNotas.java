package exercicioum;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeTresNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String mensagem = "Final score: ";
        double soma = 0;
        double nota = 0;

        System.out.println("Informe as notas: ");
        for (int i = 0; i < 3; i++) {
            nota = scanner.nextDouble();
            soma += nota;
        }

        if (soma < 60.00) {
            System.out.println(mensagem + soma);
            System.out.println("FALIED");
        } else {
            System.out.println(mensagem + soma);
        }

        scanner.close();
    }

}
