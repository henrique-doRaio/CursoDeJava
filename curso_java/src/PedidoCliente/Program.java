package PedidoCliente;

import PedidoCliente.PedidoClienteOrder.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date(DD/MM/YYYY)");
        Date dateBirth = sdf1.parse(sc.next());
        Client client = new Client(name,email,dateBirth);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Date moment = new Date();

        Order order = new Order(new Date(), status, client);
        System.out.println("How many items to this order?");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
           System.out.println("Enter " + (i+1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName,price);

            OrderItem orderItem = new OrderItem(quantity,price,product);

            order.addItems(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");

        System.out.println(order);

        sc.close();
    }
}
