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
public class Tutor extends Person{
    private int tutorId;
    private String tutorPassword;
    private String university;

    public Tutor(){
        super("-","-","-","-");
        this.tutorPassword = "-";
        this.university = "-";
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    
    
    public Tutor(int tutorId, String name, String surname, String phone, String mail,String tutorPassword, String university) {
        super(name, surname, phone, mail);
        this.tutorId = tutorId;
        this.tutorPassword = tutorPassword;
        this.university = university;
    }

    public String getTutorPassword() {
        return tutorPassword;
    }

    public void setTutorPassword(String tutorPassword1) {
        tutorPassword = tutorPassword1;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university1) {
        university = university1;
    }
    
    /*public static Tutor getTutor(int tutor_id) throws SQLException {
        Tutor tutor = null;
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT * FROM Tutor_Data WHERE Tutor_id=?";    
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, tutor_id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            tutor = new Tutor();
            orm(rs, tutor);
        }else{
            tutor = new Tutor();
            JOptionPane.showMessageDialog(null,"Cannot Found ID", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        conn.close(); 
        return tutor;
    }

    public static void orm(ResultSet rs, Tutor tutor) throws SQLException {    
        tutor.setTutorId(rs.getInt("tutor_id"));
        tutor.setName(rs.getString("tutor_name"));
        tutor.setSurname(rs.getString("tutor_surname"));
        tutor.setPhone(rs.getString("tutor_phone"));
        tutor.setMail(rs.getString("tutor_email"));
        tutor.setUniversity(rs.getString("tutor_university"));
        tutor.setTutorPassword(rs.getString("tutor_password"));
    }*/
    
    @Override
    public String toString() {
        return "Tutor{" + ", tutorPassword=" + tutorPassword + ", university=" + university + '}';
    }
    
}

   

   