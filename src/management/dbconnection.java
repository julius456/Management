/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class dbconnection { 
  public static Connection connect() throws SQLException{
        Connection conn= null;
        try{
            
            
            conn=DriverManager.getConnection("dbc:mysql://localhost/official","root","root");
            
            Component rootPane=null;
            System.out.println("Connected");      
        
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return conn;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}