package conta_bancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Dados data ;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your bank accont number : ");
        int numero = sc.nextInt();

        System.out.println("Enter your name of account :");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit(y/n)?");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.println("enter a initial value :");
            double depositoInicial = sc.nextDouble();
            data = new Dados(numero , name , depositoInicial);

            System.out.println("Enter a deposit value: ");
            double emprestimo = sc.nextDouble();;
            data.deposit(emprestimo);
            System.out.println(data.toString());
        } else {
            data = new Dados(name, numero);
            System.out.println(data.toString());

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(data.toString());

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
         data.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(data);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        data.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(data);
        sc.close();
    }
}
