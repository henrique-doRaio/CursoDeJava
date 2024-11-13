package VETORES.ExercicioVetor6;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai digitar?");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Digite os valores do vetor A");
            vectA[i] = sc.nextInt();
        }

        System.out.println("AGORA VALORES DO B:");

        for (int i = 0 ; i < n ; i++){
            System.out.println("Digite os valores do vetor B");
            vectB[i] = sc.nextInt();
        }
        System.out.println("VALOR RESULTANTE: ");
        for (int i = 0 ; i < n ; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
            }
        }
    }

