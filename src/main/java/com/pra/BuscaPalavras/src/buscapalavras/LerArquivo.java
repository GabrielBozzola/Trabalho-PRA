/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalavras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class LerArquivo {
    private static String textoCompleto = "";
    private static final ArrayList<String> textoCompletoArray = new ArrayList();
    private static final ArrayList<String> nomeArquivos = new ArrayList();
    
    /**
     * 
     */
    private static void inciaString(){
        nomeArquivos.add("1H4.txt");
        nomeArquivos.add("1H6.txt");
        nomeArquivos.add("2H4.txt");
        nomeArquivos.add("2H6.txt");
        nomeArquivos.add("3H6.txt");
        nomeArquivos.add("Ado.txt");
        nomeArquivos.add("Ant.txt");
        nomeArquivos.add("AWW.txt");
        nomeArquivos.add("AYL.txt");
        nomeArquivos.add("Cor.txt");
        nomeArquivos.add("Cym.txt");
        nomeArquivos.add("Err.txt");
        nomeArquivos.add("H5.txt");
        nomeArquivos.add("H8.txt");
        nomeArquivos.add("Ham.txt");
        nomeArquivos.add("JC.txt");
        nomeArquivos.add("Jn.txt");
        nomeArquivos.add("LLL.txt");
        nomeArquivos.add("Lr.txt");
        nomeArquivos.add("Luc.txt");
        nomeArquivos.add("Mac.txt");
        nomeArquivos.add("MM.txt");
        nomeArquivos.add("MND.txt");
        nomeArquivos.add("MV.txt");
        nomeArquivos.add("Oth.txt");
        nomeArquivos.add("Per.txt");
        nomeArquivos.add("PhT.txt");
        nomeArquivos.add("R2.txt");
        nomeArquivos.add("R3.txt");
        nomeArquivos.add("Rom.txt");
        nomeArquivos.add("Shr.txt");
        nomeArquivos.add("Son.txt");
        nomeArquivos.add("TGV.txt");
        nomeArquivos.add("Tim.txt");
        nomeArquivos.add("Tit.txt");
        nomeArquivos.add("Tmp.txt");
        nomeArquivos.add("TN.txt");
        nomeArquivos.add("TNK.txt");
        nomeArquivos.add("Tro.txt");
        nomeArquivos.add("Ven.txt");
        nomeArquivos.add("Wiv.txt");
        nomeArquivos.add("WT.txt");
    }
    
    /**
     *
     */
    public static void setTextoCompleto(){
        inciaString();
        
        nomeArquivos.forEach((String nome) -> {
            textoCompleto=null;
            try {
                BufferedReader lerArq = new BufferedReader(new FileReader(nome));
                
                String linha;
                
                while ((linha=lerArq.readLine()) != null) {  
                    textoCompleto += linha+"\n";
                }
                textoCompletoArray.add(textoCompleto);
                lerArq.close();
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo: " + e.getMessage());
            }
        }); 
    }

    /**
     *
     * @return textoCompleto
     */
    public static ArrayList<String> getTextoCompleto(){
        return textoCompletoArray;
    }
    
}
