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
public class Admin extends Person{
    private int adminId;
    private String adminPassword;

    public Admin(){
        super("-","-","-","-");
        this.adminPassword = "-";
    }
    
    public Admin(int adminId,String name, String surname, String phone, String mail,String adminPassword) {
        super(name, surname, phone, mail);
        this.adminId = adminId;
        this.adminPassword = adminPassword;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
  
    /*public static Admin getAdmin(int admin_id) throws SQLException {
        Admin admin = null;
        Connection conn = ConnectionBuilder.getConnection();
        String sql = "SELECT * FROM ADMIN_DATA WHERE ADMIN_id=?";    
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, admin_id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            admin = new Admin();
            orm(rs, admin);
        }else{
            admin = new Admin();
            JOptionPane.showMessageDialog(null,"Cannot Found ID", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        conn.close(); 
        return admin;
    }

    public static void orm(ResultSet rs, Admin admin) throws SQLException {    
        admin.setAdminId(rs.getInt("admin_id"));
        admin.setName(rs.getString("admin_name"));
        admin.setSurname(rs.getString("admin_surname"));
        admin.setPhone(rs.getString("admin_phone"));
        admin.setMail(rs.getString("admin_email"));
        admin.setAdminPassword(rs.getString("admin_password"));
    }*/

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminPassword=" + adminPassword ;
    }
   

    
}