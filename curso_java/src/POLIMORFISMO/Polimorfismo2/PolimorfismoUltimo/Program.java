package POLIMORFISMO.Polimorfismo2.PolimorfismoUltimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Dados> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        Double health ;
        int employee;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Tax payer " + (i + 1) + " data: ");
            System.out.println("Individual or company(i/c)?");
            char cha = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();
            if (cha == 'i'){
                System.out.println("Health expenditures: ");
                health = sc.nextDouble();
                Dados dados = new Individuals(name , annualIncome, health);
                list.add(dados);
            } else if (cha == 'c') {
                System.out.print("Number of employee: ");
                employee = sc.nextInt();
                Dados dados = new Company(name , annualIncome, employee);
                list.add(dados);
            }
        }
        System.out.println("TAXES PAID: ");

        for (Dados da : list){
            System.out.println(da.getName() + ": $" + String.format("%.2f" , da.tax()));
        }
        Double sum = 0.0;
        for (Dados da : list){
            sum += da.tax();
        }

        System.out.println("TOTAL TAXES: $ " + sum );

    }

}
