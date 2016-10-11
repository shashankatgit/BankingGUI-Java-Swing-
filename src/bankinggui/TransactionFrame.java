/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinggui;

import java.awt.event.KeyEvent;

/**
 *
 * @author fragger
 */
public class TransactionFrame extends javax.swing.JFrame {

    /**
     * Creates new form TransactionFrame
     */
    public TransactionFrame() {
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

        changePinDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        changePinButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        newPinConfirmField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        oldPinField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        newPinField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        withdrawlButton = new javax.swing.JButton();
        balInfoButton = new javax.swing.JButton();
        balTransferButton = new javax.swing.JButton();
        changePinButton = new javax.swing.JButton();
        transactionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        changePinDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        changePinDialog.setAlwaysOnTop(true);
        changePinDialog.setLocationByPlatform(true);
        changePinDialog.setMinimumSize(new java.awt.Dimension(325, 275));
        changePinDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 90));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Change PIN Form");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 20));

        changePinButton1.setText("Change PIN");
        changePinButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePinButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(changePinButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel8.setText("Confirm New PIN : ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 20));

        newPinConfirmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newPinConfirmFieldKeyTyped(evt);
            }
        });
        jPanel5.add(newPinConfirmField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 20));

        jLabel10.setText("New PIN : ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 20));

        oldPinField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oldPinFieldKeyTyped(evt);
            }
        });
        jPanel5.add(oldPinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 20));

        jLabel2.setText("Old PIN : ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 20));

        newPinField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newPinFieldKeyTyped(evt);
            }
        });
        jPanel5.add(newPinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 20));

        changePinDialog.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 220));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Transactions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depositButton.setText("1. Deposit");
        depositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        jPanel1.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        withdrawlButton.setText("2. Withdrawl");
        withdrawlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawlButtonActionPerformed(evt);
            }
        });
        jPanel1.add(withdrawlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        balInfoButton.setText("3. Balance Info");
        balInfoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(balInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, -1));

        balTransferButton.setText("4. Balance Transfer");
        balTransferButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balTransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balTransferButtonActionPerformed(evt);
            }
        });
        jPanel1.add(balTransferButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, -1));

        changePinButton.setText("5. Change PIN");
        changePinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePinButtonActionPerformed(evt);
            }
        });
        jPanel1.add(changePinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, -1));

        transactionButton.setText("6. Last 5 Transactions");
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(transactionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 260, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Welcome "+User.curUser.initials+" "+User.curUser.name+" to your transaction portal.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 470, 30));

        logOutButton.setText("Logout");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 320, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText(User.bankName);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void balTransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balTransferButtonActionPerformed
      new BalanceTransferForm().setVisible(true);
    }//GEN-LAST:event_balTransferButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        new DepositFrame().setVisible(true);
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawlButtonActionPerformed
        new WithdrawlFrame().setVisible(true);
    }//GEN-LAST:event_withdrawlButtonActionPerformed

    private void balInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balInfoButtonActionPerformed
        new ViewBalForm().setVisible(true);
    }//GEN-LAST:event_balInfoButtonActionPerformed

    private void changePinButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePinButton1ActionPerformed
        if(!(new String(newPinField.getPassword()).equals(new String(newPinConfirmField.getPassword()))))
        {
            getToolkit().beep();
            newPinField.setText("");
            newPinConfirmField.setText("");
        }
        else if(new String(newPinField.getPassword()).equals(""))
        {
             getToolkit().beep();
        }
        else if(User.curUser.matchPin(User.encodePin(new String(oldPinField.getPassword()))))
        {
            User.curUser.setPin(User.encodePin(new String(newPinField.getPassword())));
            changePinDialog.dispose();
        }
        else
        {
            getToolkit().beep();
            oldPinField.setText("");
        }
    }//GEN-LAST:event_changePinButton1ActionPerformed

    private void newPinConfirmFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPinConfirmFieldKeyTyped
        char c = evt.getKeyChar();
        if(!((c>='0') && (c<='9') || (c==java.awt.event.KeyEvent.VK_BACK_SPACE) || (c==java.awt.event.KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }

        else if(new String(newPinConfirmField.getText()).length()==4)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_newPinConfirmFieldKeyTyped

    private void oldPinFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldPinFieldKeyTyped
        char c = evt.getKeyChar();
        if(!((c>='0') && (c<='9') || (c==java.awt.event.KeyEvent.VK_BACK_SPACE) || (c==java.awt.event.KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }

        else if(new String(oldPinField.getText()).length()==4)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_oldPinFieldKeyTyped

    private void newPinFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPinFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_newPinFieldKeyTyped

    private void changePinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePinButtonActionPerformed
        changePinDialog.setVisible(true);
    }//GEN-LAST:event_changePinButtonActionPerformed

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionButtonActionPerformed
       new viewTransactionsFrame().setVisible(true);
    }//GEN-LAST:event_transactionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balInfoButton;
    private javax.swing.JButton balTransferButton;
    private javax.swing.JButton changePinButton;
    private javax.swing.JButton changePinButton1;
    private javax.swing.JDialog changePinDialog;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPasswordField newPinConfirmField;
    private javax.swing.JPasswordField newPinField;
    private javax.swing.JPasswordField oldPinField;
    private javax.swing.JButton transactionButton;
    private javax.swing.JButton withdrawlButton;
    // End of variables declaration//GEN-END:variables
}
