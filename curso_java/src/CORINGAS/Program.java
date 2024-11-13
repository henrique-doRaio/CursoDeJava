package CORINGAS;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> myInts = Arrays.asList(5,3,6);
        List<String> myString = Arrays.asList("Henrique","Pedrozo", "Silva");
        printList(myInts);
        printList(myString);


    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
