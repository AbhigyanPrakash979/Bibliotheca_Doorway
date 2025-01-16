package biblotheca.doorway;

import java.sql.Connection;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Book_seat extends javax.swing.JFrame {
     Connection Con=null;
     int Aseats ;
     String selected = null;
     String Username=null;
    public Book_seat() {
        initComponents();
    }

    public Book_seat(String name) {
       Username = name;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Ctime = new javax.swing.JComboBox<>();
        txtSeatinfo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Select your time");

        Ctime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00-09:00 AM", "09:00-10:00 AM", "10:00-11:00 AM", "11:00-12:00 AM", "01:00-02:00 PM", "02:00-03:00 PM", "03:00-04:00 PM", "04:00-05:00 PM", "05:00-06:00 PM", "06:00-07:00 PM", "07:00-08:00 PM", " " }));
        Ctime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CtimeMouseClicked(evt);
            }
        });
        Ctime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtimeActionPerformed(evt);
            }
        });

        txtSeatinfo.setForeground(new java.awt.Color(0, 102, 0));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Reserve Seat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("It's time to book your seat ");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(Ctime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeatinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ctime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSeatinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtimeActionPerformed
     JComboBox comboBox = (JComboBox) evt.getSource();
     Object value = comboBox.getSelectedItem();
     selected= (String)value;
     try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Con = java.sql.DriverManager.getConnection("jdbc:mysql:///biblotheca", "root", "a1b2c3d4");
              
              } catch (ClassNotFoundException ex) {
              Logger.getLogger(Book_seat.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) { 
             Logger.getLogger(Book_seat.class.getName()).log(Level.SEVERE, null, ex);
         }
     
        
       String query_bookName = "SELECT no_seats FROM seats WHERE time=? ";
          try{   
                PreparedStatement pst1 = DBConnection.getConnection().prepareStatement(query_bookName);
              
                 pst1.setNString(1, (String) value);
                 ResultSet rs = pst1.executeQuery();
                         
                 if(rs.next()){
                     int no_seats = rs.getInt("no_seats");
                     Aseats=no_seats;
                     txtSeatinfo.setText(no_seats+" seats are AVAILABLE");
                      
                 }
                 else{
                      txtSeatinfo.setForeground(red);
                      txtSeatinfo.setText("NOT Available");
                      
                 }
                 }catch(SQLException ex){
                       Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
       
     
    
    }//GEN-LAST:event_CtimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtSeatinfo.equals("NOT Available")){
            JOptionPane.showMessageDialog(this, "Seat is not available, choose different timings please", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{
           
            String query = "update seats set no_seats=?  WHERE time=? ";
          try{   
                PreparedStatement pst1 = DBConnection.getConnection().prepareStatement(query);
                 int seats = Aseats-1; 
                 pst1.setInt(1,seats);
                 pst1.setNString(2, selected);
                 if( pst1.executeUpdate()!=0){
                     
                     String query2 = "update user_profile set session_time=?  WHERE name=? ";
                    try{   
                         PreparedStatement pst2 = DBConnection.getConnection().prepareStatement(query2);
                          
                         pst2.setString(1,selected);
                         pst2.setNString(2, Username);
                         pst2.executeUpdate();
                         
                      }catch(SQLException ex){
                       Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     
                    JOptionPane.showMessageDialog(this, "Your Seat is reserved untill you change it again, Thankyou!", "Done", JOptionPane.OK_OPTION);
                     this.dispose();
                 }
                 else{
                      txtSeatinfo.setForeground(red);
                      txtSeatinfo.setText("NOT Available");
                 }
                 }catch(SQLException ex){
                       Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CtimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CtimeMouseClicked
        
    }//GEN-LAST:event_CtimeMouseClicked

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
            java.util.logging.Logger.getLogger(Book_seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_seat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ctime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtSeatinfo;
    // End of variables declaration//GEN-END:variables

}
