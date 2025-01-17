package INTERFACES.InterfacesExercicio1.InterfaceComparable;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws IOException {
        List<Employee> list = new ArrayList<>();
        String path = "/home/youxlab/tmp/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
    }
}
