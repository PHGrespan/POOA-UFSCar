package br.ufscar.pooa.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileUtil {
    
    // cria csv com os dados (apenas um site)
    public static void printCSV(List<String> contents) throws IOException {

        //String com data e hora atual
        String strNow = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss").format(LocalDateTime.now());

        //cria arquivo csv
        try(PrintWriter pw = new PrintWriter(new FileWriter(new File(String.format("noticias-%s.csv",strNow))))){
            
            //cabeçalho
            pw.println("Site;Tipo;Notícia;Link");

            //imprime cada linha de contents
            for(String str: contents){
                pw.println(str);
            }
        }
        
    }
}
