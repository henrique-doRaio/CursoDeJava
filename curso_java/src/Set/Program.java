package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args){
        //Mais rapido porem sem ordem
        Set<String> set1 = new HashSet<>();
        //Coloca em ordem alfabetica
        Set<String> set2 = new TreeSet<>();
        //Mantem a ordem original.
        Set<String> set3 = new LinkedHashSet<>();

        set1.removeIf(x ->x.length() <= 3 );
        set1.removeIf(x ->x.charAt(0) <= 'T' );

        set1.add("TV");
        set1.add("Notebook");
        set1.add("Tablet");

        System.out.println(set1.contains("Notebook"));

        for (String p : set1) {
            System.out.println(p);
        }
    }
}
