package exerciciotres;

import java.util.Locale;
import java.util.Scanner;

/*
* Fazer um programa para ler dois números inteiros e mostrar a soma
de todos os números ímpares entre eles, inclusive eles próprios.
*/
public class ExercicioTres {

    private static int forMenorQueZero(int numero) {
        int somaNumerosImpares = 0;
        for (int i = numero; i < 0; i++) {
            if (i % 2 != 0) {
                somaNumerosImpares += i;
            }
        }
        return somaNumerosImpares;
    }

    private static int forMaiorQueZero(int numero) {
        int somaNumerosImpares = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                somaNumerosImpares += i;
            }
        }
        return somaNumerosImpares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Entre com dois números inteiro: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        if (number1 < 0) {
            System.out.println(forMenorQueZero(number1));
        } else {
            System.out.println(forMaiorQueZero(number1));
        }

        if (number2 < 0) {
            System.out.println(forMenorQueZero(number2));
        } else {
            System.out.println(forMaiorQueZero(number2));
        }

    }

}
