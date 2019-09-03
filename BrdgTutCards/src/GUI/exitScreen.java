/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;

/**
 *
 * @author Ishaan
 */
public class exitScreen extends javax.swing.JFrame {

    /**
     * Creates new form exitScreen
     */
    public exitScreen() {
        initComponents();
        initComponents();
        pnlExitScreen.setPreferredSize(new Dimension(500, 500));
        setSize(new Dimension(500, 260));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlExitScreen = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlExitScreen.setLayout(null);

        lblheading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAssets/exitQuestion.png"))); // NOI18N
        pnlExitScreen.add(lblheading);
        lblheading.setBounds(70, 10, 320, 80);

        btnYes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAssets/yes.png"))); // NOI18N
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });
        pnlExitScreen.add(btnYes);
        btnYes.setBounds(90, 140, 90, 40);

        btnNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAssets/no.png"))); // NOI18N
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        pnlExitScreen.add(btnNo);
        btnNo.setBounds(300, 140, 90, 40);

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAssets/greenBackground.jpg"))); // NOI18N
        lblBackGround.setText("jLabel1");
        pnlExitScreen.add(lblBackGround);
        lblBackGround.setBounds(0, 0, 520, 220);

        getContentPane().add(pnlExitScreen);
        pnlExitScreen.setBounds(0, 0, 520, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_btnYesActionPerformed

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
            java.util.logging.Logger.getLogger(exitScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exitScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exitScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exitScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exitScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblheading;
    private javax.swing.JPanel pnlExitScreen;
    // End of variables declaration//GEN-END:variables
}
