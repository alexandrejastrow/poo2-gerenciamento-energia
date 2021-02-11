/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.io.IOException;
import javax.swing.ImageIcon;
import Controllers.Controladora;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class TelaInicial extends javax.swing.JFrame {
    
    private String path;
    private Controladora contr;

    public TelaInicial() {
        this.contr = Controladora.getInstance();
        if(!contr.userOn()){
            System.exit(0);
        }
        initialize();
        
    }
    
    private void initialize(){
        

        try{
            String current = new java.io.File( "." ).getCanonicalPath();
            this.path = current + "\\src\\main\\java\\Images\\";
        }catch(IOException ex){
            this.path = "";
        }
        
        ImageIcon img = new ImageIcon(path + "bateria.png");
        this.setIconImage(img.getImage());
        
        initComponents();
        
        if(contr.userPrivileges() == 0){
            
            jMenuCadastroUsuario.setVisible(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBarCadastro = new javax.swing.JMenu();
        jMenuCadastroUsuario = new javax.swing.JMenuItem();
        jMenuCadastroLocal = new javax.swing.JMenuItem();
        jMenuCadastroSensor = new javax.swing.JMenuItem();
        jMenuCadastroEquipamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuToolsSave = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuEdicaoUsuario = new javax.swing.JMenuItem();
        jMenuToolsLocal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuBarCadastro.setText("Cadastro");

        jMenuCadastroUsuario.setText("Usuario");
        jMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuBarCadastro.add(jMenuCadastroUsuario);

        jMenuCadastroLocal.setText("Local");
        jMenuCadastroLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroLocalActionPerformed(evt);
            }
        });
        MenuBarCadastro.add(jMenuCadastroLocal);

        jMenuCadastroSensor.setText("Sensor");
        MenuBarCadastro.add(jMenuCadastroSensor);

        jMenuCadastroEquipamento.setText("Equipamento");
        jMenuCadastroEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroEquipamentoActionPerformed(evt);
            }
        });
        MenuBarCadastro.add(jMenuCadastroEquipamento);

        jMenuBar1.add(MenuBarCadastro);

        jMenu2.setText("Tools");

        jMenuToolsSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuToolsSave.setText("SaveUsers");
        jMenuToolsSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuToolsSaveActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuToolsSave);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Edição");

        jMenuEdicaoUsuario.setText("Usuario");
        jMenu1.add(jMenuEdicaoUsuario);

        jMenuToolsLocal.setText("Local");
        jMenuToolsLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuToolsLocalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuToolsLocal);

        jMenuItem1.setText("Sensor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Equipamento");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1128, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroLocalActionPerformed
        CadastroLocal novo = new CadastroLocal(contr);
        novo.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroLocalActionPerformed

    private void jMenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroUsuarioActionPerformed
        
        
        CadastroUsuario novo = new CadastroUsuario(contr);
        novo.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroUsuarioActionPerformed

    private void jMenuToolsSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuToolsSaveActionPerformed
        /*
        if(this.database.saveUsers()){
            JOptionPane.showMessageDialog(null, "Usuarios salvos com Sucesso!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Falha ao Salvar Usuarios!!!S");
        }*/
    }//GEN-LAST:event_jMenuToolsSaveActionPerformed

    private void jMenuToolsLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuToolsLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuToolsLocalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuCadastroEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroEquipamentoActionPerformed
        CadastroEquipamento novo = new CadastroEquipamento(this.contr);
        novo.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroEquipamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBarCadastro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroEquipamento;
    private javax.swing.JMenuItem jMenuCadastroLocal;
    private javax.swing.JMenuItem jMenuCadastroSensor;
    private javax.swing.JMenuItem jMenuCadastroUsuario;
    private javax.swing.JMenuItem jMenuEdicaoUsuario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuToolsLocal;
    private javax.swing.JMenuItem jMenuToolsSave;
    // End of variables declaration//GEN-END:variables
}
