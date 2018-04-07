/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalavras;

/**
 *
 * @author matheus
 */
public class NaiveBusca {
    
    /**
     *
     * @param texto
     * @param palavra
     * @return
     */
    public boolean search(String texto, String palavra){
        int tamanhoTexto = texto.length();
        int tamanhoPalavra = palavra.length();
        
        for (int i = 0; i < tamanhoTexto-tamanhoPalavra; i++) {
            int j;
            
            for (j = 0; j < tamanhoPalavra; j++) {
                if(texto.charAt(i+j) != palavra.charAt(j))
                    break;
            }
            
            if(j==tamanhoPalavra){
                return true;
            }
        }
        return false;
    }

    public NaiveBusca() {
    }
    
}
