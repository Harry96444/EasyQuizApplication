/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.Pojo;

import java.util.Objects;

/**
 *
 * @author Harsh Vyas
 */
public class Answer {


     private String examId;
    private String subject;
    private String chosenAnswer;
    private String correctAnswer;
    private int qno;

    public Answer(String examId, String subject, int qno, String chosenAnswer, String correctAnswer) {
       this.examId=examId;
       this.subject=subject;
       this.qno=qno;
       this.chosenAnswer=chosenAnswer;
       this.correctAnswer=correctAnswer;
       
    }
    
     @Override
    public String toString() {
        return "Answer{" + "examId=" + examId + ", subject=" + subject + ", chosenAnswer=" + chosenAnswer + ", correctAnswer=" + correctAnswer + ", qno=" + qno + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        
        Answer other = (Answer) obj;
        if (this.examId.equals(other.examId)==false) {
            return false;
        }
        if (this.subject.equals(other.subject)==false) {
            return false;
        }
        if (this.qno != other.qno) {
            return false;
        }
        if (this.chosenAnswer.equals(other.chosenAnswer)==false) {
            return false;
        }
        if (this.correctAnswer.equals(other.correctAnswer)==false) {
            return false;
        }
        return true;
    }

    
    
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }
    
   
    
   
    
}
