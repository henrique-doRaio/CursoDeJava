package Set.SetExercicioProposto;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Set<IdStudents> id = new HashSet<>();
        System.out.println("How many classes are there in this school?");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            System.out.print("How many students for class " + (i+1) + " ?");
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                int num = sc.nextInt();
                id.add(new IdStudents(num));
            }
        }

        System.out.println("Total students: " + id.size());
    }
}
