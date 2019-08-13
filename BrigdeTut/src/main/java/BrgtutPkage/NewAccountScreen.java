/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrgtutPkage;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Ishaan
 */
public class NewAccountScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewAccountScreen
     */
    public NewAccountScreen() {
        initComponents();
        
        pnlNewAcc.setPreferredSize(new Dimension(500, 500));
        setSize(new Dimension(580, 400));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNewAcc = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblNewPlayer = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        btnMakeAcc = new javax.swing.JButton();
        txfuserName = new javax.swing.JTextField();
        txfPswrd = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlNewAcc.setLayout(null);

        lblHeading.setText("New Accounts Screen");
        pnlNewAcc.add(lblHeading);
        lblHeading.setBounds(200, 20, 150, 14);

        lblNewPlayer.setText("Username:");
        pnlNewAcc.add(lblNewPlayer);
        lblNewPlayer.setBounds(70, 100, 70, 14);

        lblNewPassword.setText("Password:");
        pnlNewAcc.add(lblNewPassword);
        lblNewPassword.setBounds(70, 130, 60, 14);

        btnMakeAcc.setText("Process");
        btnMakeAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeAccActionPerformed(evt);
            }
        });
        pnlNewAcc.add(btnMakeAcc);
        btnMakeAcc.setBounds(210, 210, 69, 23);

        txfuserName.setText("Enter Username here");
        txfuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfuserNameActionPerformed(evt);
            }
        });
        pnlNewAcc.add(txfuserName);
        txfuserName.setBounds(240, 90, 170, 30);

        txfPswrd.setText("Enter Password here");
        pnlNewAcc.add(txfPswrd);
        txfPswrd.setBounds(240, 130, 170, 30);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlNewAcc.add(btnBack);
        btnBack.setBounds(0, 0, 55, 23);

        getContentPane().add(pnlNewAcc);
        pnlNewAcc.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//variables
    
    String username=null;
    String password=null;
    boolean existingUser=false; //Check if a username is already taken
    
    
    private void btnMakeAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeAccActionPerformed
        // Will make a new user account by calling appropriate methods from the user class
        username=txfuserName.getText();
        password=txfPswrd.getText();
        
        if (username.equals("")||password.equals("")) {
            JOptionPane.showMessageDialog(null, "You cannot leave username or password field blank!");
            txfPswrd.setText("Enter a password");
            txfuserName.setText("Enter your username");
        }
        
        else if(username.equalsIgnoreCase("Enter Username here")||password.equalsIgnoreCase("Enter Password here")){
            JOptionPane.showMessageDialog(null, "Please choose appropriate username and password");
            txfPswrd.setText("Enter a password");
            txfuserName.setText("Enter your username");
        }
        else if(username.contains(" ")||password.contains(" ")){
            JOptionPane.showMessageDialog(null, "Username and password cannot contain spaces");
            txfPswrd.setText("Enter a password");
            txfuserName.setText("Enter your username");
        }
        else{
            user obj=new user(username,password);
        
        //Authenticate first to see if username already exists in textfile database
        
            existingUser= obj.authenticateUser();
        
            if (existingUser==true) {
                JOptionPane.showMessageDialog(null, "The username: "+username+" already exists!\nPlease try another username. ");
            }
            else{
                obj.saveNewUser();
                JOptionPane.showMessageDialog(null, "New user saved successfully!");
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnMakeAccActionPerformed

    private void txfuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfuserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfuserNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Go to previous page
        
                new LoginScreen().setVisible(true);

                this.setVisible(false);
                this.dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(NewAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccountScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMakeAcc;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNewPlayer;
    private javax.swing.JPanel pnlNewAcc;
    private javax.swing.JTextField txfPswrd;
    private javax.swing.JTextField txfuserName;
    // End of variables declaration//GEN-END:variables
}