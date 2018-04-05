/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalavras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matheus
 */
public class LerArquivo {
    private static String textoCompleto;
    
    public static String getTextoCompleto(){
        
        try {
            FileReader arq = new FileReader("1H4.txt");
            BufferedReader lerArq = new BufferedReader(arq);
 
            String linha;
            linha = lerArq.readLine();
            
            while (linha != null) {                
                textoCompleto += linha;
                linha = lerArq.readLine();
            }
            
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        return textoCompleto;
    }
    
}
