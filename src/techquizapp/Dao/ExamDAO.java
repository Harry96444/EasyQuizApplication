
package techquizapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.DbUtil.DBConnection;
import techquizapp.Pojo.Exam;


public class ExamDAO {
    
    public static String getExamID() throws SQLException
    {
       Connection conn=DBConnection.getConnection();
      Statement st=conn.createStatement();
      int count;
      ResultSet rs=st.executeQuery("select count(*) from exam");
      rs.next();
      count=rs.getInt(1);
      String newId="EX-"+(count+1);
      return newId;
    }
    
    public static boolean addExam(Exam exam)throws SQLException
    {
      Connection conn=DBConnection.getConnection();
        System.out.println(exam);
      PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
      
        System.out.println(exam);
      ps.setString(1,exam.getExamId());
        System.out.println("Exam id");
      ps.setString(2,exam.getLanguage());
        System.out.println("Language");
      ps.setInt(3,exam.getTotalQuestions());
        System.out.println("Parameter set!");
      int ans=ps.executeUpdate();
        System.out.println("Record Updated!");
      return ans==1;
    }
    
    public static ArrayList<String>getExamIdBysubject(String subject)throws SQLException
    {
      String qry="select examid from exam where language=?";
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1,subject);
      ResultSet rs=ps.executeQuery();
      ArrayList<String>examList=new ArrayList<>();
      while(rs.next())
      {
       examList.add(rs.getString(1));
      }
        System.out.println("examList in getExamID :"+examList);
      return examList;
     
    }
    
     public static int getQuestionCountByExam(String examId)throws SQLException
    {
      String qry="select total_question  from exam where examid=?";
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1,examId);
      ResultSet rs=ps.executeQuery();
      ArrayList<String>examList=new ArrayList<>();
      rs.next();
      System.out.println("examList in getQuestionCount :"+examList);
      return rs.getInt(1);
    
    }
     
     public static boolean isPaperSet(String subject)throws Exception
     {
       String qry="select 1 from exam where language=?";
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1,subject);
      ResultSet rs=ps.executeQuery();
      return rs.next();
     }
     
     public static ArrayList<String>getExamIdBySubject(String userid,String subject)throws SQLException
     {
       String qry="select examid from exam where language=? minus select examid from performance where userid=?";
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1,subject);
      ps.setString(2,userid);
      ResultSet rs=ps.executeQuery();
      ArrayList<String>examIdList=new ArrayList<>();
      while(rs.next())
      {
       examIdList.add(rs.getString(1));
      }
        System.out.println("examList in getExamID :"+examIdList);
      return examIdList;
     }

}
