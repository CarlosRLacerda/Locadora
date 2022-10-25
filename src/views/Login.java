package views;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNome = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        BotaoAvancarLogin = new javax.swing.JButton();
        botaoSairLogin = new javax.swing.JButton();
        LabelEx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        getContentPane().setLayout(null);

        LabelNome.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome.setText("Usuário:");
        getContentPane().add(LabelNome);
        LabelNome.setBounds(190, 150, 80, 16);

        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha:");
        getContentPane().add(LabelSenha);
        LabelSenha.setBounds(190, 220, 70, 16);
        getContentPane().add(textoNome);
        textoNome.setBounds(190, 170, 220, 22);

        BotaoAvancarLogin.setText("Avançar");
        BotaoAvancarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAvancarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoAvancarLogin);
        BotaoAvancarLogin.setBounds(430, 340, 90, 23);

        botaoSairLogin.setText("Sair");
        botaoSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSairLogin);
        botaoSairLogin.setBounds(340, 340, 70, 23);

        LabelEx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelEx.setForeground(new java.awt.Color(255, 255, 255));
        LabelEx.setText("SEJA BEM-VINDO");
        getContentPane().add(LabelEx);
        LabelEx.setBounds(200, 80, 200, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("U LOCADORA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 30, 180, 29);
        getContentPane().add(textoSenha);
        textoSenha.setBounds(190, 240, 220, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(156, 70, 260, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/fundo_login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 590, 440);

        setSize(new java.awt.Dimension(578, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairLoginActionPerformed
       this.dispose();
    }//GEN-LAST:event_botaoSairLoginActionPerformed

    private void BotaoAvancarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAvancarLoginActionPerformed
        if(textoNome.getText().equals("admin")&&textoSenha.getText().equals("admin")){    
            Home telaHome = new Home();
            telaHome.setVisible(true);
            this.dispose();}
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
        }
        
    }//GEN-LAST:event_BotaoAvancarLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAvancarLogin;
    private javax.swing.JLabel LabelEx;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JButton botaoSairLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textoNome;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
