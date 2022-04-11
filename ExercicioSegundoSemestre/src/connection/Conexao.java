/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        String url = "jdbc:mysql://yourDatabaseURL";
        String usuario = "yourDatabaseUser";
        String senha = "yourDatabasePassword";
        Class.forName(driver);
        return DriverManager.getConnection(url, usuario, senha);
    }
}
