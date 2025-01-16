
package biblotheca.doorway;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Neeraj
 */
public class Return extends javax.swing.JFrame {
    Connection Con = null;
    String Username=null;
    String Password =null;
    String issued_book=null;
    String date=null;
    String duration;
     int Bcopies;
    public Return() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIssuedBook = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        fineCheck = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 173, 88, 27));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 127, 88, 28));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 129, 130, 26));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 90, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 227, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 173, 130, 27));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Issued Book");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("On Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 60, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Duration");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 60, -1));
        getContentPane().add(txtIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 200, 30));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 130, 30));
        getContentPane().add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 110, 30));

        fineCheck.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        fineCheck.setForeground(new java.awt.Color(0, 102, 102));
        fineCheck.setText("Fine Submitted (if any) ?");
        getContentPane().add(fineCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 210, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 390, 280));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Return your book");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
      
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fineCheck.isSelected()){
            PreparedStatement pst;
             String createUserQuery = "update user_profile set issued_currently=?,issued_for_days =?,onDate=? WHERE name=? AND password=? ";
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             Date date = new Date();
        
         
            try {
                pst = dbConnection.getConnection().prepareStatement(createUserQuery);
               
                pst.setString(1,null);
                pst.setString(2,null);
                pst.setString(3,null);
                pst.setString(4,Username);
                pst.setString(5,Password);
                if(pst.executeUpdate()!=0){
                    
                 /////////////updating record in book_collection/////////////   
                  PreparedStatement pst1;   
                  String query1 = "update book_collection set copies=? WHERE book_name=? ";
                     try {
                          pst1 = dbConnection.getConnection().prepareStatement(query1);
                             
                             pst1.setInt(1,++Bcopies);
                             pst1.setString(2,issued_book);
                             pst1.executeUpdate();
                           }catch (SQLException ex) {
                               ex.printStackTrace();
                        }
                     
                  ////////////updating record in issued_book/////////
                  PreparedStatement pst2;   
                  String query2 = "delete from issued_book where issued_by=?";
                     try {
                          
                           pst2 = dbConnection.getConnection().prepareStatement(query2);
                             
                            pst2.setString(1,Username);
                            pst2.executeUpdate();
                            }catch (SQLException ex) {
                               ex.printStackTrace();
                           }
                   JOptionPane.showMessageDialog(this , "Book has been returned successfully!", "Thank You!", JOptionPane.INFORMATION_MESSAGE);
                   this.dispose();
                   
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: Please check your Credentials");
                }
                
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            txtIssuedBook.setText("");
            txtDate.setText("");
            txtDuration.setText("");
            
            txtUsername.setText("");
            txtPass.setText("");
            
        }else{
           JOptionPane.showMessageDialog(null, "ERROR: tick the checkbox if fine is paid", "Fine Due", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Username= txtUsername.getText();
       Password = txtPass.getText();
       
       String query = "select * from user_profile WHERE name=? And password=?";
        try{  
             PreparedStatement pst = dbConnection.getConnection().prepareStatement(query);
             pst.setString(1, Username);
             pst.setString(2,Password);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                      String issued_book=rs.getString("issued_currently");
                      String date=rs.getString("onDate");
                      String duration = rs.getString("issued_for_days");
                      
                      txtIssuedBook.setText(issued_book);
                      txtDate.setText(date);
                      txtDuration.setText(duration);
                      
              }
          }catch(SQLException ex){
             Logger.getLogger(Issue_book.class.getName()).log(Level.SEVERE,null,ex);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox fineCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtIssuedBook;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
