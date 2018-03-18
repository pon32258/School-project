/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver4Admin;

import Driver4Admin.AdminHome;
import Data.Check;
import Data.Tutor;
import Database.ConnectionBuilder;
import Driver.LoginPage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Witchapon-Pc
 */
public class TutorMenu extends javax.swing.JFrame {

    /**
     * Creates new form TutorMenu
     */
    public TutorMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LastNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UniversityText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TutorBackButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TutorFirstName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TutorLastName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TutorPhone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TutorEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TutorUniversity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        TutorIdText = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        TutorBackButton2 = new javax.swing.JButton();
        TutorPassword = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        AdminId2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        DelPasswordFiled = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        TutorIdDelete = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        TutorBackButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TutorMenu");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("FirstName :");

        FirstNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("LastName :");

        LastNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Phone :");

        PhoneText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("E-mail :");

        EmailText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("University :");

        UniversityText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Password :");

        PasswordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TutorBackButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TutorBackButton1.setText("Back");
        TutorBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorBackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TutorBackButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PasswordText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UniversityText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TutorBackButton1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(UniversityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel13.setText("FirstName :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        TutorFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 280, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setText("LastName :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        TutorLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 280, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Phone :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 20));

        TutorPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 280, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel16.setText("E-mail :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        TutorEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 280, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel17.setText("University :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        TutorUniversity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorUniversity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 280, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel18.setText("Password :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 377, 130, 55));

        Clear.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 369, 130, 55));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel19.setText("Tutor Id :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 20));

        TutorIdText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 280, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        TutorBackButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TutorBackButton2.setText("Back");
        TutorBackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorBackButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(TutorBackButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 0, -1, -1));

        TutorPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(TutorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 280, -1));

        jTabbedPane1.addTab("Edit", jPanel2);

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel20.setText("Admin Id :");

        AdminId2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel21.setText("Admin Password :");

        DelPasswordFiled.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel22.setText("Tutor Id to Delete :");

        TutorIdDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        TutorBackButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TutorBackButton3.setText("Back");
        TutorBackButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorBackButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(TutorBackButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)
                        .addGap(5, 5, 5)
                        .addComponent(AdminId2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelPasswordFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TutorIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TutorBackButton3)
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DelPasswordFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TutorIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Delete", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String value1 = FirstNameText.getText();
        String value2 = LastNameText.getText();
        String value3 = PhoneText.getText();
        String value4 = EmailText.getText();
        String value5 = UniversityText.getText();
        String value6 = PasswordText.getText();
        
        Check.checkTextTutor(value1,value2,value3,value4,value5,value6);
        Check.checkName("Tutor", value1, value2);
        
        if(Check.getX()==1&Check.getY()==1){  
            try{
            Connection conn = ConnectionBuilder.getConnection();
            String sqlcmd ="INSERT INTO Tutor_Data(Tutor_Name ,Tutor_Surname ,"
                    + "Tutor_Phone ,Tutor_Email , Tutor_University, Tutor_Password) "
                    + "values(?,?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sqlcmd);
            pstm.setString(1,value1);
            pstm.setString(2,value2);
            pstm.setString(3,value3);
            pstm.setString(4,value4);
            pstm.setString(5,value5);
            pstm.setString(6,value6);

            if(pstm.executeUpdate()>0){   
                JOptionPane.showMessageDialog(null,"Complete");
                conn.close(); 
            }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Can't Add", "Warning",JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error","Warning",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FirstNameText.setText("");
        LastNameText.setText("");
        PhoneText.setText("");
        EmailText.setText("");
        UniversityText.setText("");
        PasswordText.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int tutor_id = Integer.parseInt(TutorIdText.getText());
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM Tutor_DATA WHERE Tutor_id=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, tutor_id);
            ResultSet rs = pstm.executeQuery();
                                
            if (rs.next()) {
                TutorFirstName.setText(rs.getString("Tutor_name"));
                TutorLastName.setText(rs.getString("Tutor_surname"));
                TutorPhone.setText(rs.getString("Tutor_phone"));
                TutorEmail.setText(rs.getString("Tutor_email"));
                TutorUniversity.setText(rs.getString("Tutor_University"));
                TutorPassword.setText(rs.getString("Tutor_password"));
            }else{
                TutorFirstName.setText("-");
                TutorLastName.setText("-");
                TutorPhone.setText("-");
                TutorEmail.setText("-");
                TutorUniversity.setText("-");
                TutorPassword.setText("-");
                JOptionPane.showMessageDialog(null,"Cannot Found ID", "Warning",JOptionPane.ERROR_MESSAGE);
            }
            conn.close();  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error.", "Warning",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Please enter ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        TutorIdText.setText("");
        TutorFirstName.setText("");
        TutorLastName.setText("");
        TutorPhone.setText("");
        TutorEmail.setText("");
        TutorUniversity.setText("");
        TutorPassword.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String value1 = TutorFirstName.getText();
        String value2 = TutorLastName.getText();
        String value3 = TutorPhone.getText();
        String value4 = TutorEmail.getText();
        String value5 = TutorUniversity.getText();
        String value6 = TutorPassword.getText();

        Check.checkTextTutor(value1, value2, value3, value4, value5 ,value6);
        Check.checkName("Tutor", value1, value2);
        
        if(Check.getX()==1&Check.getY()==1){
            try {
                int tutor_id = Integer.parseInt(TutorIdText.getText());
                Connection conn = ConnectionBuilder.getConnection();
                String sql = "UPDATE Tutor_Data SET tutor_name=?,tutor_surname=?,tutor_phone=?"
                        + ",tutor_email=?,tutor_university=?,tutor_password=? WHERE tutor_id=?";
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1,value1);
                pstm.setString(2,value2);
                pstm.setString(3,value3);
                pstm.setString(4,value4);
                pstm.setString(5,value5);
                pstm.setString(6,value6);
                pstm.setInt(7,tutor_id);
                if (pstm.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null,"Edit Successfull.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Can't Edit", "Warning",JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Please enter ID number.", "Warning",JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TutorBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorBackButton1ActionPerformed
        // TODO add your handling code here:
        AdminHome ma = new AdminHome();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_TutorBackButton1ActionPerformed

    private void TutorBackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorBackButton2ActionPerformed
        // TODO add your handling code here:
        AdminHome ma = new AdminHome();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_TutorBackButton2ActionPerformed

    private void TutorBackButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorBackButton3ActionPerformed
        AdminHome ma = new AdminHome();
        this.setVisible(false);
        ma.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TutorBackButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AdminId2.setText("");
        DelPasswordFiled.setText("");
        TutorIdDelete.setText("");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String value1 = AdminId2.getText();
        String value2 = TutorIdDelete.getText();
        Check.checkDelete(value1,value2);

        if(Check.getX()==1){
            try {
                int id = Integer.parseInt(AdminId2.getText());
                String password = DelPasswordFiled.getText();
                if(id==LoginPage.getUserId()&password.equals(LoginPage.getUserPassword())){
                    int tutorDelete = Integer.parseInt(TutorIdDelete.getText());
                    Connection conn = ConnectionBuilder.getConnection();
                    String sql = "DELETE FROM Tutor_Data WHERE tutor_id=?";
                    PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.setInt(1,tutorDelete);
                    if(pstm.executeUpdate()>0){
                        JOptionPane.showMessageDialog(null,"Delete Complete");
                        conn.close();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"ID or Password not correct", "Warning",JOptionPane.ERROR_MESSAGE);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Can't Delete", "Warning",JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Please Enter character", "Warning",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminId2;
    private javax.swing.JButton Clear;
    private javax.swing.JPasswordField DelPasswordFiled;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton TutorBackButton1;
    private javax.swing.JButton TutorBackButton2;
    private javax.swing.JButton TutorBackButton3;
    private javax.swing.JTextField TutorEmail;
    private javax.swing.JTextField TutorFirstName;
    private javax.swing.JTextField TutorIdDelete;
    private javax.swing.JTextField TutorIdText;
    private javax.swing.JTextField TutorLastName;
    private javax.swing.JTextField TutorPassword;
    private javax.swing.JTextField TutorPhone;
    private javax.swing.JTextField TutorUniversity;
    private javax.swing.JTextField UniversityText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}