package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int numberNegative = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++){
                mat [i][j] = sc.nextInt();
                if (mat[i][j] < 0 ) {
                    numberNegative = 1 + numberNegative;
                }
            }
        }

        System.out.print("Main diagonal: ");

        for (int i = 0 ; i < n ; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.print(" ");

        System.out.print("Negative numbers = " + numberNegative);

    }
}
