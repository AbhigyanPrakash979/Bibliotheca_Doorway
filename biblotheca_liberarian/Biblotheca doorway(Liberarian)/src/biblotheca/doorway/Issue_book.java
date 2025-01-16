
package biblotheca.doorway;

import com.sun.jdi.connect.spi.Connection;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.lang.Integer.valueOf;
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
public class Issue_book extends javax.swing.JFrame{
     Connection Con = null;
     int Bcopies;
    public Issue_book() {
        initComponents();
        issueButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        issueButton = new javax.swing.JButton();
        availabilityLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        issueButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        issueButton.setText("Issue");
        issueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueButtonActionPerformed(evt);
            }
        });

        availabilityLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        availabilityLabel.setForeground(new java.awt.Color(51, 102, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Book Name");

        checkbutton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkbutton.setText("Check availability");
        checkbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Name of User");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("User Password");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("For duration");

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Issue your Book");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(issueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkbutton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtUsername)
                                .addGap(68, 68, 68))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueButton)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbuttonActionPerformed
       String Search = txtName.getText();
        
       if(Search.trim().equals("")){
             JOptionPane.showMessageDialog(this, "Search field is empty!", "Error!", JOptionPane.ERROR_MESSAGE);
             
         }
       else{
       String query_bookName = "SELECT * FROM book_collection WHERE book_name=? ";
       
            
             try{   
                PreparedStatement pst1 = dbConnection.getConnection().prepareStatement(query_bookName);
              
                 pst1.setNString(1, Search);
                 ResultSet rs = pst1.executeQuery();
                         
                 if(rs.next()){
                      Bcopies = valueOf(rs.getInt("copies"));
                      if(Bcopies!=0){
                          
                          availabilityLabel.setText("Available");
                          issueButton.setEnabled(true);
                      }else{
                          availabilityLabel.setForeground(red);
                          availabilityLabel.setText("NOT Available");
                          txtName.setText(" ");
                      }
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Could not fetch data!", "Error!", JOptionPane.ERROR_MESSAGE); 
                 }
                 }catch(SQLException ex){
                       Logger.getLogger(Issue_book.class.getName()).log(Level.SEVERE, null, ex);
            }
       } 
    }//GEN-LAST:event_checkbuttonActionPerformed

    private void issueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueButtonActionPerformed
       
        String book = txtName.getText();
        String Username = txtUsername.getText();
        String Password = String.valueOf(txtPass.getPassword());
        String days = txtDuration.getText();
        String issued_book=null;
         String query="select issued_currently from user_profile WHERE name=? And password=?";
         try{  
             PreparedStatement pst = dbConnection.getConnection().prepareStatement(query);
             pst.setString(1, Username);
             pst.setString(2,Password);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 issued_book = rs.getString("issued_currently");
                
             }
          }catch(SQLException ex){
             Logger.getLogger(Issue_book.class.getName()).log(Level.SEVERE,null,ex);
         }
        
        
        if(txtName.equals("") || txtUsername.equals("") || txtPass.equals("") || txtDuration.equals("")){
             JOptionPane.showMessageDialog(this,"one or more fields are empty!!", "Error!", JOptionPane.ERROR_MESSAGE);
         }
        else if(issued_book != null){
            JOptionPane.showMessageDialog(this,  "You have already issued "+issued_book+" ,return this book to issue another", "WE ARE SORRY! :(", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement pst;
             String createUserQuery = "update user_profile set issued_currently=?,issued_for_days =?,onDate=? WHERE name=? AND password=? ";
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             Date date = new Date();
        
         
            try {
                pst = dbConnection.getConnection().prepareStatement(createUserQuery);
               
                pst.setString(1,book);
                pst.setString(2,days);
                pst.setString(3, sdf.format(date));
                pst.setString(4,Username);
                pst.setString(5,Password);
                if(pst.executeUpdate()!=0){
                    
                 /////////////updating record in book database/////////////   
                  PreparedStatement pst1;   
                  String query1 = "update book_collection set copies=? WHERE book_name=? ";
                     try {
                          pst1 = dbConnection.getConnection().prepareStatement(query1);
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
                          
                           pst2 = dbConnection.getConnection().prepareStatement(query2);
                             
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
        
        
    }//GEN-LAST:event_issueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JButton checkbutton;
    private javax.swing.JButton issueButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
