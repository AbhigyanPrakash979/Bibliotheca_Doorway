
package biblotheca.doorway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Neeraj
 */
public class Remove extends javax.swing.JFrame {

    Connection Con=null;
    public Remove() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(444, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 113, 29));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 184, 29));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 84, -1));

        RemoveButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(255, 0, 0));
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Account Deletion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 35));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 165, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 203));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
       String user=  txtUsername.getText();
       String Password = String.valueOf(txtPass.getPassword()); 
        String issued_book=null;
        String Session=null;
        int No_Seats=0;
       String query = "select issued_currently,session_time from user_profile WHERE name=? And password=?";
        try{  
             PreparedStatement pst = dbConnection.getConnection().prepareStatement(query);
             pst.setString(1, user);
             pst.setString(2,Password);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                    issued_book = rs.getString("issued_currently");
                    Session=rs.getString("session_time");
                }
          }catch(SQLException ex){
             Logger.getLogger(Issue_book.class.getName()).log(Level.SEVERE,null,ex);
            }
        /////////////////////////
       
       if(issued_book!=null){
           JOptionPane.showMessageDialog(this,  "You have already issued "+issued_book+" ,return this book before deleting account", "WE ARE SORRY! :(", JOptionPane.ERROR_MESSAGE);
        
       }else{
        String delQuery = "delete from user_profile where name=? and password=?";
       int flag=0;
       try{
           PreparedStatement st1 = dbConnection.getConnection().prepareStatement(delQuery);
         
           st1.setString(1,user);
           st1.setString(2,Password);
           st1.execute();
           flag = 1;
           
       } catch (SQLException ex) {
             Logger.getLogger(Remove.class.getName()).log(Level.SEVERE, null, ex);
         }
       ////////////////////////
        String Query1 = "delete from user_credentials where username=? and User_password=?";
       try{
           PreparedStatement st2 = dbConnection.getConnection().prepareStatement(Query1);
             
           st2.setString(1,user);
           st2.setString(2,Password);
           st2.execute();
           flag++;
           if(flag == 2){
              JOptionPane.showMessageDialog(this , "ACCOUNT DELECTED !! ", "DONE", JOptionPane.OK_OPTION);
              
           }else{
              JOptionPane.showMessageDialog(this , "Could not  be deleted" , "ERROR!", JOptionPane.ERROR_MESSAGE);  
           }
       } catch (SQLException ex) {
             Logger.getLogger(Remove.class.getName()).log(Level.SEVERE, null, ex);
         }
       ////////////////////////
       if(Session!=null){
           String seatQuery="select no_seats from seats where time=?";
        try{  
             PreparedStatement pst1 = dbConnection.getConnection().prepareStatement(seatQuery);
             pst1.setString(1, Session);
             
             ResultSet rs = pst1.executeQuery();
             if(rs.next()){
                    No_Seats = rs.getInt("no_seats");
                    
                }else{
                 JOptionPane.showMessageDialog(this,  "could not fetch seat data", "WE ARE SORRY! :(", JOptionPane.ERROR_MESSAGE);
        
             }
             }catch(SQLException ex){
             Logger.getLogger(Issue_book.class.getName()).log(Level.SEVERE,null,ex);
            }
        
        String Query2 = "update seats set no_seats=? where time=?";
       try{
           PreparedStatement st3 = dbConnection.getConnection().prepareStatement(Query2);
             
           st3.setInt(1,++No_Seats);
           st3.setString(2,Session);
           st3.execute();
           flag++;
           if(flag == 3){
              JOptionPane.showMessageDialog(this , "ACCOUNT DELECTED !! ", "DONE", JOptionPane.OK_OPTION);
              
           }else{
              JOptionPane.showMessageDialog(this , "Could not  be deleted" , "ERROR!", JOptionPane.ERROR_MESSAGE);  
           }
       } catch (SQLException ex) {
             Logger.getLogger(Remove.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
       }
       txtUsername.setText("");
       txtPass.setText(""); 
        
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
