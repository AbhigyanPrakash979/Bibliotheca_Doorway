
package biblotheca.doorway;



import static java.awt.Color.blue;
import static java.awt.Color.orange;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Aniket
 */
public class book_menu extends javax.swing.JFrame {
   String Username=null;
   String Password = null;
   Connection Con=null;
    public book_menu() throws SQLException {
      
    }

    public book_menu (String username, String pass) throws SQLException {
        Username=username;
        Password = pass;
       initComponents();
          Refresh();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyTable = new javax.swing.JTable();
        jBookMySeat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IssueBook = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 350, 28));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\biblothec\\search.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 50, 28));

        jButton2.setText("My Profiile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 60, 110, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\12f5b3b253a0410ea8062163620955da (5).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 130));

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 120, -1));

        MyTable.setBackground(new java.awt.Color(0, 51, 102));
        MyTable.setForeground(new java.awt.Color(255, 255, 255));
        MyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book name", "Author", "Genre", "ratings"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MyTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyTable.setEnabled(false);
        MyTable.setMinimumSize(new java.awt.Dimension(75, 100));
        MyTable.setOpaque(false);
        MyTable.setPreferredSize(new java.awt.Dimension(1350, 750));
        MyTable.setRowHeight(60);
        MyTable.setRowMargin(5);
        MyTable.setShowGrid(true);
        MyTable.getTableHeader().setResizingAllowed(false);
        MyTable.getTableHeader().setReorderingAllowed(false);
        MyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MyTable);
        if (MyTable.getColumnModel().getColumnCount() > 0) {
            MyTable.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 1190, 640));

        jBookMySeat.setBackground(new java.awt.Color(255, 153, 0));
        jBookMySeat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBookMySeat.setText("Book a Seat");
        jBookMySeat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBookMySeat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBookMySeat.setOpaque(true);
        jBookMySeat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBookMySeatMouseMoved(evt);
            }
        });
        jBookMySeat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBookMySeatFocusGained(evt);
            }
        });
        jBookMySeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBookMySeatMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBookMySeatMousePressed(evt);
            }
        });
        getContentPane().add(jBookMySeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Renew Book");
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Sign out");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 160, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Contact Liberarian");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 30));

        IssueBook.setBackground(new java.awt.Color(255, 153, 0));
        IssueBook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IssueBook.setText("Issue a book");
        IssueBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IssueBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IssueBook.setOpaque(true);
        IssueBook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                IssueBookMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IssueBookMouseMoved(evt);
            }
        });
        IssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IssueBookMousePressed(evt);
            }
        });
        getContentPane().add(IssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 30));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setOpaque(true);
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 140));

        jLabel26.setBackground(new java.awt.Color(0, 51, 102));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 1350, 640));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 755));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
           
        
        try{
         
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql:///Biblotheca", "root", "a1b2c3d4");
               } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
               }                             
        }catch(SQLException ex){
             Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
         }
              
        String query = "SELECT * FROM User_credentials WHERE username=? and User_password=? ";
         
        try{  
         PreparedStatement st = DBConnection.getConnection().prepareStatement(query);
         st.setString(1, Username);
         st.setString(2, Password);
         ResultSet rs = st.executeQuery();
          
         if(rs.next()){
            User_profile frame = new User_profile(Username,Password);
             frame.setVisible(true);
            
          }else{
               JOptionPane.showMessageDialog(this , "No such User exist, Check your username", "Error!", JOptionPane.ERROR_MESSAGE);
             }
          }catch(SQLException ex){
             Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
       
        Refresh();
        
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Search = txtSearch.getText();
        
         String query_bookName = "SELECT * FROM book_collection WHERE book_name=? ";
     
            try{ 
                
                PreparedStatement pst1 = DBConnection.getConnection().prepareStatement(query_bookName);
                    
                 pst1.setNString(1, Search);
                 ResultSet rs = pst1.executeQuery();
                 DefaultTableModel tm =(DefaultTableModel)MyTable.getModel();
                 tm.setRowCount(0);
          
                 if(rs.next()){
                    
                String name=String.valueOf(rs.getString("book_name"));
                 String author=String.valueOf(rs.getString("author"));
                 String genre=String.valueOf(rs.getString("genre"));
                 String ratings= String.valueOf("ratings");
                 String tbdata[]={ name,author,genre,ratings};
                 tm.addRow(tbdata);
                    
                  }else{
                     JOptionPane.showMessageDialog(this , "No such User exist, Check your username and pasword.", "Login Error!", JOptionPane.ERROR_MESSAGE);
                    }     
                  }catch(SQLException ex){
                       Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IssueBookMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookMouseDragged
        
      while(evt.isConsumed()){
           IssueBook.setBackground(blue);
       }
        
    }//GEN-LAST:event_IssueBookMouseDragged

    private void MyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyTableMouseClicked
        
    }//GEN-LAST:event_MyTableMouseClicked

    private void IssueBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookMousePressed
       
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql:///Biblotheca", "root", "a1b2c3d4");
               } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
               } catch (SQLException ex) {                             
            Logger.getLogger(Renew_book.class.getName()).log(Level.SEVERE, null, ex);
              }  
        
         String query="select issued_currently from user_profile WHERE name=?";
         try{  
             PreparedStatement pst = DBConnection.getConnection().prepareStatement(query);
             pst.setString(1, Username);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 String book = rs.getString("issued_currently");
                if(book!=null){
                    JOptionPane.showMessageDialog(this ,"You have already issued "+book+", you need to return it first.", "Error!", JOptionPane.ERROR_MESSAGE);
                }else{
                    Issue_Book frame = new Issue_Book(Username);
                    frame.setVisible(true);
                }
             }
          }catch(SQLException ex){
             Logger.getLogger(User_profile.class.getName()).log(Level.SEVERE,null,ex);
         }
        
        
      
    }//GEN-LAST:event_IssueBookMousePressed

    private void IssueBookMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookMouseMoved
        while(evt.isConsumed()){
           IssueBook.setBackground(blue);
         }
    }//GEN-LAST:event_IssueBookMouseMoved

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        Renew_book frame = new Renew_book(Username,Password);
        frame.setVisible(true);   
    }//GEN-LAST:event_jLabel4MousePressed

    private void jBookMySeatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBookMySeatMousePressed
        
        Book_seat frame = new Book_seat(Username);
        frame.setVisible(true);
    }//GEN-LAST:event_jBookMySeatMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Username=null;
        Administrator frame = new Administrator();
        frame.setVisible(true);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jBookMySeatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBookMySeatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jBookMySeatFocusGained

    private void jBookMySeatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBookMySeatMouseMoved
     
          
    }//GEN-LAST:event_jBookMySeatMouseMoved

    private void jBookMySeatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBookMySeatMouseEntered
         while(evt.isConsumed())
             jBookMySeat.setBackground(orange);
    }//GEN-LAST:event_jBookMySeatMouseEntered

    public final void Refresh(){
    
      try{
             String query = "SELECT * FROM book_collection";
             PreparedStatement pst = DBConnection.getConnection().prepareStatement(query);
             ResultSet rs = pst.executeQuery();
             DefaultTableModel tm = (DefaultTableModel)MyTable.getModel();
             tm.setRowCount(0);
             
             while(rs.next()){
                 String name=String.valueOf(rs.getString("book_name"));
                 String author=String.valueOf(rs.getString("author"));
                 String genre=String.valueOf(rs.getString("genre"));
                 String ratings= String.valueOf(rs.getString("ratings"));
                 String tbdata[]={name,author,genre,ratings};
                 tm.addRow(tbdata);
                 
             }
             
         }
          catch(SQLException ex){
             System.out.println(ex);
          }
    
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
            java.util.logging.Logger.getLogger(book_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new book_menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(book_menu.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
         });      
        
    }  
        
          
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IssueBook;
    private javax.swing.JTable MyTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel jBookMySeat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    
}
