/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver4Admin;

import Data.Student;
import Database.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author First
 */
public class ViewCourse extends javax.swing.JFrame {
    private String course;
    private String word;
    
    
    public ViewCourse() {
        initComponents();        
        ReadCourseID();
        jTable1.setEnabled(false);
        jTable2.setEnabled(false);
        jTable3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        StudentList = new javax.swing.JCheckBox();
        CourseInfo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TextSearch1 = new javax.swing.JTextField();
        SearchBt1 = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        CourseStatus = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        StudentList2 = new javax.swing.JCheckBox();
        CourseInfo2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TextSearch2 = new javax.swing.JTextField();
        SearchBt2 = new javax.swing.JButton();
        Back2 = new javax.swing.JButton();
        CourseStatus2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        StudentList3 = new javax.swing.JCheckBox();
        CourseInfo3 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        TextSearch3 = new javax.swing.JTextField();
        SearchBt3 = new javax.swing.JButton();
        Back3 = new javax.swing.JButton();
        CourseStatus3 = new javax.swing.JRadioButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ViewCourse");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        StudentList.setText("Student List");
        StudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentListActionPerformed(evt);
            }
        });

        CourseInfo.setText("Course Info");
        CourseInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseInfoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        SearchBt1.setText("Search");
        SearchBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBt1ActionPerformed(evt);
            }
        });

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        CourseStatus.setText("Show courses Closed");
        CourseStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(StudentList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBt1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 864, Short.MAX_VALUE)
                        .addComponent(Back1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentList)
                    .addComponent(CourseInfo)
                    .addComponent(TextSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBt1)
                    .addComponent(CourseStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("English", jPanel1);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "201", "202", "203", "204" }));

        StudentList2.setText("Student List");
        StudentList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentList2ActionPerformed(evt);
            }
        });

        CourseInfo2.setText("Course Info");
        CourseInfo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseInfo2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        SearchBt2.setText("Search");
        SearchBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBt2ActionPerformed(evt);
            }
        });

        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        CourseStatus2.setText("Show courses Closed");
        CourseStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseStatus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(StudentList2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseInfo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseStatus2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                                .addComponent(TextSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBt2))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentList2)
                    .addComponent(CourseInfo2)
                    .addComponent(TextSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBt2)
                    .addComponent(CourseStatus2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Math", jPanel4);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "301", "302", "303", "304", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        StudentList3.setText("Student List");
        StudentList3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentList3ActionPerformed(evt);
            }
        });

        CourseInfo3.setText("Course Info");
        CourseInfo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseInfo3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        SearchBt3.setText("Search");
        SearchBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBt3ActionPerformed(evt);
            }
        });

        Back3.setText("Back");
        Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back3ActionPerformed(evt);
            }
        });

        CourseStatus3.setText("Show courses Closed");
        CourseStatus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseStatus3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(StudentList3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseInfo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseStatus3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(TextSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBt3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentList3)
                    .addComponent(CourseInfo3)
                    .addComponent(TextSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBt3)
                    .addComponent(CourseStatus3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Science", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentListActionPerformed
        if(StudentList.isSelected()){
            CourseInfo.setSelected(false);
            StudentList2.setSelected(false);
            CourseInfo2.setSelected(false);
            StudentList3.setSelected(false);
            CourseInfo3.setSelected(false);
        }
    }//GEN-LAST:event_StudentListActionPerformed

    private void CourseInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseInfoActionPerformed
        if(CourseInfo.isSelected()){
            StudentList.setSelected(false);
            CourseInfo2.setSelected(false);
            StudentList2.setSelected(false); 
            CourseInfo3.setSelected(false);
            StudentList3.setSelected(false);
        }
    }//GEN-LAST:event_CourseInfoActionPerformed

    private void SearchBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBt1ActionPerformed
        course = (String)jComboBox1.getSelectedItem();
        word = TextSearch1.getText();
        viewInfo();
    }//GEN-LAST:event_SearchBt1ActionPerformed

    private void SearchBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBt3ActionPerformed
        course = (String)jComboBox3.getSelectedItem();
        word = TextSearch3.getText();
        viewInfo();
    }//GEN-LAST:event_SearchBt3ActionPerformed

    private void SearchBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBt2ActionPerformed
        course = (String)jComboBox2.getSelectedItem();
        word = TextSearch2.getText();
        viewInfo();
    }//GEN-LAST:event_SearchBt2ActionPerformed

    private void StudentList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentList2ActionPerformed
        if(StudentList2.isSelected()){
            CourseInfo.setSelected(false);
            StudentList.setSelected(false);
            CourseInfo2.setSelected(false);
            CourseInfo3.setSelected(false);
            StudentList3.setSelected(false);
        }
    }//GEN-LAST:event_StudentList2ActionPerformed

    private void CourseInfo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseInfo2ActionPerformed
        if(CourseInfo2.isSelected()){
            StudentList.setSelected(false);
            CourseInfo.setSelected(false);
            StudentList2.setSelected(false);
            CourseInfo3.setSelected(false);
            StudentList3.setSelected(false);
        }
    }//GEN-LAST:event_CourseInfo2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void StudentList3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentList3ActionPerformed
       if(StudentList3.isSelected()){
            CourseInfo.setSelected(false);
            StudentList.setSelected(false);
            CourseInfo2.setSelected(false);
            StudentList2.setSelected(false);
            CourseInfo3.setSelected(false);
        }
    }//GEN-LAST:event_StudentList3ActionPerformed

    private void CourseInfo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseInfo3ActionPerformed
        if(CourseInfo3.isSelected()){
            StudentList.setSelected(false);
            CourseInfo.setSelected(false);
            StudentList2.setSelected(false);
            CourseInfo2.setSelected(false);
            StudentList3.setSelected(false);
        }
    }//GEN-LAST:event_CourseInfo3ActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back1ActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back2ActionPerformed

    private void Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back3ActionPerformed
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back3ActionPerformed

    private void CourseStatus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseStatus3ActionPerformed
        if(CourseStatus3.isSelected()){
            CourseStatus.setSelected(false);
            CourseStatus2.setSelected(false);
        }
    }//GEN-LAST:event_CourseStatus3ActionPerformed

    private void CourseStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseStatus2ActionPerformed
        if(CourseStatus2.isSelected()){
            CourseStatus.setSelected(false);
            CourseStatus3.setSelected(false);
        }
    }//GEN-LAST:event_CourseStatus2ActionPerformed

    private void CourseStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseStatusActionPerformed
        if(CourseStatus.isSelected()){
            CourseStatus2.setSelected(false);
            CourseStatus3.setSelected(false);
        }
    }//GEN-LAST:event_CourseStatusActionPerformed
    
    public ResultSet listStudent(String word,String course){
        ResultSet rs=null;
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Statement st = conn.createStatement();
            String searchQuery;
            if(word.equals("")){
                searchQuery  ="SELECT c.Course_ID ,s.Student_ID, s.Student_Name, "+
                            "s.Student_Surname, s.Student_Phone, s.Student_Email " +
                            "FROM Student_Data s " +
                            "INNER JOIN Registerdetail rd " +
                            "ON s.Student_ID=rd.Student_ID " +
                            "INNER JOIN Register r " +
                            "ON rd.Register_ID=r.Register_ID " +
                            "INNER JOIN Course c " +
                            "ON r.Course_ID=c.Course_ID " +
                            "WHERE c.Course_ID LIKE '"+course+"'";

            }else if(word.matches("[0-9]+")){
                searchQuery  ="SELECT c.Course_ID ,s.Student_ID, s.Student_Name, " +
                            "s.Student_Surname, s.Student_Phone, s.Student_Email " +
                            "FROM Student_Data s " +
                            "INNER JOIN Registerdetail rd " +
                            "ON s.Student_ID=rd.Student_ID " +
                            "INNER JOIN Register r " +
                            "ON rd.Register_ID=r.Register_ID " +
                            "INNER JOIN Course c " +
                            "ON r.Course_ID=c.Course_ID " +
                            "WHERE c.Course_ID LIKE '"+course+"' AND " +
                            "(s.Student_id = "+word+" OR " +
                            "Student_Phone LIKE '%"+word+"%')";
                        
            }else {
                searchQuery ="SELECT c.Course_ID ,s.Student_ID, s.Student_Name, "+
                            "s.Student_Surname, s.Student_Phone, s.Student_Email " +
                            "FROM Student_Data s " +
                            "INNER JOIN Registerdetail rd " +
                            "ON s.Student_ID=rd.Student_ID " +
                            "INNER JOIN Register r " +
                            "ON rd.Register_ID=r.Register_ID " +
                            "INNER JOIN Course c " +
                            "ON r.Course_ID=c.Course_ID " +
                            "WHERE c.Course_ID LIKE '"+course+"' AND " +
                            "(Student_Name LIKE '%"+word+"%' OR " +
                            "Student_Surname LIKE '%"+word+"%' OR " +
                            "Student_Email LIKE '%"+word+"%')";
            }
            
            rs  = st.executeQuery(searchQuery);
                       
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Database Error", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
    public ResultSet listCourse(String word,String course,String status){
        ResultSet rs=null;
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Statement st = conn.createStatement();
            String searchQuery="";
            if(word.equals("")){
                searchQuery  ="SELECT r.Register_Id ,c.Course_Id ,c.Course_Name ,c.Course_Topic ,r.Tutor_Id ," 
                        + "r.Date_Start ,r.Date_End ,r.Student_Max ,r.Course_Price , r.Student_Count ," 
                        + "r.Course_Time ,r.Course_Open " 
                        + "FROM REGISTER r " 
                        + "INNER JOIN Course c " 
                        + "ON r.Course_Id = c.Course_Id " 
                        + "WHERE r.course_id LIKE '"+course+"' AND " 
                        + "(r.Course_open = true OR " 
                        + "r.Course_open ="+status+")";
            }else{
                searchQuery  ="SELECT r.Register_Id ,c.Course_Id ,c.Course_Name ,c.Course_Topic ,r.Tutor_Id ," 
                        + "r.Date_Start ,r.Date_End ,r.Student_Max ,r.Course_Price , r.Student_Count ," 
                        + "r.Course_Time ,r.Course_Open " 
                        + "FROM REGISTER r " 
                        + "INNER JOIN Course c " 
                        + "ON r.Course_Id = c.Course_Id " 
                        + "WHERE r.course_id LIKE '"+course+"' AND "
                        + "c.Course_Name LIKE '%"+word+"%' AND " 
                        + "(r.Course_open = true OR " 
                        + "r.Course_open ="+status+")";
            }           
           
            rs  = st.executeQuery(searchQuery);
                       
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Database Error", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public void viewInfo(){          
        String status = "true";
        if(CourseStatus.isSelected()|CourseStatus2.isSelected()|CourseStatus3.isSelected()){
            status = "false";
        }
        
        if(StudentList.isSelected()|StudentList2.isSelected()|StudentList3.isSelected()){
            try {
                ResultSet rs = listStudent(word,course);
                DefaultTableModel model =new DefaultTableModel();
                model.setColumnIdentifiers(new Object[] {"Id","Name","Surname",
                    "Phone","E-mail"});
                Object[] row = new Object[5];
                
                while(rs.next()){
                    row[0] = rs.getInt("Student_Id");
                    row[1] = rs.getString("Student_name");
                    row[2] = rs.getString("Student_Surname");
                    row[3] = rs.getString("Student_Phone");
                    row[4] = rs.getString("Student_Email");
                    model.addRow(row);
                }
                if(StudentList.isSelected()){
                    jTable1.setModel(model);
                } else if(StudentList2.isSelected()){
                    jTable2.setModel(model);
                } else if(StudentList3.isSelected()){
                    jTable3.setModel(model);
                }                                             
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Table Error", "Warning",JOptionPane.ERROR_MESSAGE);
            }
        }else if(CourseInfo.isSelected()|CourseInfo2.isSelected()|CourseInfo3.isSelected()){
            try {
                ResultSet rs = listCourse(word,course,status);
                DefaultTableModel model =new DefaultTableModel();
                model.setColumnIdentifiers(new Object[] {"Register_Id","Course_ID","Course_Name",
                    "Course_Topic","Tutor_ID","Date_Start","Date_End","Student_Max","Course_Price",
                    "Student_Count","Course_Time","Course_Open"});
                Object[] row = new Object[12];
                
                while(rs.next()){
                    row[0] = rs.getInt("Register_Id");
                    row[1] = rs.getString("Course_ID");
                    row[2] = rs.getString("Course_name");
                    row[3] = rs.getString("Course_topic");
                    row[4] = rs.getInt("Tutor_ID");
                    row[5] = rs.getString("Date_Start");
                    row[6] = rs.getString("Date_End");
                    row[7] = rs.getInt("Student_max");
                    row[8] = rs.getDouble("course_price");
                    row[9] = rs.getInt("Student_count");
                    row[10] = rs.getString("course_time");
                    row[11] = rs.getString("course_open");
                   
                    model.addRow(row);
                }
                if(CourseInfo.isSelected()){
                    jTable1.setModel(model);
                } else if(CourseInfo2.isSelected()){
                    jTable2.setModel(model);
                } else if(CourseInfo3.isSelected()){
                    jTable3.setModel(model);
                }                                             
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Table Error", "Warning",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void ReadCourseID(){
        try{
            Connection conn = ConnectionBuilder.getConnection();
            String sql ="SELECT Course_ID FROM Course WHERE Course_ID LIKE 'ENG%'";
            Statement st =conn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            jComboBox1.removeAllItems();
            jComboBox1.addItem("--Select Course--");
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString("Course_ID"));
            }
            
            String sql2 ="SELECT Course_ID FROM Course WHERE Course_ID LIKE 'MTH%'";
            Statement st2 =conn.createStatement();
            ResultSet rs2 =st2.executeQuery(sql2);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("--Select Course--");
            
            while(rs2.next()){
                jComboBox2.addItem(rs2.getString("Course_ID"));
            }
            
            String sql3 ="SELECT Course_ID FROM Course WHERE Course_ID LIKE 'SCI%'";
            Statement st3 =conn.createStatement();
            ResultSet rs3 =st3.executeQuery(sql3);
            jComboBox3.removeAllItems();
            jComboBox3.addItem("--Select Course--");
            
            while(rs3.next()){
                jComboBox3.addItem(rs3.getString("Course_ID"));
            }
    
            conn.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Error Conn Course Table.", "Warning",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Back2;
    private javax.swing.JButton Back3;
    private javax.swing.JCheckBox CourseInfo;
    private javax.swing.JCheckBox CourseInfo2;
    private javax.swing.JCheckBox CourseInfo3;
    private javax.swing.JRadioButton CourseStatus;
    private javax.swing.JRadioButton CourseStatus2;
    private javax.swing.JRadioButton CourseStatus3;
    private javax.swing.JButton SearchBt1;
    private javax.swing.JButton SearchBt2;
    private javax.swing.JButton SearchBt3;
    private javax.swing.JCheckBox StudentList;
    private javax.swing.JCheckBox StudentList2;
    private javax.swing.JCheckBox StudentList3;
    private javax.swing.JTextField TextSearch1;
    private javax.swing.JTextField TextSearch2;
    private javax.swing.JTextField TextSearch3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
