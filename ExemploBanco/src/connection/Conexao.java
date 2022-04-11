
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
       String driver = "com.mysql.cj.jdbc.Driver"; 
       String url = "jdbc:mysql://yourDatabase";
       String usuario = "yourDatabaseUser";
       String senha = "yourDatabasePassword";
       try{
           Class.forName(driver);
           return DriverManager.getConnection(url, usuario, senha);
          } catch (Exception ex) 
          {
              System.out.println(ex);
              throw new RuntimeException("Erro de conexao", ex);
          }
    }
}
