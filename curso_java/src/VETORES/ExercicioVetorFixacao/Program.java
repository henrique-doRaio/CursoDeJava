package VETORES.ExercicioVetorFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("We have 10 rooms available.");
        System.out.println("How many rooms will be rented ? ");
        int n = sc.nextInt();
        int[] quarto = new int[10];
        String[] name = new String[10];
        String[] email = new String[10];
        if (n < 10) {
            for (int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("Rent #" + (i + 1));
                System.out.println("Name:");
                String nome = sc.nextLine();
                System.out.println("Email:");
                String nomeEmail = sc.nextLine();
                System.out.println("Room:");
                int room = sc.nextInt();
                name[(room - 1)] = nome;
                email[(room - 1)] = nomeEmail;
            }
        } else {
            System.out.println("the maximum number of rooms is 10. put it back");
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (name[i] != null) {
                System.out.println((i + 1 ) + ": " + name[i] + " , " + email[i]);
            }
        }
    }
}

