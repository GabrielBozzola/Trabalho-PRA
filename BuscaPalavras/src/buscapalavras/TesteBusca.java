/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalavras;

import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TesteBusca {
    public static void main(String[] args){
        if(NaiveBusca.search(LerArquivo.getTextoCompleto(), "batata")){
            System.out.println("Palavra encontrada");
        }else{
            //JOptionPane.showMessageDialog(null,"Palavra não encontrada");
            System.out.println("Palavra não encontrada");
        }
    }

}
