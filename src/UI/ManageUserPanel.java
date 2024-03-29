/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.User;
import Model.UserList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author deshna
 */
public class ManageUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserPanel
     */
    UserList ul;
    public ManageUserPanel(UserList ul) {
        initComponents();
        this.ul = ul;
        populateTable();
//        markFieldsReadOnly();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastnametxt = new javax.swing.JTextField();
        neuidlb = new javax.swing.JLabel();
        neuidtxt = new javax.swing.JTextField();
        usernamelb = new javax.swing.JLabel();
        firstnamelb = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserList = new javax.swing.JTable();
        firstnametxt = new javax.swing.JTextField();
        passwordlb = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        emaillb = new javax.swing.JLabel();
        lastnamelb = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        updateJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lastnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 408, 135, -1));

        neuidlb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        neuidlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neuidlb.setText("NEUID");
        add(neuidlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 321, 82, -1));
        add(neuidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 321, 135, -1));

        usernamelb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernamelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernamelb.setText("User Name");
        add(usernamelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 352, -1, -1));

        firstnamelb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstnamelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstnamelb.setText("First Name");
        add(firstnamelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 380, -1, -1));
        add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 352, 135, -1));

        tblUserList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NEU ID", "User Name", "First Name", "Last Name", "Password", "Email ID", "Enabled"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 96, 715, 175));
        add(firstnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 380, 135, -1));

        passwordlb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordlb.setText("Password");
        add(passwordlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 433, 80, -1));
        add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 433, 135, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 58, -1, -1));

        emaillb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emaillb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emaillb.setText("Email ID");
        add(emaillb, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 461, 78, -1));

        lastnamelb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastnamelb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastnamelb.setText("Last Name");
        add(lastnamelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 408, 77, -1));
        add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 461, 135, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search NUID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 25, -1, -1));

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 25, 98, -1));

        searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 22, -1, -1));

        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 58, -1, -1));

        updateJBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateJBtn.setText("Update");
        updateJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBtnActionPerformed(evt);
            }
        });
        add(updateJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblUserList.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        User u = (User) model.getValueAt(selectedRowIndex, 0);
        ul.deleteUser(u);
        JOptionPane.showMessageDialog(this, "User has been deleted.");
        populateTable();
        
        JOptionPane.showMessageDialog(this, "User has been Deleted");
        resetFields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        model.setRowCount(0);
        
        for(User vs : ul.getUserList()){
            Object[] row = new Object[8];
            
            row[0] = vs;
            row[1] = vs.getFirstName();
            row[2] = vs.getLastName();
            row[3] = vs.getUserName();
            row[4] = vs.getPassword();
            row[5] = vs.getEmailID();
            
             model.addRow(row);
        }
    }
    
//    private void markFieldsReadOnly(){
//        neuidtxt.setEditable(false);
//        firstnametxt.setEditable(false);
//        lastnametxt.setEditable(false);
//        usernametxt.setEditable(false);
//        passwordtxt.setEditable(false);
//        emailtxt.setEditable(false);
//    }
    
    private void resetFields(){
        neuidtxt.setText("");
        firstnametxt.setText("");
        lastnametxt.setText("");
        usernametxt.setText("");
        passwordtxt.setText("");
        emailtxt.setText("");
    }
            
    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        DefaultTableModel ob = (DefaultTableModel) tblUserList.getModel();
        TableRowSorter<DefaultTableModel> tblSorter = new TableRowSorter<>(ob);
        tblUserList.setRowSorter(tblSorter);
        tblSorter.setRowFilter(RowFilter.regexFilter(searchtxt.getText()));
    }//GEN-LAST:event_searchbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        int selectedRowIndex = tblUserList.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        Object vitalSigns = (User) model.getValueAt(selectedRowIndex, 0);
        
        if(vitalSigns instanceof User vs){
            
            neuidtxt.setText(vs.getneuid());
            firstnametxt.setText(vs.getFirstName());
            lastnametxt.setText(vs.getLastName());
            usernametxt.setText(vs.getUserName());
            passwordtxt.setText(vs.getPassword());
            emailtxt.setText(vs.getEmailID());
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid data in the selected row.");
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void updateJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBtnActionPerformed
        // TODO add your handling code here:
        String passwordHashed = UserList.HashPassword(passwordtxt.getText());
        User newUser = new User();
        newUser.setneuid(neuidtxt.getText());
        newUser.setUserName(usernametxt.getText());
        newUser.setFirstName(firstnametxt.getText());
        newUser.setLastName(lastnametxt.getText());
        newUser.setPassword(passwordHashed);
        newUser.setEmailID(emailtxt.getText());
        newUser.setIsEnabled(true);
        newUser.setPreviousPass(new ArrayList<>());
        var isSuccess = ul.updateUser(newUser);
        if(isSuccess){            
            JOptionPane.showMessageDialog(this, "Updated User Details"); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Cannot use any previous passwords! Set new password"); 
        }
        populateTable();
    }//GEN-LAST:event_updateJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel emaillb;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel firstnamelb;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnamelb;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JLabel neuidlb;
    private javax.swing.JTextField neuidtxt;
    private javax.swing.JLabel passwordlb;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable tblUserList;
    private javax.swing.JButton updateJBtn;
    private javax.swing.JLabel usernamelb;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
