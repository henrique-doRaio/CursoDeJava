package JPA;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(1, ("Henrique Do raio") , "Henrique@gmail.com");
        Pessoa p2 = new Pessoa(2, ("Guilherme") , "Gui@gmail.com");
        Pessoa p3 = new Pessoa(3, ("Nielon") , "Nielon@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
