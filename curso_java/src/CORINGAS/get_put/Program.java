package CORINGAS.get_put;

import java.lang.reflect.Array;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(1.3,3.5,2.3);
        List<Object> myObj = new ArrayList<>();
        copy(myInts,myObj);
        printList(myObj);
        copy(myDoubles,myObj);
        printList(myObj);
    }

    public static void copy(List<? extends Number> source, List< ? super  Number> destiny){
     for (Number obj : source){
         destiny.add(obj);
     }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj + " ");
        }
        System.out.println();
    }

}