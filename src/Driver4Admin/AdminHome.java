/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver4Admin;


import Database.ConnectionBuilder;
import Driver.LoginPage;
import Driver4Admin.AdminMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Witchapon Kaptop
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuAdmin
     */
    public AdminHome() {
        initComponents();
        welcomeLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminButton = new javax.swing.JButton();
        StudentButton = new javax.swing.JButton();
        CourseButton = new javax.swing.JButton();
        TutorButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        ViewUserButton = new javax.swing.JButton();
        ViewCourseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Promotion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminHome\n");
        setBackground(new java.awt.Color(255, 51, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        AdminButton.setText("Admin");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 145, 87));

        StudentButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        StudentButton.setText("Student");
        StudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 145, 87));

        CourseButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        CourseButton.setText("Course");
        CourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 145, 87));

        TutorButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        TutorButton.setText("Tutor");
        TutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TutorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 145, 87));

        RegisterButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 145, 90));

        ViewUserButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        ViewUserButton.setText("View Users");
        ViewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 145, 90));

        ViewCourseButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        ViewCourseButton.setText("View Courses");
        ViewCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCourseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 145, 90));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        Promotion.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        Promotion.setText("Promotion");
        Promotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromotionActionPerformed(evt);
            }
        });
        getContentPane().add(Promotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 145, 90));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    เข้าFunction Admin
    */
    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        AdminMenu am = new AdminMenu();
        am.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminButtonActionPerformed
    /*
    เข้าFunction Course
    */
    private void CourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseButtonActionPerformed
        CourseMenu cm = new CourseMenu();
        cm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CourseButtonActionPerformed
     /*
     เข้าFunction Tutor
    */
    private void TutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorButtonActionPerformed
        TutorMenu tm = new TutorMenu();
        tm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TutorButtonActionPerformed
    /*
    เข้าFunction Student
    */
    private void StudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButtonActionPerformed
        StudentMenu sm = new StudentMenu();
        sm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StudentButtonActionPerformed
    /*
    เข้าFunction Register
    */
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        Register rg = new Register();
        rg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterButtonActionPerformed
    /*
    เข้าFunction ViewUser
    */
    private void ViewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewUserButtonActionPerformed
        // TODO add your handling code here:
        ViewUser vw =new ViewUser();
        vw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewUserButtonActionPerformed
    /*
     เข้าFunction ViewCourse
    */
    private void ViewCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCourseButtonActionPerformed
        ViewCourse vc = new ViewCourse();
        vc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewCourseButtonActionPerformed

    private void PromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromotionActionPerformed
        Promotion pm = new Promotion();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PromotionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void welcomeLabel(){
        try {
            int admin_id = LoginPage.getUserId();
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "SELECT Admin_Name FROM Admin_DATA WHERE Admin_id=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, admin_id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
            jLabel1.setText("Welcome "+rs.getString("Admin_Name")+" (Admin)");
            }
            conn.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton CourseButton;
    private javax.swing.JButton Promotion;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton StudentButton;
    private javax.swing.JButton TutorButton;
    private javax.swing.JButton ViewCourseButton;
    private javax.swing.JButton ViewUserButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
