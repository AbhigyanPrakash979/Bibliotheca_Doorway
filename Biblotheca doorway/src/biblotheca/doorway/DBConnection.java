
package biblotheca.doorway;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class DBConnection {
    
     private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname = "Bibliotheca";
     private static final int portnumber = 3306;
    private static final String password = "your_password";
    
    public static Connection getConnection(){
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
    
}
