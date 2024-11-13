package exemplo;

import java.util.Locale;
import java.util.Scanner;

public class aplication {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            int quantity = sc.nextInt();
            System.out.println(quantity);
            System.out.println(price);
            System.out.println(name);

            pedido pedido = new pedido(name, price);
            System.out.println();
            System.out.println("Product data: " + pedido);
            System.out.println();
            System.out.print("Enter the number of products to be added in stock: ");
            quantity = sc.nextInt();
            pedido.addProducts(quantity);
            System.out.println();
            System.out.println("Updated data: " + pedido);
            System.out.println();
            System.out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            pedido.removeProducts(quantity);
            System.out.println();
            System.out.println("Updated data: " + pedido);
            sc.close();
        }
    }

