/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorTexto;

import javax.swing.JOptionPane;




/**
 *
 * @author leos_
 */
public class Login extends javax.swing.JFrame {
    Usuario Usuario;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    Usuario back = new Usuario();
    String loginAdm = "adm";
    String senhaAdm = "123";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfIP = new javax.swing.JTextField();
        txtfPorta = new javax.swing.JTextField();
        txtfLogin = new javax.swing.JTextField();
        txtfSenha = new javax.swing.JPasswordField();
        bttEntrar = new javax.swing.JButton();
        bttFechar = new javax.swing.JButton();
        bttModoTeste = new javax.swing.JButton();
        bttNovoUser = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Endereço de IP");

        jLabel2.setText("Porta");

        jLabel3.setText("Login");

        jLabel4.setText("Senha");

        txtfIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIPActionPerformed(evt);
            }
        });

        txtfSenha.setText("jPasswordField1");
        txtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSenhaActionPerformed(evt);
            }
        });

        bttEntrar.setText("Entrar");
        bttEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEntrarActionPerformed(evt);
            }
        });

        bttFechar.setText("Fechar/Cancelar");
        bttFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFecharActionPerformed(evt);
            }
        });

        bttModoTeste.setText("Modo Teste");
        bttModoTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModoTesteActionPerformed(evt);
            }
        });

        bttNovoUser.setText("Criar Usuario");
        bttNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(253, 253, 253)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtfIP))
                        .addGap(159, 159, 159)
                        .addComponent(txtfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bttEntrar)
                            .addGap(263, 263, 263)
                            .addComponent(bttNovoUser))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bttModoTeste)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttFechar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(txtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttEntrar)
                    .addComponent(bttNovoUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttModoTeste)
                    .addComponent(bttFechar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIPActionPerformed

    private void txtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSenhaActionPerformed
    
    
    
    private void bttModoTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModoTesteActionPerformed
        // TODO add your handling code here:
        
        EditorInterface editor = new EditorInterface();
        editor.setVisible(true);

        
        /**
         * Botão para teste sem necessidade de login
         */
        
    }//GEN-LAST:event_bttModoTesteActionPerformed

    private void bttEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEntrarActionPerformed
        // TODO add your handling code here:
        if(!back.autentica(txtfLogin.getText(), txtfSenha.getText())){
            JOptionPane.showMessageDialog(null, "Login e ou senha incorretos");
        }else{
          
             EditorInterface editor = new EditorInterface();
             editor.setVisible(true);
             
        }
        
        /**
         * Autenticação do cliente e inicialização do editor de texto, ainda não implementado para vários usuários diferentes.
         */
        
    }//GEN-LAST:event_bttEntrarActionPerformed

    private void bttFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        /**
         * Encerra o programa.
         */
        
    }//GEN-LAST:event_bttFecharActionPerformed

    private void bttNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoUserActionPerformed
        // TODO add your handling code here:
        NovoUser cadastra = new NovoUser();
        cadastra.setVisible(true);
        Login ini = new Login();
        ini.setVisible(false);
    }//GEN-LAST:event_bttNovoUserActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEntrar;
    private javax.swing.JButton bttFechar;
    private javax.swing.JButton bttModoTeste;
    private javax.swing.JButton bttNovoUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfIP;
    private javax.swing.JTextField txtfLogin;
    private javax.swing.JTextField txtfPorta;
    private javax.swing.JPasswordField txtfSenha;
    // End of variables declaration//GEN-END:variables
}
