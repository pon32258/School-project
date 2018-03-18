/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Database.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author First
 */
public class Student extends Person{
    private int stdId;
    
    public Student(){
        super("-","-","-","-");
    }

    public Student(int stdId,String name, String surname, String phone, 
            String mail) {
        super(name, surname, phone, mail);
        this.stdId = stdId;
    }

    public int getStudentId() {
        return stdId;
    }

    public void setStudentId(int stdId) {
        this.stdId = stdId;
    }

    
    /*public static Student getStudent(int student_id) throws SQLException {
        Student student = null;
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT * FROM Student_DATA WHERE Student_id=?";    
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, student_id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            student = new Student();
            orm(rs, student);
        }else{
            student = new Student();
            JOptionPane.showMessageDialog(null,"Cannot Found ID", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        conn.close(); 
        return student;
    }

    public static void orm(ResultSet rs, Student student) throws SQLException {    
        Student.setStudentId(rs.getInt("student_id"));
        Student.setName(rs.getString("student_name"));
        Student.setSurname(rs.getString("student_surname"));
        Student.setPhone(rs.getString("student_phone"));
        Student.setMail(rs.getString("student_email"));
    }*/

    @Override
    public String toString() {
        return "stdId=" + stdId +super.toString();
    }
    
    
    
}
    