package ARQUIVO.Arquivos.Arquivo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args){

        String[] lines = new String[]{"Good morning", "Good afternoon" ,"Good night"};

        String path = "/home/youxlab/Documentos/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path ,true))){//true ele acrescentra no arquivo
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error : " + e);
        }
    }
}
