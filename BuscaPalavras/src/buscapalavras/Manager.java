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
public class Manager {

     private static String palavra;

    public static String getPalavra() {
        return palavra;
    }

    public static void setPalavra(String palavra) {
        Manager.palavra = palavra;
    }
}
