package MatrizesEx;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows will there be : ");
        int rows = sc.nextInt();
        System.out.print("How many columns will there be :");
        int columns = sc.nextInt();

        int[][] mat = new int[rows][columns];

        for (int i = 0 ; i < mat.length; i++){
            for (int j = 0 ; j < mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Position: ");
        int x = sc.nextInt();

        for (int i = 0 ; i < mat.length; i++){
            for (int j = 0 ; j < mat.length; j++){
                if (j > 0) {
                    System.out.print("Left: " + mat[i][(j - 1)]);
                }
                if (i > 0){
                    System.out.print("Up: " + mat[i-1][j]);
                }
                if (j < mat[i].length-1){
                    System.out.print("Right: " + mat[i][j+1]);
                }
                if (i < mat.length - 1){
                    System.out.print("Down: " + mat[i+1][j]);
                }
            }
        }
        sc.close();
    }
}
