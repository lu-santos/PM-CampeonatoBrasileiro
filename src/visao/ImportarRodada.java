/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

//import Servicos.RodadasImportadas;
//import Servicos.ServicoImportacaoResultado;
import controlador.RodadaEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucianna
 */
public class ImportarRodada extends javax.swing.JInternalFrame {

    /**
     * Creates new form ImportarRodada2
     */
    
    private DefaultListModel listaArquivos = new DefaultListModel();
    private RodadaEvent rodadaEvento;
    private String nomeArquivo;
    
    private DefaultListModel listaArquivosImportados = new DefaultListModel();
    private int numeroRodadaAtual;
    
    public ImportarRodada() {
        initComponents();
        String arquivos;
        
        for(int i = 0; i < 38; i++){
            arquivos = "Rodada" + " " + i;
            listaArquivos.addElement(arquivos);
        }
        listaArquivoRodadas.setModel(listaArquivos);

         if(nomeArquivo == null)
            listaArquivoRodadas.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaArquivoRodadas = new javax.swing.JList();
        btnImportarRodada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRodadasImportadas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);
        setTitle("Importar Rodadas");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Rodadas");

        listaArquivoRodadas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaArquivoRodadas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaArquivoRodadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaArquivoRodadas);

        btnImportarRodada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnImportarRodada.setText("Importar");
        btnImportarRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarRodadaActionPerformed(evt);
            }
        });

        listaRodadasImportadas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaRodadasImportadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaRodadasImportadas);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Rodadas Importadas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(">>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnImportarRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95)))
                .addComponent(btnImportarRodada)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarRodadaActionPerformed
 
        if (listaArquivoRodadas.getSelectedIndex() > 20)     // arquivos txt não existentes
            JOptionPane.showMessageDialog(getContentPane(),"Não exite arquivo para o item selecionado!"); 
        
        if(nomeArquivo == null && listaArquivoRodadas.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(getContentPane(),"Comece a importação pela primeira rodada");
        }
        
        if(listaArquivoRodadas.getSelectedIndex() == 0){
            nomeArquivo = "rodada" + listaArquivoRodadas.getSelectedIndex() + ".txt";
            rodadaEvento = new RodadaEvent(nomeArquivo);
            rodadaEvento.ImportarRodada();
            rodadaEvento.adicionarRodadasImportadas(nomeArquivo);
            numeroRodadaAtual = listaArquivoRodadas.getSelectedIndex();
            JOptionPane.showMessageDialog(getContentPane(),"Arquivo importado com sucesso");        
        }
        
        if(listaArquivoRodadas.getSelectedIndex() == (numeroRodadaAtual+1)){    // próxima rodada
            nomeArquivo = "rodada" + listaArquivoRodadas.getSelectedIndex()+1 + ".txt";
            rodadaEvento = new RodadaEvent(nomeArquivo);
            rodadaEvento.ImportarRodada();
            rodadaEvento.adicionarRodadasImportadas(nomeArquivo);
            numeroRodadaAtual = listaArquivoRodadas.getSelectedIndex();
            JOptionPane.showMessageDialog(getContentPane(),"Arquivo importado com sucesso");
            
        }
        
        else if(listaArquivoRodadas.getSelectedIndex() < 20)
            JOptionPane.showMessageDialog(getContentPane(),"Escolha uma rodada sucessora imediata.");
        
        if(rodadaEvento.getRodadasImportadas() != null){
            for(String nomeArquivoImportado : rodadaEvento.getRodadasImportadas()){
                if(nomeArquivoImportado != null){
                    if(listaArquivosImportados.contains(nomeArquivoImportado) == false)
                        listaArquivosImportados.addElement(nomeArquivoImportado);
                }
            }
            listaRodadasImportadas.setModel(listaArquivosImportados);
        }
        
    }//GEN-LAST:event_btnImportarRodadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportarRodada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaArquivoRodadas;
    private javax.swing.JList listaRodadasImportadas;
    // End of variables declaration//GEN-END:variables
}
