/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonsDirectory;
import model.UsersDirectory;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ASUS
 */
public class UserListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserListJPanel
     */
    PersonsDirectory personDirectory;
    JPanel MainPanel;
    DefaultTableModel dtm;
    UsersDirectory userDirectory;
    Map<String, ArrayList<String>> credentialsHistory;
    
    public UserListJPanel(JPanel MainPanel, PersonsDirectory personDirectory, UsersDirectory userDirectory, Map<String, ArrayList<String>> credentialsHistory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.MainPanel = MainPanel;
        this.userDirectory = userDirectory;
        this.credentialsHistory = credentialsHistory;
        dtm = (DefaultTableModel) tblPerson.getModel();
        populateTable();
        lblCredHeader.setVisible(false);
        lblUsername.setVisible(false);
        lblPassword.setVisible(false);
        txtUsername.setVisible(false);
        txtPassword.setVisible(false);
        btnSetCred.setVisible(false);
        btnSetDefault.setVisible(false);
    }
    
    public void populateTable(){
        dtm.setRowCount(0);
        for(Person person: userDirectory.getUserList()){
            if(("admin").equals(person.getRole())){
                continue;
            }
            Object[] row = new Object[5];
            row[0] = person;
            row[1] = person.getName();
            row[2] = person.getEmail();
            row[3] = person.getUsername();
            if(person.isAccountBlockStatus()){
                row[4] = "Blocked";
            }
            else{
                row[4] = "Not Blocked";
            }
            dtm.addRow(row);
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

        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblListHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnBlockUser = new javax.swing.JButton();
        btnSetCred = new javax.swing.JButton();
        lblCredHeader = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSetDefault = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 199, 231));

        btnRemove.setBackground(new java.awt.Color(102, 102, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setText("Remove User");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblListHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblListHeader.setText("Available User List");

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUID", "Name", "Email", "Username", "Block Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblPersonFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerson);
        if (tblPerson.getColumnModel().getColumnCount() > 0) {
            tblPerson.getColumnModel().getColumn(0).setResizable(false);
            tblPerson.getColumnModel().getColumn(1).setResizable(false);
            tblPerson.getColumnModel().getColumn(2).setResizable(false);
            tblPerson.getColumnModel().getColumn(3).setResizable(false);
            tblPerson.getColumnModel().getColumn(4).setResizable(false);
        }

        btnUpdate.setBackground(new java.awt.Color(102, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update User Credentials");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBlockUser.setBackground(new java.awt.Color(102, 102, 255));
        btnBlockUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBlockUser.setText("Update Block Status");
        btnBlockUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockUserActionPerformed(evt);
            }
        });

        btnSetCred.setBackground(new java.awt.Color(102, 102, 255));
        btnSetCred.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSetCred.setText("Update Credentials");
        btnSetCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetCredActionPerformed(evt);
            }
        });

        lblCredHeader.setText("Update User Credentials:");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnSetDefault.setBackground(new java.awt.Color(102, 102, 255));
        btnSetDefault.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSetDefault.setText("Set Default Credentails");
        btnSetDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblListHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCredHeader)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBlockUser))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSetCred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSetDefault)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlockUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCredHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetCred, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        lblCredHeader.setVisible(false);
        lblUsername.setVisible(false);
        lblPassword.setVisible(false);
        txtUsername.setVisible(false);
        txtPassword.setVisible(false);
        btnSetCred.setVisible(false);
        btnSetDefault.setVisible(false);
        int selectedRow = tblPerson.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this,"Would you like to remove this person as a User.","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Person person = (Person) tblPerson.getValueAt(selectedRow, 0);
                personDirectory.updatePersonEnabledStatus(person, "", "",false);
                userDirectory.getUserList().remove(person);
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a person from the list!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainPanel.remove(this);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.previous(MainPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a person from the list!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            lblCredHeader.setVisible(true);
            lblUsername.setVisible(true);
            lblPassword.setVisible(true);
            txtUsername.setVisible(true);
            txtPassword.setVisible(true);
            btnSetCred.setVisible(true);
            btnSetDefault.setVisible(true);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSetCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetCredActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        Person person = (Person)tblPerson.getValueAt(selectedRow, 0);
        String username = txtUsername.getText().trim();
        String plainPassword = String.valueOf(txtPassword.getPassword()).trim();
        String salt = BCrypt.gensalt();
        String password = BCrypt.hashpw(plainPassword, salt);
        String nuid = person.getNeuID();
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all fields are filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(person.getUsername()).equals(username)){
            for(Person personU: userDirectory.getUserList()){
            if(personU.getUsername().equals(username)){
                JOptionPane.showMessageDialog(this, "Username already exist. Please try with a new one.", "Username Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
          }
        }
        
        if (credentialsHistory.containsKey(nuid)) {
            ArrayList<String> passwords = credentialsHistory.get(nuid);
            // Check if the new password is unique compared to the old ones
           
                if (passwords.contains(plainPassword)) {
                    JOptionPane.showMessageDialog(this, "Password should be unique from last passwords!", "Password Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    passwords.add(plainPassword);
                  
                }
            
            
        } else {
            // If the user is new, create a new list and add the password
            ArrayList<String> passwords = new ArrayList<>();
            passwords.add(password);
            credentialsHistory.put(nuid, passwords);
        }
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Would you like to update credentials for the selected user.","Notice",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            person.setUsername(username);
            person.setPassword(password);
            for(Person user: userDirectory.getUserList()){
                System.out.println();
            }
            for(Person user: personDirectory.getPersonList()){
                System.out.println();
            }
            populateTable();
            lblCredHeader.setVisible(false);
            lblUsername.setVisible(false);
            lblPassword.setVisible(false);
            txtUsername.setVisible(false);
            txtPassword.setVisible(false);
            btnSetCred.setVisible(false);
            btnSetDefault.setVisible(false);
        }
    }//GEN-LAST:event_btnSetCredActionPerformed

    private void btnSetDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetDefaultActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblPerson.getSelectedRow();
        Person person = (Person)tblPerson.getValueAt(selectedRow, 0);
        String username = person.getNeuID();
        String plainPassword = person.getNeuID();
        String salt = BCrypt.gensalt();
        String password = BCrypt.hashpw(plainPassword, salt);
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all fields are filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Would you like to create user for the selected person.","Notice",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            person.setUsername(username);
            person.setPassword(password);
            populateTable();
            lblCredHeader.setVisible(false);
            lblUsername.setVisible(false);
            lblPassword.setVisible(false);
            txtUsername.setVisible(false);
            txtPassword.setVisible(false);
            btnSetCred.setVisible(false);
            btnSetDefault.setVisible(false);
        }
    }//GEN-LAST:event_btnSetDefaultActionPerformed

    private void btnBlockUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockUserActionPerformed
        // TODO add your handling code here:
         lblCredHeader.setVisible(false);
         lblUsername.setVisible(false);
         lblPassword.setVisible(false);
         txtUsername.setVisible(false);
         txtPassword.setVisible(false);
         btnSetCred.setVisible(false);
         btnSetDefault.setVisible(false);
         
         int selectedRow = tblPerson.getSelectedRow();
         if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a person from the list!","Warning",JOptionPane.WARNING_MESSAGE);
         }
        else{
         int dialogButton = JOptionPane.YES_NO_OPTION;
         int dialogResult = JOptionPane.showConfirmDialog(this,"Would you like to update block status for the selected user.","Warning",dialogButton);
         if(dialogResult == JOptionPane.YES_OPTION){
            Person user = (Person)tblPerson.getValueAt(selectedRow, 0);
            userDirectory.disableUserAccount(user);
            personDirectory.disableUserAccount(user);
         }
         populateTable();
         }
    }//GEN-LAST:event_btnBlockUserActionPerformed

    private void tblPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblPersonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPersonFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBlockUser;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSetCred;
    private javax.swing.JButton btnSetDefault;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCredHeader;
    private javax.swing.JLabel lblListHeader;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblPerson;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
