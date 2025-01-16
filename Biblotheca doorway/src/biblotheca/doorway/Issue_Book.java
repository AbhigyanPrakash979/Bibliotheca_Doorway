
package biblotheca.doorway;

import com.sun.jdi.connect.spi.Connection;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.io.IOException;
import static java.lang.Integer.valueOf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Issue_Book extends javax.swing.JFrame {

   Connection Con = null;
   String Username=null;
   int Bcopies;
    public Issue_Book() {
        initComponents();
        issue_button.setEnabled(false);
    }
    public Issue_Book(String user){
        Username=user;
        initComponents();
        issue_button.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBook = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtavailability = new javax.swing.JLabel();
        issue_button = new javax.swing.JButton();
        txtdays = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocation(new java.awt.Point(390, 190));
        setPreferredSize(new java.awt.Dimension(686, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Issue Your Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 12, 139, 29));

        jLabel2.setText("Enter the book name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 69, 128, 24));
        getContentPane().add(txtBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 305, 27));

        jLabel3.setText("Enter the number of days:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 154, 150, 27));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Check availability");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 101, 152, -1));

        txtavailability.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        txtavailability.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(txtavailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 126, 27));

        issue_button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        issue_button.setForeground(new java.awt.Color(51, 102, 0));
        issue_button.setText("Issue");
        issue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(issue_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 136, -1));
        getContentPane().add(txtdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 70, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String Search = txtBook.getText();
        
       if(Search.trim().equals("")){
             JOptionPane.showMessageDialog(this, "One or more fields are empty!", "Error!", JOptionPane.ERROR_MESSAGE);
             
         }
       else{
       String query_bookName = "SELECT * FROM book_collection WHERE book_name=? ";
       
            
             try{   
                PreparedStatement pst1 = DBConnection.getConnection().prepareStatement(query_bookName);
              
                 pst1.setNString(1, Search);
                 ResultSet rs = pst1.executeQuery();
                         
                 if(rs.next()){
                      Bcopies = valueOf(rs.getInt("copies"));
                      if(Bcopies!=0){
                          
                          txtavailability.setText("Available");
                          issue_button.setEnabled(true);
                      }else{
                          txtavailability.setForeground(red);
                          txtavailability.setText("NOT Available");
                          Search=null;
                    }
                 }else{
                     JOptionPane.showMessageDialog(this, "Some unkown error occured ", "WE ARE SORRY! :(", JOptionPane.ERROR_MESSAGE);
                 }
                 
                 }catch(SQLException ex){
                       Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
            }
       }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void issue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_buttonActionPerformed
        String book = txtBook.getText();
        String days = txtdays.getText();
        
        if(book.trim().equals("") || days.equals("")){
             JOptionPane.showMessageDialog(this, "One or more fields are empty!", "Error!", JOptionPane.ERROR_MESSAGE);
         }
        else if(txtavailability.equals("NOT Available")){
            JOptionPane.showMessageDialog(this, "The book is not available currectly! ", "WE ARE SORRY! :(", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement pst;
             String createUserQuery = "update user_profile set issued_currently=?,issued_for_days =?,onDate=? WHERE name=? ";
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             Date date = new Date();
        
         
            try {
                pst = DBConnection.getConnection().prepareStatement(createUserQuery);
               
                pst.setString(1,book);
                pst.setString(2,days);
                pst.setString(3, sdf.format(date));
                pst.setString(4,Username);
                if(pst.executeUpdate()!=0){
                    
                 /////////////updating record in book database/////////////   
                  PreparedStatement pst1;   
                  String query1 = "update book_collection set copies=? WHERE book_name=? ";
                     try {
                          pst1 = DBConnection.getConnection().prepareStatement(query1);
                             Bcopies--;
                             pst1.setInt(1,Bcopies);
                             pst1.setString(2,book);
                             pst1.executeUpdate();
                          }catch (SQLException ex) {
                               ex.printStackTrace();
                        }
                     
                  ////////////updateing record in issued_book/////////
                  PreparedStatement pst2;   
                  String query2 = "insert into issued_book(book_name,issued_by,on_date,duration) values(?,?,?,?)";
                     try {
                          
                           pst2 = DBConnection.getConnection().prepareStatement(query2);
                             
                            pst2.setString(1,book);
                            pst2.setString(2,Username);
                            pst2.setString(3,sdf.format(date));
                            pst2.setString(4,days);
                           
                            pst2.executeUpdate();
                            }catch (SQLException ex) {
                               ex.printStackTrace();
                           }
                   JOptionPane.showMessageDialog(this , "Your book is issued !", "Thank You!", JOptionPane.INFORMATION_MESSAGE);
                   this.dispose();
                   
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: Please check your Credentials");
                }
                
            }catch (SQLException ex) {
                ex.printStackTrace();
            } 
            this.dispose();
        }
        
         
        
    }//GEN-LAST:event_issue_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton issue_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBook;
    private javax.swing.JLabel txtavailability;
    private javax.swing.JTextField txtdays;
    // End of variables declaration//GEN-END:variables
}
