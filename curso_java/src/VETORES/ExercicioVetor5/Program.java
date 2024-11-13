package VETORES.ExercicioVetor5;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer digitar");
        int n = sc.nextInt();
        double maiorValor = 0.0;
        int posicao = 0;
        double[] vect = new double[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Digite um numero:");
            vect[i] = sc.nextInt();
        }

        for (int i = 0 ; i < n ; i++) {
            if (vect[i] > maiorValor){
                maiorValor = vect[i];
                posicao = i;
            }
        }
        System.out.println("MAIOR VALOR : " + maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);

    }
}
