
package techquizapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.DbUtil.DBConnection;
import techquizapp.Pojo.Question;
import techquizapp.Pojo.QuestionStore;


public class QuestionDAO {
    
 public static void addQuestions(QuestionStore que) throws SQLException
 {
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
    ArrayList<Question> questionList=que.getAllQuestions();
    for(Question q:questionList)
    {
      ps.setString(1,q.getExamId());
      ps.setInt(2,q.getQno());
      ps.setString(3,q.getQuestion());
      ps.setString(4,q.getAnswer1());
      ps.setString(5,q.getAnswer2());
      ps.setString(6,q.getAnswer3());
      ps.setString(7,q.getAnswer4());
      ps.setString(8,q.getCorrectAnswer());
      ps.setString(9,q.getLanguage());
        System.out.println("Questions set");
      ps.executeUpdate();
        System.out.println("Questions updated");
      
      
      
    }
    
 }
  public static void updateQuestions(QuestionStore qstore) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=?");
        ArrayList<Question> quesList=qstore.getAllQuestions();
        for(Question q:quesList)
        {
             ps.setString(1, q.getQuestion());
            ps.setString(2, q.getAnswer1());
            ps.setString(3, q.getAnswer2());
            ps.setString(4, q.getAnswer3());
            ps.setString(5, q.getAnswer4());
            ps.setString(6, q.getCorrectAnswer());
            ps.setString(7, q.getExamId());
            ps.setInt(8, q.getQno());
            ps.executeUpdate();

        }
    }
 public static ArrayList<Question>getQuestionsByExamId(String examId)throws SQLException
 {
 String qry="select * from questions where examid=?";
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1,examId);
      ResultSet rs=ps.executeQuery();
      ArrayList<Question>questionList=new ArrayList<>();
      while(rs.next())
      {
        int qno=rs.getInt(2);
        String que=rs.getString(3);
        String option1=rs.getString(4);
        String option2=rs.getString(5);
        String option3=rs.getString(6);
        String option4=rs.getString(7);
        String correctAnswer=rs.getString(8);
        String language=rs.getString(9);
        Question obj=new Question(examId,language,qno,que,option1,option2,option3,option4,correctAnswer);
          System.out.println("getQuestionsBy examId: "+obj);
        questionList.add(obj);
          System.out.println("Added in questionList");
      }
      System.out.println("QuestionList Returned:");
      return questionList;
      
 
    }
            
 }
