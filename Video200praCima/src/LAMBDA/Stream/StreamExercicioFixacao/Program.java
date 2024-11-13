package LAMBDA.Stream.StreamExercicioFixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path:(/home/youxlab/tmp/in.txt)");
        String path = sc.nextLine();

        System.out.println("Enter the salary : ");
        Integer salary = sc.nextInt();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> names = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail()).collect(Collectors.toList());



            List<Double> sum = list.stream()
                            .filter(e -> e.getName().charAt(0) == 'M')
                            .map(e -> e.getSalary()).collect(Collectors.toList());

            double totalSalary = sum.stream().reduce(0.0 , (x,y) -> x + y );

            System.out.println("Email of people whose salary is more than" + salary + " : ");

            System.out.println("Sum of salary of the people whose name starts with 'M' : " + totalSalary );

            names.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
