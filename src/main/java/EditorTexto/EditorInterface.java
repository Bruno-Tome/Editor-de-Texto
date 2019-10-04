/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EditorTexto;
import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 
import java.io.FileNotFoundException;//
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author leos_ && 
 * @author brunot
 */
public class EditorInterface extends javax.swing.JFrame {
    


    /**
     * Creates new form EditorInterface
     */
    public EditorInterface() {
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

        txtPainel = new java.awt.TextArea();
        checkboxNegrito = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        choice1 = new java.awt.Choice();
        jMenuBar1 = new javax.swing.JMenuBar();
        menubarArquivo = new javax.swing.JMenu();
        arquivobarAbrir = new javax.swing.JMenuItem();
        arquivobarNovo = new javax.swing.JMenuItem();
        arquivobarSalvar = new javax.swing.JMenuItem();
        menubarEditar = new javax.swing.JMenu();
        editarbarDesfazer = new javax.swing.JMenuItem();
        esditarbarRefazer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        editarbarRecortar = new javax.swing.JMenuItem();
        editarbarCopiar = new javax.swing.JMenuItem();
        editarbarColar = new javax.swing.JMenuItem();
        menubarUsuario = new javax.swing.JMenu();
        usuariobarTrocar = new javax.swing.JMenuItem();
        usuariobarSair = new javax.swing.JMenuItem();
        menubarSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPainel.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtPainelTextValueChanged(evt);
            }
        });

        checkboxNegrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkboxNegrito.setLabel("Negrito");

        checkbox2.setLabel("Itálico");

        checkbox3.setLabel("Sublinhado");

        choice1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                choice1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        menubarArquivo.setText("Arquivo");

        arquivobarAbrir.setText("Abrir");
        arquivobarAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivobarAbrirActionPerformed(evt);
            }
        });
        menubarArquivo.add(arquivobarAbrir);

        arquivobarNovo.setText("Novo");
        arquivobarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivobarNovoActionPerformed(evt);
            }
        });
        menubarArquivo.add(arquivobarNovo);

        arquivobarSalvar.setText("Salvar");
        arquivobarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivobarSalvarActionPerformed(evt);
            }
        });
        menubarArquivo.add(arquivobarSalvar);

        jMenuBar1.add(menubarArquivo);

        menubarEditar.setText("Editar");

        editarbarDesfazer.setText("Desfazer");
        menubarEditar.add(editarbarDesfazer);

        esditarbarRefazer.setText("Refazer");
        menubarEditar.add(esditarbarRefazer);
        menubarEditar.add(jSeparator1);

        editarbarRecortar.setText("Recortar");
        editarbarRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbarRecortarActionPerformed(evt);
            }
        });
        menubarEditar.add(editarbarRecortar);

        editarbarCopiar.setText("Copiar");
        menubarEditar.add(editarbarCopiar);

        editarbarColar.setText("Colar");
        menubarEditar.add(editarbarColar);

        jMenuBar1.add(menubarEditar);

        menubarUsuario.setText("Usuário");

        usuariobarTrocar.setText("Trocar de Usuário");
        menubarUsuario.add(usuariobarTrocar);

        usuariobarSair.setText("Sair");
        menubarUsuario.add(usuariobarSair);

        jMenuBar1.add(menubarUsuario);

        menubarSobre.setText("Sobre");
        jMenuBar1.add(menubarSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(checkboxNegrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 593, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxNegrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        checkboxNegrito.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_choice1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choice1CaretPositionChanged

    private void arquivobarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivobarNovoActionPerformed
        // TODO add your handling code here:
       
        txtPainel.setText("");
    }//GEN-LAST:event_arquivobarNovoActionPerformed

    private void arquivobarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivobarSalvarActionPerformed
      try{ 
       String str = txtPainel.getText(); 
       String fname = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja salvar?");
       File f = new File(fname); // Specify the filename
       if(f.exists()){
           int input = JOptionPane.showConfirmDialog(rootPane, "Arquivo já existe. \n Deseja sobrescrever ?", "arquivo já existe", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
           if(input == 0){}else{throw new IOException("Usuario não sobrescreveu arquivo");};
       }else{};
       FileWriter myw = new FileWriter(f.getName());
       myw.write(str);
       myw.close();
       System.out.println("Arquivo Salvo.");
      }
       catch (IOException e) {
      System.out.println("An error occurred.");
      System.out.print(e);
      e.printStackTrace();}
    }//GEN-LAST:event_arquivobarSalvarActionPerformed

    private void editarbarRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbarRecortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarbarRecortarActionPerformed

    private void arquivobarAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivobarAbrirActionPerformed
        // TODO add your handling code here:
        String fname = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja abrir?");
        try {
         File f = new File(fname);
        Scanner myR = new Scanner(f);
        String data = "";
      while (myR.hasNextLine()) {
        data.concat(myR.nextLine());
      }
      txtPainel.setText(data);
      myR.close();
    } catch (FileNotFoundException e) {
      JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo pois não foi encontrado", "InfoBox: " + "Arquivo não Existe", JOptionPane.INFORMATION_MESSAGE);
      e.printStackTrace();
    } 
    }//GEN-LAST:event_arquivobarAbrirActionPerformed

    private void txtPainelTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtPainelTextValueChanged
               // TODO add your handling code here:
    }//GEN-LAST:event_txtPainelTextValueChanged

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
            java.util.logging.Logger.getLogger(EditorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arquivobarAbrir;
    private javax.swing.JMenuItem arquivobarNovo;
    private javax.swing.JMenuItem arquivobarSalvar;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkboxNegrito;
    private java.awt.Choice choice1;
    private javax.swing.JMenuItem editarbarColar;
    private javax.swing.JMenuItem editarbarCopiar;
    private javax.swing.JMenuItem editarbarDesfazer;
    private javax.swing.JMenuItem editarbarRecortar;
    private javax.swing.JMenuItem esditarbarRefazer;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menubarArquivo;
    private javax.swing.JMenu menubarEditar;
    private javax.swing.JMenu menubarSobre;
    private javax.swing.JMenu menubarUsuario;
    private java.awt.TextArea txtPainel;
    private javax.swing.JMenuItem usuariobarSair;
    private javax.swing.JMenuItem usuariobarTrocar;
    // End of variables declaration//GEN-END:variables
}
