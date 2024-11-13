package Default;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount : ");
        Double amount = sc.nextDouble();
        System.out.println("Months : ");
        Integer months = sc.nextInt();

        InterestService is = new USAInterestService(1.0);
        Double payments = is.payments(amount, months);

        System.out.println("payment after "+ months +" months: ");
        System.out.println(String.format("%.2f" , payments));
    }
}
