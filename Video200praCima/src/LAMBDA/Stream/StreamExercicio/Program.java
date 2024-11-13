package LAMBDA.Stream.StreamExercicio;

import LAMBDA.Product;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path:(/home/youxlab/tmp/in.txt)");
        String path = sc.nextLine();

       try(BufferedReader br = new BufferedReader(new FileReader(path))){

           String line = br.readLine();

           List<Product> list = new ArrayList<>();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Double sum = list.stream().
                    map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: " + sum);

           Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

           List<String> names = list.stream().filter(p -> p.getPrice() < sum).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

           names.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
