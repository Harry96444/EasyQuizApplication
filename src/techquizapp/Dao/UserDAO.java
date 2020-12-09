/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.DbUtil.DBConnection;
import techquizapp.Pojo.User;

/**
 *
 * @author Harsh Vyas
 */
public class UserDAO {

   public static boolean validateUser(User user)throws SQLException
   {
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
     ps.setString(1,user.getUserId());
     ps.setString(2,user.getPassword());
     ps.setString(3,user.getUserType());  
     ResultSet rs=ps.executeQuery();
      return rs.next();
   }
    public static boolean createUser(User user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        return false;
                    
    }
    
    public static boolean checkUser(String username) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=?");
        ps.setString(1, username);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
     public static boolean ChangePassowrd(User u)throws SQLException{
         PreparedStatement ps=DBConnection.getConnection().prepareStatement("update users set password=? where userid=?");
         ps.setString(2,u.getUserId()); 
         ps.setString(1,u.getPassword());
         int i=ps.executeUpdate();
         return i==1;
    }
}
