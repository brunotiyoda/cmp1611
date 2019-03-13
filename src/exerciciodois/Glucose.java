package exerciciodois;

import java.util.Locale;
import java.util.Scanner;

public class Glucose {

    private static String taxGlucose(double glucose) {
        if (glucose <= 100) {
            return "Notmal";
        } else if (glucose > 100 && glucose <= 100) {
            return "High";
        } else {
            return "Diabetes";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter glucose measure: ");
        double glucose = scanner.nextDouble();

        System.out.println(taxGlucose(glucose));
    }

}
