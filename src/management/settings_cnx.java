/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class settings_cnx {
    
    
    public static Connection getConnection() throws SQLException{
        Connection con = null;
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/log", "root", "root"); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(settings_cnx.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
