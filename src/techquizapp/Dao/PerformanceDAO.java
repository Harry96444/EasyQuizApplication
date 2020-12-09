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
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.DbUtil.DBConnection;
import techquizapp.Pojo.Performance;
import techquizapp.Pojo.Question;

/**
 *
 * @author Harsh Vyas
 */
public class PerformanceDAO {
    
    public static void addPerformance(Performance p) throws SQLException         
    {
      Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
    
      ps.setString(1,p.getUserId());
      ps.setString(2,p.getExamId());
      ps.setInt(3,p.getRight());
      ps.setInt(4,p.getWrong());
      ps.setInt(5,p.getUnattempted());
      ps.setDouble(6,p.getPer());
      ps.setString(7,p.getLanguage());
      
        System.out.println("Questions set");
      ps.executeUpdate();
        System.out.println("Questions updated");
    }
     
     public static ArrayList<String> getAllStudents() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select distinct userid from performance");
        if(rs==null)
            return null;
        ArrayList<String> studentList=new ArrayList<>();
        while(rs.next())
        {
            studentList.add(rs.getString(1));
        }
        return studentList;
    }
    public static ArrayList<String> getExamIdByStudentName(String student) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from performance where userid=?");
        ps.setString(1, student);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examList=new ArrayList<>();
        while(rs.next())
        {
            examList.add(rs.getString(1));
        }
        return examList;
    }
    
    public static Performance getScore(String student,String examid) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareCall("select language,per from performance where userid=? and examid=?");
        ps.setString(1, student);
        ps.setString(2, examid);
        ResultSet rs=ps.executeQuery();
        rs.next();
        Performance perf=new Performance();
        perf.setLanguage(rs.getString(1));
        perf.setPer(rs.getDouble(2));
        return perf;
    }
     public static ArrayList<Performance> viewAllStudentsScore()throws SQLException{
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs= st.executeQuery("select * from performance");
        ArrayList<Performance>list=new ArrayList<>();
        Performance p;
        while(rs.next()){
           p=new Performance();
           p.setUserId(rs.getString(1));
           p.setExamId(rs.getString(2));
           p.setRight(rs.getInt(3));
           p.setWrong(rs.getInt(4));
           p.setUnattempted(rs.getInt(5));
           p.setPer(rs.getDouble(6));
            p.setLanguage(rs.getString(7));
           list.add(p);
        }
        return list;
    }
      
}