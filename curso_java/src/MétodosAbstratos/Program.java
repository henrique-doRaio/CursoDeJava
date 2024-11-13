package MétodosAbstratos;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Shape " +(i+1) + " data: " );
            System.out.println("Rectangle or Circle(r/c)? ");
            char cha = sc.next().charAt(0);
            if(cha == 'r') {
                System.out.println("COLOR(BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                System.out.println("Width: ");
                Double width = sc.nextDouble();
                System.out.println("Heigth: ");
                Double heigth = sc.nextDouble();
                Shape sha = new Rectangle(color , width , heigth);
                list.add(sha);
            }else if (cha == 'c'){
                System.out.println("COLOR(BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                System.out.println("Radius: ");
                Double radius = sc.nextDouble();
                Shape sha = new Circle(color, radius);
                list.add(sha);
            }
        }

        System.out.println("Shape Areas: ");

        for (Shape sha : list){
            System.out.println(String.format("%.2f", sha.area()));
        }
    }
}
