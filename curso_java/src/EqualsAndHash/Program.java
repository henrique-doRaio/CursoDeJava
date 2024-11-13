package EqualsAndHash;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Clients c1 = new Clients("Maria" , "maria@gmail.com");
        Clients c2 = new Clients("Maria" , "maria@gmail.com");

        String s1 = "test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

    }
}
