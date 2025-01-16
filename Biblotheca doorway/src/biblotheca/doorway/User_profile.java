
package biblotheca.doorway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User_profile extends javax.swing.JFrame {
  
     Connection Con=null;
     String user= null; 
     String Password= null;
     String issued_currently=null;
    public User_profile(){
         
    }
    
    public User_profile(String user1, String pass) throws SQLException {
       user = user1;
       Password=pass;
       initComponents();
       Refresh();
      
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBookIssued = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 400));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 101, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 155, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Profile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, 32));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));

        txtPhone.setEditable(false);
        txtPhone.setBackground(new java.awt.Color(51, 51, 51));
        txtPhone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, 30));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 270, 30));

        txtBookIssued.setEditable(false);
        txtBookIssued.setBackground(new java.awt.Color(51, 51, 51));
        txtBookIssued.setForeground(new java.awt.Color(255, 255, 255));
        txtBookIssued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIssuedActionPerformed(evt);
            }
        });
        getContentPane().add(txtBookIssued, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 270, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book issued");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 25));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Session time");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("For days");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 70, 20));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(51, 51, 51));
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 380, 30));

        txtTime.setBackground(new java.awt.Color(51, 51, 51));
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 140, 30));

        txtDays.setEditable(false);
        txtDays.setBackground(new java.awt.Color(51, 51, 51));
        txtDays.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 50, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 580, 340));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 140, 50));

        EditButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EditButton.setText("Edit Details");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 120, -1));

        SaveButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                SaveButtonComponentHidden(evt);
            }
        });
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 120, -1));

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButton.setText("Delete Account");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBookIssuedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIssuedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIssuedActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        txtName.setEditable(true);
        txtPhone.setEditable(true);
        txtAddress.setEditable(true);
        txtEmail.setEditable(true);
        SaveButton.setEnabled(true);
    }//GEN-LAST:event_EditButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        String name=txtName.getText();
        String Pno = txtPhone.getText();
        String address = txtAddress.getText();
        String mail = txtEmail.getText();
        
    if(name.equals("") ||Pno.equals("") || address.equals("") || mail.equals("")){
        JOptionPane.showMessageDialog(this , "Empty fielf detected!", "Error!", JOptionPane.ERROR_MESSAGE);
    }else{
       
       try {
                PreparedStatement pst;
                ResultSet rst;
                
                String createUserQuery = "update user_profile set name=?,mobile_number=?,address=?,e_mail=? where password=?";
              
                    pst = DBConnection.getConnection().prepareStatement(createUserQuery);
                    
                    pst.setString(1, name);
                    pst.setString(2, Pno);
                    pst.setString(3, address);
                    pst.setString(4, mail);
                    pst.setString(5, Password);
                    
                    if(pst.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your Record has been updated");
                    }
                   }catch (SQLException ex) {
                    Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
         txtName.setEditable(true);
         txtPhone.setEditable(true);
         txtAddress.setEditable(true);
         txtEmail.setEditable(true);
         
    
         try {
             Refresh();
         } catch (SQLException ex) {
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void SaveButtonComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SaveButtonComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonComponentHidden

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      
        String query = "select issued_currently from user_profile WHERE name=? And password=?";
        try{  
             PreparedStatement pst = DBConnection.getConnection().prepareStatement(query);
             pst.setString(1, user);
             pst.setString(2,Password);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                    issued_currently = rs.getString("issued_currently");
                }
          }catch(SQLException ex){
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE,null,ex);
            }
        
        
       if(issued_currently==null){ 
        String delQuery = "delete from user_profile where name=? and password=?";
       int flag=0;
       try{
           PreparedStatement st1 = DBConnection.getConnection().prepareStatement(delQuery);
         
           st1.setString(1,user);
           st1.setString(2,Password);
           st1.execute();
           flag = 1;
           
       } catch (SQLException ex) {
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE, null, ex);
         }
       ////////////////////////
        String Query1 = "delete from user_credentials where username=? and User_password=?";
       try{
           PreparedStatement st2 = DBConnection.getConnection().prepareStatement(Query1);
             
           st2.setString(1,user);
           st2.setString(2,Password);
           st2.execute();
           flag++;
           if(flag == 2){
              JOptionPane.showMessageDialog(this , "ACCOUNT DELECTED !! ", "DONE", JOptionPane.OK_OPTION);
              Administrator frame = new Administrator();
              frame.setVisible(true);
              this.dispose();
           }else{
              JOptionPane.showMessageDialog(this , "Could not  be deleted" , "ERROR!", JOptionPane.ERROR_MESSAGE);  
           }
       } catch (SQLException ex) {
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE, null, ex);
         }
       }else{
           JOptionPane.showMessageDialog(this , "You need to return the book first!" , "ERROR!", JOptionPane.ERROR_MESSAGE); 
       }
       
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Refresh() throws SQLException{
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Con = java.sql.DriverManager.getConnection("jdbc:mysql:///biblotheca", "root", "a1b2c3d4");
              
              } catch (ClassNotFoundException ex) {
              Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
              }
           
        
             String query = "SELECT * FROM user_profile WHERE name=? and password=?";
        try{  
         PreparedStatement st = DBConnection.getConnection().prepareStatement(query);
         st.setString(1, user);
         st.setString(2,Password);
         ResultSet rs = st.executeQuery();
     
        if(rs.next()){
             
             String Name = rs.getString("name");
             String Address = rs.getString("address");
             String e_mail = rs.getString("e_mail");
             String Pno = String.valueOf(rs.getLong("mobile_number"));
             issued_currently = rs.getString("Issued_currently");
             String issued_for_days = rs.getString("Issued_for_days");
             String time = rs.getString("session_time"); 
             txtName.setText(Name);
             txtPhone.setText(Pno);
             txtAddress.setText(Address);
             txtEmail.setText(e_mail);
             txtBookIssued.setText(issued_currently);
             txtDays.setText(issued_for_days);
             txtTime.setText(time);
         }
         else{
               JOptionPane.showMessageDialog(this , "Error refreshing your data", "Login Error!", JOptionPane.ERROR_MESSAGE);
         }
          
        }
        catch(SQLException ex){
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
      SaveButton.setEnabled(false);
        
     
    }
    
    
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
            java.util.logging.Logger.getLogger(User_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBookIssued;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
