/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import techquizapp.Pojo.User;
import techquizapp.Dao.UserDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RC
 */
public class ChangePasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordFrame
     */
    String uid,pwd,repwd;
    char[]pwd1;
    char[]pwd2;
    public ChangePasswordFrame() {
        initComponents();
    }
    public boolean validateInputs(){
        uid=txtUID.getText();
        pwd1=jPWD.getPassword();
        pwd2=jRePWD.getPassword();
        pwd=String.valueOf(pwd1);
        repwd=String.valueOf(pwd2);
        if(uid.isEmpty()||pwd1.length==0||pwd2.length==0){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUserName1 = new javax.swing.JLabel();
        btnLogout1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        jPWD = new javax.swing.JPasswordField();
        jRePWD = new javax.swing.JPasswordField();
        bnChangePWD = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblUserName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(255, 153, 102));
        lblUserName1.setText("Hello ");

        btnLogout1.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 153, 102));
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("Change Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 102));
        jLabel5.setText("ReType Pasword");

        jLabel6.setText("jLabel6");

        txtUID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUID.setForeground(new java.awt.Color(51, 255, 51));

        jPWD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPWD.setForeground(new java.awt.Color(51, 255, 51));

        jRePWD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRePWD.setForeground(new java.awt.Color(51, 255, 51));
        jRePWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRePWDActionPerformed(evt);
            }
        });

        bnChangePWD.setBackground(new java.awt.Color(0, 0, 0));
        bnChangePWD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bnChangePWD.setForeground(new java.awt.Color(0, 204, 204));
        bnChangePWD.setText("Change Password");
        bnChangePWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnChangePWDActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout1)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(bnChangePWD)
                        .addGap(80, 80, 80)
                        .addComponent(btnBack)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPWD, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(txtUID)
                    .addComponent(jRePWD))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName1)
                    .addComponent(btnLogout1))
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRePWD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnChangePWD)
                            .addComponent(btnBack)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void jRePWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRePWDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRePWDActionPerformed

    private void bnChangePWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnChangePWDActionPerformed
        // TODO add your handling code here:
        boolean validate=validateInputs();
        if(validate==false){
            JOptionPane.showMessageDialog(null,"plzz fill all values","Validate",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(pwd.equals(repwd)==false){
     JOptionPane.showMessageDialog(null,"password or retype password couldn't match","password inValide",JOptionPane.ERROR_MESSAGE);
        return;
        }
        try{
        User u=new User();
        u.setPassword(pwd);
        u.setUserType("student");
        u.setUserId(uid);
            System.out.println("password is :"+pwd);
            System.out.println("userid set :"+uid);
            System.out.println("usertype get :"+u.getUserType());
            System.out.println("password :"+u.getPassword());
        boolean result=UserDAO.ChangePassowrd(u);
            System.out.println("Result: "+result);
        if(result==true){
           JOptionPane.showMessageDialog(null," sucessfully change pwd","Change pwd",JOptionPane.INFORMATION_MESSAGE);
           
        }
        else{
     JOptionPane.showMessageDialog(null," Password Cannot be changed","Change pwd",JOptionPane.INFORMATION_MESSAGE);
   
        }
        
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"problem in db","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);

        }
    }//GEN-LAST:event_bnChangePWDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       StudentOptionsFrame f=new StudentOptionsFrame();
       f.setVisible(true);
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
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnChangePWD;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPWD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jRePWD;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables
}