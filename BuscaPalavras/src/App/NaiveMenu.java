/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import buscapalavras.Cronometro;
import buscapalavras.LerArquivo;
import buscapalavras.NaiveBusca;

/**
 *
 * @author matheus
 */
public class NaiveMenu extends javax.swing.JFrame {
    NaiveBusca naive = new NaiveBusca();
    
    /**
     * Creates new form NaiveMenu
     */
    public NaiveMenu() {
        initComponents();
        iniciaBusca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        respostaBusca = new javax.swing.JLabel();
        labelDuracao = new javax.swing.JLabel();
        duracaoBusca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("Naive");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        respostaBusca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        respostaBusca.setText("<Aguardando busca>");

        labelDuracao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDuracao.setText("Duração:");

        duracaoBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        duracaoBusca.setText("duracaoBusca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelTitulo)
                    .addComponent(respostaBusca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDuracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracaoBusca))
                    .addComponent(botaoVoltar))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(49, 49, 49)
                .addComponent(respostaBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDuracao)
                    .addComponent(duracaoBusca))
                .addGap(31, 31, 31)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void iniciaBusca(){
        boolean resultado;
        Cronometro.setInicio(System.currentTimeMillis());
        resultado = naive.search(LerArquivo.getTextoCompleto(),Menu.getCampoPalavraChave());
        Cronometro.setFim(System.currentTimeMillis());
        duracaoBusca.setText(Cronometro.getDuracao());
        if(resultado){
            respostaBusca.setText("Palavra encontrada");
        }else{
            respostaBusca.setText("Palavra não encontrada");

        }
    }
    
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel duracaoBusca;
    private javax.swing.JLabel labelDuracao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel respostaBusca;
    // End of variables declaration//GEN-END:variables
}
