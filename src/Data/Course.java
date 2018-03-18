/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
/**
 *
 * @author First
 */
import Database.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.text.DateFormat;
import javax.swing.JOptionPane;
public class Course{
    private int courseId;
    private String courseName;
    private String topic;
    
    public Course(){
        this.courseName = "-";
        this.topic = "-";
    }
    public Course(int courseId, String courseName, String topic) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.topic = topic;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

   
    
    /*public static Course getCourse(int course_id) throws SQLException {
        Course course = null;
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT * FROM Course WHERE Course_id=?";    
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, course_id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            course = new Course();
            orm(rs, course);
        }else{
            course = new Course();
            JOptionPane.showMessageDialog(null,"Cannot Found ID", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        conn.close(); 
        return course;
    }

    public static void orm(ResultSet rs, Course course) throws SQLException {    
        course.setCourseId(rs.getInt("course_id"));
        course.setCourseName(rs.getString("course_name"));
        course.setTopic(rs.getString("course_topic"));
    }*/
    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", topic=" + topic + '}';
    }
    
}

    