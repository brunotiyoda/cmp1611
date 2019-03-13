package exerciciocinco;

import java.util.Locale;
import java.util.Scanner;

public class IFTM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String mensagem = "Final score: ";

        int numeroDeAlunos = 0;
        double soma = 0;
        double nota = 0;

        System.out.println("Informe a quantidade de alunos: ");
        numeroDeAlunos = scanner.nextInt();

        System.out.println("Informe as notas: ");
        for (int i = 1; i <= numeroDeAlunos; i++) { // quantidade de alunos
            System.out.println("Estudante #" + i + ":");
            for (int j = 0; j < 3; j++) {  // até 3 notas
                nota = scanner.nextDouble();
                soma += nota;
            }
            System.out.println(mensagem + soma);
        }

        scanner.close();
    }
}
