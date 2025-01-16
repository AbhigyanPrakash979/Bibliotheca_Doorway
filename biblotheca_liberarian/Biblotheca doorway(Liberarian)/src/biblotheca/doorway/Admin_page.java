
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
 * @author LENOVO
 */
public class Admin_page extends javax.swing.JFrame {

    Connection Con=null;
    
    public Admin_page() {
        initComponents();
        saveButton.setEnabled(false);
        try {
            Refresh();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSetPass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(532, 532));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Librarian's Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 43));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 73, 28));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 96, 28));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 28));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Joined date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 96, 23));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salary");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 96, 28));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 100, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Edit Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 110, 30));

        saveButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 110, 30));

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 80));

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButton.setText("Delete Account");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 120, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 30));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 30));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButton3.setText("Save new data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 280, 110, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Set Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 100, 30));

        txtSetPass.setEditable(false);
        getContentPane().add(txtSetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 200, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 360, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if((jTextField1.getText()).isEmpty()|| (jTextField2.getText()).isEmpty() || (jTextField3.getText()).isEmpty()|| (jTextField4.getText()).isEmpty()|| (jTextField5.getText()).isEmpty()){
            JOptionPane.showMessageDialog(this , "Please add new Librarian before closing", "Alert!", JOptionPane.ERROR_MESSAGE);
        }else{
        this.dispose();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        saveButton.setEnabled(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name=jTextField1.getText();
        String Pno = jTextField2.getText();
        String email = jTextField3.getText();
        String salary = jTextField4.getText();
        String joinedDate = jTextField5.getText();
        

        if(name.equals("") ||Pno.equals("") || email.equals("")||salary.equals("")||joinedDate.equals("")){
            JOptionPane.showMessageDialog(this , "Empty field detected!", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{

            try {
                PreparedStatement pst;

                String update = "update librarian set username=?,email=?,create_date=?,phone_number=?,Salary=?";

                pst = dbConnection.getConnection().prepareStatement(update);

                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, joinedDate);
                pst.setString(4, Pno);
                pst.setString(5, salary);

                if(pst.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Your Record has been updated");
                }
            }catch (SQLException ex) {
                Logger.getLogger(Lib_profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);

        try {
            Refresh();
        } catch (SQLException ex) {
            Logger.getLogger(Lib_profile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      JOptionPane.showMessageDialog(this , "Permanently delete Librarian ? " , "Alert!", JOptionPane.YES_OPTION); 
        if(JOptionPane.YES_NO_CANCEL_OPTION==1){
             String delQuery = "delete from librarian ";
        
             try{
                PreparedStatement st1 = dbConnection.getConnection().prepareStatement(delQuery);
            
                if(st1.executeUpdate()!=0){
                    JOptionPane.showMessageDialog(this , "ACCOUNT DELECTED !! ", "DONE", JOptionPane.OK_OPTION);
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    
                    jTextField1.setEditable(true);
                     jTextField2.setEditable(true);
                     jTextField3.setEditable(true);
                     jTextField4.setEditable(true);
                     jTextField5.setEditable(true);
                     
                    
                     jLabel7.setEnabled(true);
                     txtSetPass.setEnabled(true);
                     txtSetPass.setEditable(true);
                
                 }else{
                     JOptionPane.showMessageDialog(this , "Could not  be deleted" , "ERROR!", JOptionPane.ERROR_MESSAGE);
                 }
               } catch (SQLException ex) {
                     Logger.getLogger(Admin_page.class.getName()).log(Level.SEVERE, null, ex);
               }
         }
            
        

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
         String name=jTextField1.getText();
        String Pno = jTextField2.getText();
        String email = jTextField3.getText();
        String salary = jTextField4.getText();
        String joinedDate = jTextField5.getText();
        String Pass = txtSetPass.getText();
        

        if(name.equals("") ||Pno.equals("") || email.equals("")||salary.equals("")||joinedDate.equals("")){
            JOptionPane.showMessageDialog(this , "Empty field detected!", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{

            try {
                PreparedStatement pst;

                String update = "insert into librarian(username,email,password,create_date,phone_number,Salary) values(?,?,?,?,?,?)";

                pst = dbConnection.getConnection().prepareStatement(update);

                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, Pass);
                pst.setString(4, joinedDate);
                pst.setString(5, Pno);
                pst.setString(6, salary);
                
                if(pst.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "New Librarian has been added");
                    jTextField1.setEditable(false);
                    jTextField2.setEditable(false);
                    jTextField3.setEditable(false);
                    jTextField4.setEditable(false);
                    jTextField5.setEditable(false);
                    jTextField5.setEditable(false);

                }
                }catch (SQLException ex) {
                Logger.getLogger(Lib_profile.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }//GEN-LAST:event_jButton3ActionPerformed
  }
    
    public final void Refresh() throws SQLException{
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Con = java.sql.DriverManager.getConnection("jdbc:mysql:///biblotheca", "root", "a1b2c3d4");
              
              } catch (ClassNotFoundException ex) {
              Logger.getLogger(Lib_profile.class.getName()).log(Level.SEVERE, null, ex);
              }
           
        
             String query = "SELECT * FROM librarian ";
        try{  
         PreparedStatement st = dbConnection.getConnection().prepareStatement(query);
         ResultSet rs = st.executeQuery();
     
        if(rs.next()){
             
             jTextField1.setText(rs.getString("username"));
             jTextField2.setText(String.valueOf(rs.getLong("phone_number")));
             jTextField3.setText(rs.getString("email"));
             jTextField4.setText(rs.getString("Salary"));
             jTextField5.setText(rs.getString("create_date"));
             
             
         }
         else{
               JOptionPane.showMessageDialog(this , "Error refreshing your data", "Login Error!", JOptionPane.ERROR_MESSAGE);
         }
          
        }
        catch(SQLException ex){
             Logger.getLogger(Admin_page.class.getName()).log(Level.SEVERE, null, ex);
        }
      saveButton.setEnabled(false);
      jLabel7.setEnabled(false);
      txtSetPass.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtSetPass;
    // End of variables declaration//GEN-END:variables
}
