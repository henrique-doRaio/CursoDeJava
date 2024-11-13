package LISTAS.ListaExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas vão ser registradas?");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Emplyoee #" + (i + 1));
            System.out.print("Id:");
            Integer id = sc.nextInt();
            System.out.print("Name:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, nome, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.print("This id does not exist! ");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.print("List of employee: ");

        for ( Employee emp :  list){
            System.out.print(emp);

        }



        sc.close();
    }
    public static Integer position(List<Employee> list , int id){
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
