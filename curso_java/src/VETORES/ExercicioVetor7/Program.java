package VETORES.ExercicioVetor7;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();
        int maisVelho = 0;
        String nomeVelho = "";
        int[] idade = new int[n];
        String[] nome = new String[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Dados da " + (i+1) + "º pessoa:");
            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();

        }
        for (int i = 0 ; i < n ; i++){
            if (idade[i] > maisVelho){
                maisVelho = idade[i];
                nomeVelho = nome[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeVelho + " | com ele tendo: " + maisVelho + " anos");
    }
}
