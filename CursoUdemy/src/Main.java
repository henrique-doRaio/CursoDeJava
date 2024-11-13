import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        locale.setdafault(Locale.US);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Coloque o valor do traingulo X");
        xA = sc.nextDouble();
        xB = =sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Coloque o valor do trangulo Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo x = %.4f%n", areaX);
        System.out.printf("Triangulo y = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area é a X");

        } else {
            System.out.println("A maior area é a Y");
            {
                sc.close();
            }
        }
