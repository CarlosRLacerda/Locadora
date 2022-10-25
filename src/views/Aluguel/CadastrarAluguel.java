/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.Aluguel;

import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;

/**
 *
 * @author Carlos Roberto
 */
public class CadastrarAluguel extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAluguel
     */
    public CadastrarAluguel() {
        initComponents();
        DefaultTableModel modeloCliente = (DefaultTableModel) tCliente.getModel();
        tCliente.setRowSorter(new TableRowSorter(modeloCliente));

        DefaultTableModel modeloVeiculo = (DefaultTableModel) tVeiculo.getModel();
        tVeiculo.setRowSorter(new TableRowSorter(modeloVeiculo));

        readClienteJTable();
        readJVeiculoTable();
    }

    public void readClienteJTable() {

        DefaultTableModel modeloCliente = (DefaultTableModel) tCliente.getModel();
        modeloCliente.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.read()) {

            modeloCliente.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCPF()
            });

        }

    }

    public void readJVeiculoTable() {

        DefaultTableModel modeloVeiculo = (DefaultTableModel) tVeiculo.getModel();
        modeloVeiculo.setNumRows(0);
        VeiculoDAO vdao = new VeiculoDAO();

        for (Veiculo v : vdao.read()) {

            modeloVeiculo.addRow(new Object[]{
                v.getId(),
                v.getModelo(),
                v.getValorDiaria()
            });

        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tVeiculo = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdVeiculo = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrarVeiculo = new javax.swing.JButton();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRAR ALUGUEL");
        getContentPane().setLayout(null);

        LabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("CADASTRAR ALUGUEL");
        getContentPane().add(LabelTitle);
        LabelTitle.setBounds(220, 20, 266, 29);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 60, 310, 10);

        tCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tCliente);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 90, 240, 134);

        tVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "valorDiaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tVeiculo);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(380, 90, 250, 134);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(60, 250, 570, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Veículo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 310, 80, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 310, 70, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Inicio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 360, 80, 16);
        getContentPane().add(txtIdVeiculo);
        txtIdVeiculo.setBounds(500, 310, 64, 22);

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdCliente);
        txtIdCliente.setBounds(180, 310, 64, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Final:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 360, 80, 16);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/cancelar.png"))); // NOI18N
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(520, 430, 46, 39);

        botaoCadastrarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/salvar-arquivo.png"))); // NOI18N
        botaoCadastrarVeiculo.setToolTipText("Cadastrar");
        botaoCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarVeiculo);
        botaoCadastrarVeiculo.setBounds(580, 430, 46, 39);

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataInicio);
        txtDataInicio.setBounds(180, 360, 80, 22);

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataFinal);
        txtDataFinal.setBounds(500, 360, 90, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/Aluguel.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, -10, 720, 590);

        setSize(new java.awt.Dimension(687, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        GerenciarAluguel voltarTelaGerenciar = new GerenciarAluguel();
        voltarTelaGerenciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarVeiculoActionPerformed
        int idVeiculo = Integer.parseInt(txtIdVeiculo.getText());
        int idCliente = Integer.parseInt(txtIdCliente.getText());
        String dataInicio = (txtDataInicio.getText());
        String dataFinal = (txtDataFinal.getText());

        Aluguel aluguel = new Aluguel(idVeiculo, idCliente, dataInicio, dataFinal);
        AluguelDAO cdao = new AluguelDAO();

        cdao.adicionar(aluguel);

        GerenciarAluguel gc = new GerenciarAluguel();
        gc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarVeiculoActionPerformed

    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton botaoCadastrarVeiculo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tCliente;
    private javax.swing.JTable tVeiculo;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdVeiculo;
    // End of variables declaration//GEN-END:variables
}
