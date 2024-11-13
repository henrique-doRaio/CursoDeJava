package Enumerado;

import entitiesEnu.Pedido;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pedido order = new Pedido(1080 , new Date(), StatusPedido.PENDING_PAYMENTS );

        System.out.println(order);

        StatusPedido os1 = StatusPedido.DELIVERED;

        StatusPedido os2 = StatusPedido.valueOf("DELIVERED");


    }
}
