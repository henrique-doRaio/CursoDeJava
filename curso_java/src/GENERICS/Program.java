package GENERICS;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<String> printService = new PrintService<String>();
        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            printService.addValue(value);
        }
        printService.print();
        String x = String.valueOf(printService.first());
        System.out.println("First: " + x);
        sc.close();
    }
}
