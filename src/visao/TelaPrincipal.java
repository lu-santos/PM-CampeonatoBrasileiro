/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

/**
 *
 * @author Lucianna
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTrabalho = new javax.swing.JDesktopPane();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemImportarRodada = new javax.swing.JMenuItem();
        itemImportarEquipe = new javax.swing.JMenuItem();
        menuClassificacao = new javax.swing.JMenu();
        itemClassificaçãoCamepeonato = new javax.swing.JMenuItem();
        itemClassificaçãoMandante = new javax.swing.JMenuItem();
        itemClassificaçãoVisitante = new javax.swing.JMenuItem();
        itemClassificaçãoTurno1 = new javax.swing.JMenuItem();
        itemClassificaçãoTurno2 = new javax.swing.JMenuItem();
        menuResultado = new javax.swing.JMenu();
        itemResultadoRodada = new javax.swing.JMenuItem();
        itemResultadoEquipe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campeonato Brasileiro");
        setBackground(new java.awt.Color(255, 255, 255));

        painelTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        painelTrabalho.setMinimumSize(new java.awt.Dimension(1024, 698));

        javax.swing.GroupLayout painelTrabalhoLayout = new javax.swing.GroupLayout(painelTrabalho);
        painelTrabalho.setLayout(painelTrabalhoLayout);
        painelTrabalhoLayout.setHorizontalGroup(
            painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        painelTrabalhoLayout.setVerticalGroup(
            painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        barraMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemImportarRodada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemImportarRodada.setText("Importar Rodada");
        itemImportarRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImportarRodadaActionPerformed(evt);
            }
        });
        menuArquivo.add(itemImportarRodada);

        itemImportarEquipe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemImportarEquipe.setText("Importar Equipe");
        itemImportarEquipe.setMinimumSize(new java.awt.Dimension(1024, 720));
        itemImportarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImportarEquipeActionPerformed(evt);
            }
        });
        menuArquivo.add(itemImportarEquipe);

        barraMenuPrincipal.add(menuArquivo);

        menuClassificacao.setText("Classificações");
        menuClassificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemClassificaçãoCamepeonato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemClassificaçãoCamepeonato.setText("Classificação do Camepeonato");
        itemClassificaçãoCamepeonato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClassificaçãoCamepeonatoActionPerformed(evt);
            }
        });
        menuClassificacao.add(itemClassificaçãoCamepeonato);

        itemClassificaçãoMandante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemClassificaçãoMandante.setText("Classificação como Mandante");
        itemClassificaçãoMandante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClassificaçãoMandanteActionPerformed(evt);
            }
        });
        menuClassificacao.add(itemClassificaçãoMandante);

        itemClassificaçãoVisitante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemClassificaçãoVisitante.setText("Classificação como Visitante");
        itemClassificaçãoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClassificaçãoVisitanteActionPerformed(evt);
            }
        });
        menuClassificacao.add(itemClassificaçãoVisitante);

        itemClassificaçãoTurno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemClassificaçãoTurno1.setText("Classificação do 1º Turno");
        itemClassificaçãoTurno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClassificaçãoTurno1ActionPerformed(evt);
            }
        });
        menuClassificacao.add(itemClassificaçãoTurno1);

        itemClassificaçãoTurno2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemClassificaçãoTurno2.setText("Classificação do 2º Turno");
        itemClassificaçãoTurno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClassificaçãoTurno2ActionPerformed(evt);
            }
        });
        menuClassificacao.add(itemClassificaçãoTurno2);

        barraMenuPrincipal.add(menuClassificacao);

        menuResultado.setText("Resultados");
        menuResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemResultadoRodada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemResultadoRodada.setText("Resultado das Rodadas");
        itemResultadoRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResultadoRodadaActionPerformed(evt);
            }
        });
        menuResultado.add(itemResultadoRodada);

        itemResultadoEquipe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemResultadoEquipe.setText("Resultado das Equipes");
        itemResultadoEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResultadoEquipeActionPerformed(evt);
            }
        });
        menuResultado.add(itemResultadoEquipe);

        barraMenuPrincipal.add(menuResultado);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemClassificaçãoMandanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClassificaçãoMandanteActionPerformed
        AbrirJanela.abrirJanela(new ClassificacaoMandante(), painelTrabalho);
    }//GEN-LAST:event_itemClassificaçãoMandanteActionPerformed

    private void itemClassificaçãoTurno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClassificaçãoTurno1ActionPerformed
        AbrirJanela.abrirJanela(new ClassificacaoTurno1(), painelTrabalho);
    }//GEN-LAST:event_itemClassificaçãoTurno1ActionPerformed

    private void itemClassificaçãoTurno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClassificaçãoTurno2ActionPerformed
        AbrirJanela.abrirJanela(new ClassificacaoTurno2(), painelTrabalho);
    }//GEN-LAST:event_itemClassificaçãoTurno2ActionPerformed

    private void itemImportarRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImportarRodadaActionPerformed
        AbrirJanela.abrirJanela(new ImportarRodada(), painelTrabalho);
    }//GEN-LAST:event_itemImportarRodadaActionPerformed

    private void itemImportarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImportarEquipeActionPerformed
        AbrirJanela.abrirJanela(new ImportarEquipe(), painelTrabalho);
    }//GEN-LAST:event_itemImportarEquipeActionPerformed

    private void itemClassificaçãoCamepeonatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClassificaçãoCamepeonatoActionPerformed
        AbrirJanela.abrirJanela(new ClassificacaoCampeonato(), painelTrabalho);
    }//GEN-LAST:event_itemClassificaçãoCamepeonatoActionPerformed

    private void itemClassificaçãoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClassificaçãoVisitanteActionPerformed
        AbrirJanela.abrirJanela(new ClassificacaoVisitante(), painelTrabalho);
    }//GEN-LAST:event_itemClassificaçãoVisitanteActionPerformed

    private void itemResultadoRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResultadoRodadaActionPerformed
        AbrirJanela.abrirJanela(new ResultadoDaRodada(), painelTrabalho);
    }//GEN-LAST:event_itemResultadoRodadaActionPerformed

    private void itemResultadoEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResultadoEquipeActionPerformed
        AbrirJanela.abrirJanela(new ResultadoEquipe(), painelTrabalho);
    }//GEN-LAST:event_itemResultadoEquipeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JMenuItem itemClassificaçãoCamepeonato;
    private javax.swing.JMenuItem itemClassificaçãoMandante;
    private javax.swing.JMenuItem itemClassificaçãoTurno1;
    private javax.swing.JMenuItem itemClassificaçãoTurno2;
    private javax.swing.JMenuItem itemClassificaçãoVisitante;
    private javax.swing.JMenuItem itemImportarEquipe;
    private javax.swing.JMenuItem itemImportarRodada;
    private javax.swing.JMenuItem itemResultadoEquipe;
    private javax.swing.JMenuItem itemResultadoRodada;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuClassificacao;
    private javax.swing.JMenu menuResultado;
    private javax.swing.JDesktopPane painelTrabalho;
    // End of variables declaration//GEN-END:variables
}
