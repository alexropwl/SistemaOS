/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.privateti.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        mencad = new javax.swing.JMenu();
        mancadcli = new javax.swing.JMenuItem();
        mancados = new javax.swing.JMenuItem();
        mancaduser = new javax.swing.JMenuItem();
        manrel = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        manajuda = new javax.swing.JMenu();
        manajudaso = new javax.swing.JMenuItem();
        manop = new javax.swing.JMenu();
        manopsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Private OS - Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/privateti/icones/if_pinterest-p_1608434.png"))); // NOI18N

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusuario.setText("Usuário");

        lbldata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldata.setText("Data");

        mencad.setText("Cadastro");

        mancadcli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mancadcli.setText("Cliente");
        mencad.add(mancadcli);

        mancados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        mancados.setText("OS");
        mencad.add(mancados);

        mancaduser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mancaduser.setText("Usuários");
        mancaduser.setEnabled(false);
        mencad.add(mancaduser);

        menu.add(mencad);

        manrel.setText("Relatório");
        manrel.setEnabled(false);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Serviços");
        manrel.add(jMenuItem4);

        menu.add(manrel);

        manajuda.setText("Ajuda");

        manajudaso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        manajudaso.setText("Sobre");
        manajudaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manajudasoActionPerformed(evt);
            }
        });
        manajuda.add(manajudaso);

        menu.add(manajuda);

        manop.setText("Opções");

        manopsair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        manopsair.setText("Sair");
        manopsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manopsairActionPerformed(evt);
            }
        });
        manop.add(manopsair);

        menu.add(manop);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldata)
                            .addComponent(lblusuario))))
                .addGap(1580, 1580, 1580))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbldata)
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(825, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lbldata.setText(formatador.format(data));
        

    }//GEN-LAST:event_formWindowActivated

    private void manopsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manopsairActionPerformed
        // TODO add your handling code here:
        
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair: ", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if (sair == JOptionPane.YES_OPTION) {
            
            System.exit(0);
        }
        

    }//GEN-LAST:event_manopsairActionPerformed

    private void manajudasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manajudasoActionPerformed
        
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
        
        
    }//GEN-LAST:event_manajudasoActionPerformed

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
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lbldata;
    public static javax.swing.JLabel lblusuario;
    private javax.swing.JMenu manajuda;
    private javax.swing.JMenuItem manajudaso;
    private javax.swing.JMenuItem mancadcli;
    private javax.swing.JMenuItem mancados;
    public static javax.swing.JMenuItem mancaduser;
    private javax.swing.JMenu manop;
    private javax.swing.JMenuItem manopsair;
    public static javax.swing.JMenu manrel;
    private javax.swing.JMenu mencad;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
