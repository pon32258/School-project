/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver4Tutor;

import Driver4Admin.*;
import Data.Admin;
import Data.Student;
import Data.Tutor;
import Database.ConnectionBuilder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Witchapon Kaptop
 */
public class ViewUser2 extends javax.swing.JFrame {

    /**
     * Creates new form ViewUser
     */
    public ViewUser2() {
        initComponents();
        findUsers();
    }
    
    public ArrayList<Admin> ListAdmin(String word){
        ArrayList<Admin> usersList = new ArrayList<Admin>();
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Statement st = conn.createStatement();
            String searchQuery;
            if(word.equals("")){
                searchQuery  ="SELECT * FROM Admin_DATA ";
            }else if(word.matches("[0-9]+")){
                searchQuery  ="SELECT * FROM Admin_DATA WHERE Admin_ID = "+word+" OR " +
                            "Admin_Phone LIKE '%"+word+"%'";
            }else {
                searchQuery  ="SELECT * FROM Admin_DATA WHERE Admin_Name Like '%"+word+"%' OR " +
                            "Admin_Surname LIKE '%"+word+"%' OR Admin_Email Like '%"+word+"%'";
            }
            ResultSet rs  = st.executeQuery(searchQuery);
            
            Admin admin;
            while(rs.next()){
                admin = new Admin(
                    rs.getInt("Admin_Id"),
                    rs.getString("Admin_name"),
                    rs.getString("Admin_Surname"),
                    rs.getString("Admin_Phone"),
                    rs.getString("Admin_Email"),
                    rs.getString("Admin_Password")
                 );
             usersList.add(admin);
             admin = new Admin();
             }           
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return usersList;
    }
    
    public ArrayList<Tutor> ListTutor(String word){
        ArrayList<Tutor> usersList = new ArrayList<Tutor>();
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Statement st = conn.createStatement();
            String searchQuery;
            if(word.equals("")){
                searchQuery  ="SELECT * FROM Tutor_DATA ";
            }else if(word.matches("[0-9]+")){
                searchQuery  ="SELECT * FROM Tutor_DATA WHERE Tutor_ID = "+word+" OR " +
                            "Tutor_Phone LIKE '%"+word+"%'";
            }else {
                searchQuery  ="SELECT * FROM Tutor_DATA WHERE Tutor_Name Like '%"+word+"%' OR " +
                            "Tutor_Surname LIKE '%"+word+"%' OR Tutor_Email Like '%"+word+"%'" +
                            "OR Tutor_University LIKE '%"+word+"%'";
            }
              ResultSet rs  = st.executeQuery(searchQuery);
            
            Tutor tutor;
            while(rs.next()){
                tutor = new Tutor(
                    rs.getInt("Tutor_Id"),
                    rs.getString("Tutor_name"),
                    rs.getString("Tutor_Surname"),
                    rs.getString("Tutor_Phone"),
                    rs.getString("Tutor_Email"),
                    rs.getString("Tutor_Password"),
                    rs.getString("Tutor_University")
                 );
             usersList.add(tutor);
             tutor = new Tutor();
             }           
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return usersList;
    }
    
    public ArrayList<Student> ListStudent(String word){
        ArrayList<Student> usersList = new ArrayList<Student>();
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Statement st = conn.createStatement();
            String searchQuery;
            if(word.equals("")){
                searchQuery  ="SELECT * FROM Student_DATA ";
            }else if(word.matches("[0-9]+")){
                searchQuery  ="SELECT * FROM Student_DATA WHERE Student_ID = "+word+" OR " +
                            "Student_Phone LIKE '%"+word+"%'";
            }else {
                searchQuery  ="SELECT * FROM Student_DATA WHERE Student_Name Like '%"+word+"%' OR " +
                            "Student_Surname LIKE '%"+word+"%' OR Student_Email Like '%"+word+"%'";
            }
            ResultSet rs  = st.executeQuery(searchQuery);
            
            Student student;
            while(rs.next()){
                student = new Student(
                    rs.getInt("Student_Id"),
                    rs.getString("Student_name"),
                    rs.getString("Student_Surname"),
                    rs.getString("Student_Phone"),
                    rs.getString("Student_Email")
                 );
            usersList.add(student);
            student = new Student();
            }           
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        return usersList;
    }
    
    public void findUsers(){
        String person = (String)jComboBox1.getSelectedItem();
        if(person.equals("Admin")){
            ArrayList<Admin> users = ListAdmin(jTextSearch.getText());
            DefaultTableModel model =new DefaultTableModel();
            model.setColumnIdentifiers(new Object[] {"Id","Name","Surname",
                                       "Phone","E-mail"});
            Object[] row = new Object[5];

            for(int i = 0; i<users.size();i++){
                row[0] = users.get(i).getAdminId();
                row[1] = users.get(i).getName();
                row[2] = users.get(i).getSurname();
                row[3] = users.get(i).getPhone();
                row[4] = users.get(i).getMail();
                model.addRow(row);
            }
            jTableView.setModel(model);
        }else if(person.equals("Tutor")){
            ArrayList<Tutor> users = ListTutor(jTextSearch.getText());
            DefaultTableModel model =new DefaultTableModel();
            model.setColumnIdentifiers(new Object[] {"Id","Name","Surname",
                                       "Phone","E-mail","University"});
            Object[] row = new Object[6];

            for(int i = 0; i<users.size();i++){
                row[0] = users.get(i).getTutorId();
                row[1] = users.get(i).getName();
                row[2] = users.get(i).getSurname();
                row[3] = users.get(i).getPhone();
                row[4] = users.get(i).getMail();
                row[5] = users.get(i).getUniversity();
                model.addRow(row);
            }
            jTableView.setModel(model);
        }else if(person.equals("Student")){
            ArrayList<Student> users = ListStudent(jTextSearch.getText());
            DefaultTableModel model =new DefaultTableModel();
            model.setColumnIdentifiers(new Object[] {"Id","Name","Surname",
                                       "Phone","E-mail"});
            Object[] row = new Object[5];

            for(int i = 0; i<users.size();i++){
                row[0] = users.get(i).getStudentId();
                row[1] = users.get(i).getName();
                row[2] = users.get(i).getSurname();
                row[3] = users.get(i).getPhone();
                row[4] = users.get(i).getMail();
                model.addRow(row);
            }
            jTableView.setModel(model);
        }
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JButtonSearch = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableView = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ViewUserByTutor");

        JButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JButtonSearch.setText("Search");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });

        jTextSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTableView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableView.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableView);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Tutor", "Student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JButtonSearch)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSearchActionPerformed
        findUsers();
    }//GEN-LAST:event_JButtonSearchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TutorHome th = new TutorHome();
        th.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUser2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableView;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables
}
