package VETORES.ExercicioVetor2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0 ; i < n ; i++) {
            sum = sum + vect[i];

        }
        avg = sum / n;

        System.out.printf("SOMA: " + sum );
        System.out.println("");
        System.out.printf("MEDIA: " +  avg);
    }
}
