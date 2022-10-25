package views.Veiculo;


import DAO.VeiculoDAO;
import model.Veiculo;


public class CadastrarVeiculo extends javax.swing.JFrame {
    public CadastrarVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtChassis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botaoCadastrarVeiculo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botaoCancelar = new javax.swing.JButton();
        txtVDiaria = new javax.swing.JTextField();
        txtAno = new javax.swing.JFormattedTextField();
        txtCapacidade = new javax.swing.JTextField();
        txtCombustivel = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRAR VEÍCULOS");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Combustivel: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 170, 90, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor da Diária:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 270, 100, 16);

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo);
        txtModelo.setBounds(130, 120, 157, 22);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 220, 50, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 60, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ano:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 170, 60, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacidade:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 120, 80, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chassis:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 220, 50, 16);
        getContentPane().add(txtChassis);
        txtChassis.setBounds(130, 220, 159, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CADASTRO DE VEÍCULOS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(138, 28, 246, 28);

        botaoCadastrarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/salvar-arquivo.png"))); // NOI18N
        botaoCadastrarVeiculo.setToolTipText("Cadastrar");
        botaoCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarVeiculo);
        botaoCadastrarVeiculo.setBounds(446, 351, 46, 39);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(123, 68, 261, 10);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/cancelar.png"))); // NOI18N
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(388, 351, 46, 39);

        txtVDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVDiariaActionPerformed(evt);
            }
        });
        txtVDiaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVDiariaKeyReleased(evt);
            }
        });
        getContentPane().add(txtVDiaria);
        txtVDiaria.setBounds(130, 270, 76, 22);

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAno);
        txtAno.setBounds(130, 170, 82, 22);

        txtCapacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadeActionPerformed(evt);
            }
        });
        txtCapacidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCapacidadeKeyReleased(evt);
            }
        });
        getContentPane().add(txtCapacidade);
        txtCapacidade.setBounds(400, 120, 60, 22);

        txtCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustivelActionPerformed(evt);
            }
        });
        txtCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCombustivelKeyReleased(evt);
            }
        });
        getContentPane().add(txtCombustivel);
        txtCombustivel.setBounds(400, 170, 110, 22);

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        getContentPane().add(txtMarca);
        txtMarca.setBounds(400, 220, 110, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/fundo-Carro.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 590, 450);

        setSize(new java.awt.Dimension(579, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        GerenciarVeiculos voltarTelaGerenciar = new GerenciarVeiculos();
        voltarTelaGerenciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarVeiculoActionPerformed
        String modelo = txtModelo.getText();
        String ano = txtAno.getText();
        String chassis = txtChassis.getText();
        String valorDiaria = txtVDiaria.getText();
        String capacidade = (String) txtCapacidade.getText();
        String combustivel = (String) txtCombustivel.getText();
        String marca = (String) txtMarca.getText();
        
        
        Veiculo veiculo = new Veiculo(modelo, ano, chassis, valorDiaria, capacidade, combustivel, marca);
        VeiculoDAO cdao = new VeiculoDAO();
        
        cdao.adicionar(veiculo);
        
        GerenciarVeiculos gc = new GerenciarVeiculos();
        gc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarVeiculoActionPerformed

    private void txtVDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVDiariaActionPerformed
    }//GEN-LAST:event_txtVDiariaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtCapacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadeActionPerformed
       
    }//GEN-LAST:event_txtCapacidadeActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustivelActionPerformed
        
    }//GEN-LAST:event_txtCombustivelActionPerformed

    private void txtCapacidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadeKeyReleased
        txtCapacidade.setText(txtCapacidade.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtCapacidadeKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        txtMarca.setText(txtMarca.getText().replaceAll("[^a-z]", ""));
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtCombustivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCombustivelKeyReleased
        txtCombustivel.setText(txtCombustivel.getText().replaceAll("[^a-z]", ""));
    }//GEN-LAST:event_txtCombustivelKeyReleased

    private void txtVDiariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVDiariaKeyReleased
        txtVDiaria.setText(txtVDiaria.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtVDiariaKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarVeiculo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtChassis;
    private javax.swing.JTextField txtCombustivel;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtVDiaria;
    // End of variables declaration//GEN-END:variables
}
