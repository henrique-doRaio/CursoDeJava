package GENERICS.GenericsProblema;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "/home/youxlab/tmp/in.txt";


        try( BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null){
                String[] field = line.split(",");
                list.add(new Product(field[0] , Double.parseDouble(field[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }
    }
}
