/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Database.ConnectionBuilder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author First
 */
public class Check {
    private static int x = 1;
    private static int y = 1;

    public static int getX() {
        return x;
    }
    
    public static int getY() {
        return y;
    }
    /*
    เป็นMethodช่วยเหลือของGuiในClass Adminที่ใช้Method .matches()ในการตรวจสอบClass AdminMenuที่เป็นGui ว่าช่องที่กรอกเป็นไปตามที่matchกันไหมเช่น
    Firstname ให้กรอกแกเป็นตัวอักษรภาษาอังกฤษA-Zเเละa-z 
    LastName  ให้กรอกเหมือนFirstName
    Phone     ให้กรอกเป็นตัวเลขเเละให้มีความยาวไม่ตํ่ากว่า8
    Email     ให้เช็คตาม^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$ ทั้งหมดเเละไปสนใจตัวอักษรใหญ่เล็ก
    Password  ให้เช็ตว่าpasswordห้ามมีความยาวตํ่ากว่า4ตัวอักษร
    *****************ถ้าAddสําเร็จมันจะreturnค่าxให้เท่ากับ1*****************
    */
    public static int checkTextAdmin(String value1,String value2,String value3,String value4,String value5){
        
        if(value1.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters FirstName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters LastName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if((value3.matches("[0-9]+")&value3.length()>8)==false){
                JOptionPane.showMessageDialog(null,"Please enter phone number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);    
        Matcher m = p.matcher(value4);
        if (m.find()==false){
                JOptionPane.showMessageDialog(null,"Please enter e-mail", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }

        if(value5.length()<4){
                JOptionPane.showMessageDialog(null,"Password must not less than 4 characters", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        return x = 1;
    }
    /*
    เป็นMethodช่วยเหลือของGuiในClass Tutorที่ใช้Method .matches()ในการตรวจสอบClass TutorMenuที่เป็นGui ว่าช่องที่กรอกเป็นไปตามที่matchกันไหมเช่น
    Firstname  ให้กรอกแกเป็นตัวอักษรภาษาอังกฤษA-Zเเละa-z 
    LastName   ให้กรอกเหมือนFirstName
    Phone      ให้กรอกเป็นตัวเลขเเละให้มีความยาวไม่ตํ่ากว่า8
    Email      ให้เช็คตาม^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$ ทั้งหมดเเละไปสนใจตัวอักษรใหญ่เล็ก
    University ให้เช็คว่าUniversityที่กรอกต้องมีค่าตามที่matchกันหรือไม่[A-Za-z'] 
    Password   ให้เช็ตว่าpasswordห้ามมีความยาวตํ่ากว่า4ตัวอักษร
    *****************ถ้าAddสําเร็จมันจะreturnค่าxให้เท่ากับ1*****************
    */
    public static int checkTextTutor(String value1,String value2,String value3,String value4,String value5,String value6){
        
        if(value1.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters FirstName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters LastName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if((value3.matches("[0-9]+")&value3.length()>8)==false){
                JOptionPane.showMessageDialog(null,"Please enter phone number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);    
        Matcher m = p.matcher(value4);
        if (m.find()==false){
                JOptionPane.showMessageDialog(null,"Please enter e-mail", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value5.matches("[A-Za-z' ]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter name of University.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value6.length()<4){
                JOptionPane.showMessageDialog(null,"Password must not less than 4 characters", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        return x = 1;
    }
    /*
    เป็นMethodช่วยเหลือของGuiในClass Studentที่ใช้Method .matches()ในการตรวจสอบClass StudentMenuที่เป็นGui ว่าช่องที่กรอกเป็นไปตามที่matchกันไหมเช่น
    Firstname ให้กรอกแกเป็นตัวอักษรภาษาอังกฤษA-Zเเละa-z 
    LastName  ให้กรอกเหมือนFirstName
    Phone     ให้กรอกเป็นตัวเลขเเละให้มีความยาวไม่ตํ่ากว่า8
    Email     ให้เช็คตาม^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$ ทั้งหมดเเละไปสนใจตัวอักษรใหญ่เล็ก
    Password  ให้เช็ตว่าpasswordห้ามมีความยาวตํ่ากว่า4ตัวอักษร
    *****************ถ้าAddสําเร็จมันจะreturnค่าxให้เท่ากับ1*****************
    */
    public static int checkTextStudent(String value1,String value2,String value3,String value4){
        
        if(value1.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters FirstName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter characters LastName.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if((value3.matches("[0-9]+")&value3.length()>8)==false){
                JOptionPane.showMessageDialog(null,"Please enter phone number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);    
        Matcher m = p.matcher(value4);
        if (m.find()==false){
                JOptionPane.showMessageDialog(null,"Please enter e-mail", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }

        return x = 1;
    }
    /*
    เป็นMethodช่วยเหลือของGuiในClass Registerที่ใช้Method .matches()ในการตรวจสอบClass RegisterMenuที่เป็นGui ว่าช่องที่กรอกเป็นไปตามที่matchกันไหมเช่น
    
    *****************ถ้าAddสําเร็จมันจะreturnค่าxให้เท่ากับ1*****************
    
    */
    public static int rgCourse(String value1,String value2,String value3,String value4,String value5,String value6,String value7){
        if(value1.matches("[0-9]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter Tutor ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[0-9A-Za-z]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter Course ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        String[] time = value4.split("/");
        int date = Integer.parseInt(time[0]);
        int month = Integer.parseInt(time[1]);
        int year = Integer.parseInt(time[2]);
        if((value3.matches("[0-9]{2,2}+/+[0-9]{2,2}+/+[0-9]{4,4}")&date<32&month<13&year>2000&year<3000)==false){
                JOptionPane.showMessageDialog(null,"Please enter format dd/mm/yyyy ex.01/01/2016", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        String[] time2 = value4.split("/");
        int date2 = Integer.parseInt(time2[0]);
        int month2 = Integer.parseInt(time2[1]);
        int year2 = Integer.parseInt(time2[2]);
        if((value4.matches("[0-9]{2,2}+/+[0-9]{2,2}+/+[0-9]{4,4}")&date2<32&month2<13&year2>2000&year2<3000)==false){
                JOptionPane.showMessageDialog(null,"Please enter format dd/mm/yyyy ex.01/01/2016", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value5.matches("[0-9]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter number of Student max.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value6.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter Course Time.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value7.matches("[0-9]+.[0-9]{2,2}")==false){
                JOptionPane.showMessageDialog(null,"Please enter Price.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }

        return x = 1;
    }
    
    public static int checkCourse(String value1){
        if(value1.matches("[A-Za-z]{3,3}+[0-9]{3,3}")==false){
                JOptionPane.showMessageDialog(null,"Please enter Course ID(ex. ENG101).", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        
        return x = 1;
    }
    
    public static int checkDelete(String value1,String value2){
        if(value1.matches("[0-9]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[0-9]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        
        return x = 1;
    }
    public static int checkCourseDelete(String value1,String value2){
        if(value1.matches("[0-9]+")==false){
                JOptionPane.showMessageDialog(null,"Please enter AdminID number.", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        if(value2.matches("[A-Za-z]{3,3}+[0-9]{3,3}")==false){
                JOptionPane.showMessageDialog(null,"Please enter Course ID(ex. ENG101).", "Warning",JOptionPane.ERROR_MESSAGE);
                return x=0;
        }
        
        return x = 1;
    }
    
    public static int checkName(String type,String name,String surname){
        try{
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT "+type+"_name ,"+type+"_surname FROM "+type+"_Data";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            if(name.equals(rs.getString(type+"_Name"))){
                if(surname.equals(rs.getString(type+"_Surname"))){
                    JOptionPane.showMessageDialog(null,"You name and surname it's has been used.", "Warning",JOptionPane.ERROR_MESSAGE);
                    return y=0;
                }
            }
        }
        conn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error.", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return y = 1;
    }
    
    public static int checkRgdetail(int stdId,int rgId){
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sql2 = "Select Student_id FROM Registerdetail WHERE Register_Id ="+rgId;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            while(rs.next()){
                if(stdId==rs.getInt("Student_id")){
                    JOptionPane.showMessageDialog(null,"This student already register this course.", "Warning",JOptionPane.ERROR_MESSAGE);
                    return y=0;
                } 
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Check.class.getName()).log(Level.SEVERE, null, ex);
        }
        return y=1;
    }
    
    public static int checkCoupon(String code){
        try{
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT Promotion_code FROM Promotion";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            if(code.equals(rs.getString("Promotion_code"))){
                return y = 0;
            }
        }
        conn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error.", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return y = 1;
    }
    
    public static int checkRgCourseId(String courseId){
        try{
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT Course_Id FROM Register WHERE Course_Open = true";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            if(courseId.equals(rs.getString("Course_Id"))){
                JOptionPane.showMessageDialog(null,courseId+" is already register", "Warning",JOptionPane.ERROR_MESSAGE);
                return y = 0;
            }
        }
        conn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error.", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return y = 1;
    }
}
