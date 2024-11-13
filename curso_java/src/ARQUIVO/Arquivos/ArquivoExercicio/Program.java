package ARQUIVO.Arquivos.ArquivoExercicio;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        boolean success = new File(sourceFolderStr + "/out").mkdir();
        //System.out.println("Folder create success: " + success);

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String itemCsv = br.readLine();
            while(itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
            for(Product pro : list){
                bw.write(pro.getName() + "," + String.format("%.2f", pro.total()));
            }
            System.out.println(targetFileStr + " CREATED");
        }
    }
}
