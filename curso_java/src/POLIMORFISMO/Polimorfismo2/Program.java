package POLIMORFISMO.Polimorfismo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.println("Common, used or imported(c/u/i)");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY)");
                java.util.Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price , manufactureDate);
                list.add(product);
            }if (ch == 'i'){
                System.out.println("Custom fee: ");
                Double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name , price, customFee);
                list.add(product);
            }else{
                Product product = new Product(name , price);
                list.add(product);
            }

        }
        System.out.println("PRICE TAG: ");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
