package VETORES.ExercicioVetor3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int pessoasMenores = 0;
        double sum = 0.0;

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Dados da " + (i+1) + "º pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            sum += alturas[i];

            if ( idades[i] < 16 ){
                pessoasMenores = pessoasMenores + 1;
            }
        }

        double porcentagem = (pessoasMenores * 100) / n;
        double media = sum / n;
        System.out.printf("Media em altura: %.2f%n", media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (int i = 0 ; i < n ; i++) {
            if ( idades[i] < 16 ){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
