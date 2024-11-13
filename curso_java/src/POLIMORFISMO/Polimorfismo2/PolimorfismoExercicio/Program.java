package POLIMORFISMO.Polimorfismo2.PolimorfismoExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Double increase = 0.0 ;
        for(int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.println("Employee " + (i+1) + " data: ");
            System.out.println("Outsourced(y/n)");
            char resp = sc.nextLine().charAt(0);
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours: ");
            Integer hours = sc.nextInt();
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (resp == 'y'){
                System.out.println("Additional charge:");
                increase = sc.nextDouble();
                Employee employee = new OutSourcedEmployee(name , hours , valuePerHour , increase);
                list.add(employee);
            }
            else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);

            }

        }
        System.out.println("PAYMENTS");

        for(Employee e : list){
            System.out.println(e);
        }
    }
}
