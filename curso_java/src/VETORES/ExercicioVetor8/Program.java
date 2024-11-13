package VETORES.ExercicioVetor8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        double[] media = new double[n];
        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite do dados do " + (i + 1) + "º aluno");
            System.out.print("Nome:");
            nomes[i] = sc.nextLine();
            System.out.println("Notas:");
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / n;
        }
        System.out.println("ALUNOS APROVADOS: ");
        for (int i = 0; i < n; i++) {
            if (media[i] > 6.0) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
