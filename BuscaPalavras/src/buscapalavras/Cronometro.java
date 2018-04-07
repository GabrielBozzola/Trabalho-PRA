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
public class Cronometro {
    private static long inicio, fim;

    public static void setInicio(long inicio) {
        Cronometro.inicio = inicio;
    }

    public static void setFim(long fim) {
        Cronometro.fim = fim;
    }
    
    public static String getDuracao(){
        return Long.toString(fim-inicio)+" milissegundos";
    }
    
}
