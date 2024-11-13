package ARQUIVO.Arquivos.Arquivo5;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        File paht = new File(strPath);

        System.out.println("getName:" + paht.getName());
        System.out.println("getParent" + paht.getParent());
        System.out.println("getPath" + paht.getPath());
        System.out.println("getPath" + paht.getAbsolutePath());

        sc.close();
    }
}
