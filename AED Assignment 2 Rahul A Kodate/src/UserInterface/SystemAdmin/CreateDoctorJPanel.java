/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import UserInterface.HospitalAdmin.*;
import Business.Community.Community;
import UserInterface.Physician.*;
import Business.Doctor.Doctor;
import UserInterface.SystemAdmin.*;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Role.HospitalRole;
import Business.Role.PatientRole;
import Business.Role.PhysicianRole;
import Business.UserAccount.UserAccount;

import UserInterface.HospitalAdmin.ManagePhysicianJPanel;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rahulkodate
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    Ecosystem business;
    Hospital hospital;
    Community community;
    // UserAccount account;
    /**
     * Creates new form CreateHospitalJPanel
     */
    public CreateDoctorJPanel( JPanel CardLayoutJPanel, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        //this.account=account;
        //this.hospital = (Hospital)account.getDetails();
        this.community = community;
        this.hospital=hospital;
        
//        Hospital selectedHospital = (Hospital) hospitalComboBox.getSelectedItem();
        ArrayList<Community> communityList = this.business.getCommunityDirectory().getCommunityList();
        Community[] comboBoxModel1 = communityList.toArray(new Community[0]);
        communityNameComboBox.setModel(new DefaultComboBoxModel<Community>(comboBoxModel1));
        
        
        
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
        lblCreateDoctor = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        hospitalComboBox = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        communityNameComboBox = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 105, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreateDoctor.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblCreateDoctor.setText("CREATE DOCTOR");
        jPanel1.add(lblCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 350, 42));

        lblHospital.setText("Hospital:");
        jPanel1.add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 150, 20));

        lblContactNumber.setText("Contact Number:");
        jPanel1.add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 152, -1));

        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 68, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 152, -1));

        lblName.setText("Name:");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 152, -1));

        lblLicenseNumber.setText("License Number:");
        jPanel1.add(lblLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));
        jPanel1.add(txtLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 152, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 30));

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 150, 30));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 150, 20));

        lblPassword.setText("Password:");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        lblUsername.setText("Username:");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        hospitalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(hospitalComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 152, -1));

        lblGender.setText("Gender:");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));
        jPanel1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 152, -1));

        communityNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityNameComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(communityNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 220, -1));

        lblCommunity.setText("Community:");
        jPanel1.add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        Component[] componentArray = CardLayoutJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        ManageDoctorJPanel manageDoctorJPanel = (ManageDoctorJPanel) component;
     //   managePhysicianJPanel.populateTable();

        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        // TODO: add validations
        Doctor newDoctor = new Doctor();
      
        String username = txtUsername.getText();
        String password= txtPassword.getText();
     
        String email= txtEmail.getText();
        String phoneNo= txtContactNumber.getText();
        String name = nameTxt.getText();
        String gender = txtGender.getText();
        String licenseNo= txtLicenseNumber.getText();
        
        Community selectedCommunity = (Community) communityNameComboBox.getSelectedItem();
        Hospital selectedHospital = (Hospital) hospitalComboBox.getSelectedItem();
        
        newDoctor.setHospital(selectedHospital);
        newDoctor.setEmailId(email);
        newDoctor.setGender(gender);
        newDoctor.setLicenseNo(licenseNo);
        newDoctor.setName(name);
        newDoctor.setPhoneNo(phoneNo);
        newDoctor.setUsername(username);
        newDoctor.setPassword(password);
     
        
       if(password.isEmpty() || phoneNo.isEmpty() || name.isEmpty()|| username.isEmpty() || email.isEmpty() || selectedHospital == null){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
        else if(!business.getPatientDirectory().isPhoneUnique(phoneNo)){
            JOptionPane.showMessageDialog(null, "Phone No already registered!");
        }
        else if(!business.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
       else{
            
            
              Doctor doctor = selectedCommunity.getHospital(selectedHospital.getHospitalId()).addDoctor(newDoctor);
              UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, doctor.getDoctorId(), new PhysicianRole(), doctor);
        
            JOptionPane.showMessageDialog(null, "New Physician added");
        }
    }
    
    public boolean phoneFormat(String phoneNo){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        if(matcher.matches()){
            return true;
        }
        return false;
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void hospitalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboBoxActionPerformed
//                Hospital selectedHospital = (Hospital) hospitalComboBox.getSelectedItem();
//       
//       
//                ArrayList<Hospital> hospList = community.getHospitalDirectory();
//                Hospital[] comboBoxModel = hospList.toArray(new Hospital[0]);
//                System.out.print(hospList.toArray());
//                hospitalComboBox.setSelectedIndex(-1);
//                hospitalComboBox.setModel(new DefaultComboBoxModel<Hospital>(comboBoxModel));

    }//GEN-LAST:event_hospitalComboBoxActionPerformed

    private void communityNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityNameComboBoxActionPerformed
        // TODO add your handling code here
        Community selectedCommunity = (Community) communityNameComboBox.getSelectedItem();
        ArrayList <Hospital> hospList = selectedCommunity.getHospitalDirectory();
        //System.out.println(hospList);
        Hospital[] comboBoxModel = hospList.toArray(new Hospital[0]);
        hospitalComboBox.setModel(new DefaultComboBoxModel<Hospital>(comboBoxModel));

    }//GEN-LAST:event_communityNameComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Community> communityNameComboBox;
    private javax.swing.JComboBox<Hospital> hospitalComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblCreateDoctor;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
