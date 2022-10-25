package views;

import DAO.AluguelDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.AluguelApoio;
import views.Aluguel.GerenciarAluguel;
import views.Cliente.GerenciarCliente;
import views.Veiculo.GerenciarVeiculos;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tAluguel.getModel();
        tAluguel.setRowSorter(new TableRowSorter(modelo));
        
        readHomeJTable();
    }
    
    public void readHomeJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tAluguel.getModel();
        modelo.setNumRows(0);
        AluguelDAO adao = new AluguelDAO();
        
        List<AluguelApoio> alugueis = adao.read();
        
        for (AluguelApoio a : alugueis) {

            modelo.addRow(new Object[]{
                a.getNomeCliente(),
                a.getNomeVeiculo(),
                a.getDataInicio(),
                a.getDataFinal()
                
            });

        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        botaoSairHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAluguel = new javax.swing.JTable();
        LabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoTelaVeiculo = new javax.swing.JButton();
        botaoTelaCliente = new javax.swing.JButton();
        botaoTelaAluguel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setResizable(false);
        getContentPane().setLayout(null);

        botaoSairHome.setText("Sair");
        botaoSairHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSairHome);
        botaoSairHome.setBounds(490, 450, 72, 23);

        tAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Veículo", "Data de Inicio", "Data de Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tAluguel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 560, 172);

        LabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("U LOCADORA");
        getContentPane().add(LabelTitle);
        LabelTitle.setBounds(220, 20, 158, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALUGUEIS PREVISTOS OU EM ANDAMENTO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 100, 270, 17);

        botaoTelaVeiculo.setText("Gerenciar Veículos");
        botaoTelaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTelaVeiculo);
        botaoTelaVeiculo.setBounds(210, 340, 158, 37);

        botaoTelaCliente.setText("Gerenciar Clientes");
        botaoTelaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTelaCliente);
        botaoTelaCliente.setBounds(400, 340, 150, 37);

        botaoTelaAluguel.setText("Gerenciar Aluguel");
        botaoTelaAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaAluguelActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTelaAluguel);
        botaoTelaAluguel.setBounds(20, 340, 160, 37);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(160, 60, 270, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(34, 310, 510, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/fundo_login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 510);

        setSize(new java.awt.Dimension(595, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairHomeActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairHomeActionPerformed

    private void botaoTelaAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaAluguelActionPerformed
        GerenciarAluguel telaGErenciarAluguel = new GerenciarAluguel();
        telaGErenciarAluguel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoTelaAluguelActionPerformed

    private void botaoTelaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaVeiculoActionPerformed
        GerenciarVeiculos telaGErenciarVeiculo = new GerenciarVeiculos();
        telaGErenciarVeiculo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoTelaVeiculoActionPerformed

    private void botaoTelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaClienteActionPerformed
        GerenciarCliente telaGerenciarCliente = new  GerenciarCliente();
        telaGerenciarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoTelaClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton botaoSairHome;
    private javax.swing.JButton botaoTelaAluguel;
    private javax.swing.JButton botaoTelaCliente;
    private javax.swing.JButton botaoTelaVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tAluguel;
    // End of variables declaration//GEN-END:variables

    private void dispode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
