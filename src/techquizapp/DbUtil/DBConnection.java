/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Harsh Vyas
 */
public class DBConnection {
    
    private static Connection conn;
    
    static {
    
    try{
    
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-3KF6ODF6:1521/XE","system","har123");
        JOptionPane.showMessageDialog(null,"Connected to database Successfully!");
        
    }catch(Exception ex)
    {
       JOptionPane.showMessageDialog(null,"Cannot connected to database!");
       ex.printStackTrace();
       System.exit(1);
    }
    
    }
    
    public static Connection getConnection()
    {
      return conn;
    }
    public static void closeConnection()
    {
        try
        {
          conn.close();
          JOptionPane.showMessageDialog(null,"Disconnected successfully to database!");
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Cannot disconnect to database!");
           ex.printStackTrace();
        }
    }
} 
