/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Community.Community;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Role.HospitalRole;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahulkodate
 */
public class CreateHospitalJPanel extends javax.swing.JPanel {
    UserAccount account;
    JPanel CardLayoutJPanel;
    Ecosystem business;
    Community community;
    /**
     * Creates new form CreatePatientJPanel
     */
    public CreateHospitalJPanel(JPanel CardLayoutJPanel, Ecosystem business, UserAccount account) {
        initComponents();   
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business =business;
        this.account=account;
//        this.community = (Community) this.account.getDetails();
        
        
        
        ArrayList<Community> communityList = this.business.getCommunityDirectory().getCommunityList();
        
        Community[] comboBoxModel1 = communityList.toArray(new Community[0]);
        communityNameComboBox.setModel(new DefaultComboBoxModel<Community>(comboBoxModel1));
//        System.out.print(communityList.toArray());
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        contactNumberTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        licenseTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        passwordTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        communityNameComboBox = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 105, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTxtActionPerformed(evt);
            }
        });
        add(adminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 221, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 221, -1));
        add(contactNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 221, -1));

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 221, -1));

        jLabel8.setText("License Number:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, 20));

        jLabel2.setText("Hospital Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, 20));

        jLabel4.setText("Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, 20));
        add(licenseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 221, -1));

        jLabel6.setText("Contact number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, 20));

        jLabel7.setText("Admin Name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 90, 20));

        jLabel1.setFont(new java.awt.Font("AppleMyungjo", 1, 24)); // NOI18N
        jLabel1.setText("SIGN UP NEW HOSPITAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        btnSave.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 160, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-64.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 50, 30));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 221, -1));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 221, -1));

        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, 20));

        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, 20));

        communityNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityNameComboBoxActionPerformed(evt);
            }
        });
        add(communityNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 220, -1));

        lblCommunity.setText("Community:");
        add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        Hospital newHospital = new Hospital();
        String hospitalName= nameTxt.getText();
        String username = usernameTxt.getText();
        String password= passwordTxt.getText();
    // String hospitalId;
     
        String phoneNo= contactNumberTxt.getText();
        String address = addressTxt.getText();
        String adminName = adminTxt.getText();
        String licenseNo= licenseTxt.getText();
     
        Community selectedCommunity = (Community) communityNameComboBox.getSelectedItem();
        
        newHospital.setCommunity(selectedCommunity);
        newHospital.setName(hospitalName);
        newHospital.setAddress(address);
        newHospital.setAdminName(adminName);
        newHospital.setLicenseNo(licenseNo);
        newHospital.setUsername(username);
        newHospital.setPassword(password);
        newHospital.setPhoneNo(phoneNo);
       if(hospitalName.isEmpty() || phoneNo.isEmpty() || address.isEmpty()|| username.isEmpty() || password.isEmpty()){
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
            
            Hospital hospital = business.getCommunityDirectory().getCommunity(selectedCommunity.getCommunityId()).addHospital(newHospital);
            //Hospital hospital = business.getHospitalDirectory().addHospital(newHospital);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, hospital.getHospitalId(), new HospitalRole(), hospital);
            JOptionPane.showMessageDialog(null, "New Hospital added");
        }
    
    }//GEN-LAST:event_btnSaveActionPerformed
    
        public boolean phoneFormat(String phoneNo){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phoneNo);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
        
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       
        CardLayoutJPanel.remove(this);
        Component[] componentArray = CardLayoutJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminHospitalPortalJPanel systemAdminHospitalPortalJPanel = (SystemAdminHospitalPortalJPanel) component;
        systemAdminHospitalPortalJPanel.populateTable();

        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void adminTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTxtActionPerformed

    private void communityNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityNameComboBoxActionPerformed
        // TODO add your handling code here
        Community selectedCommunity = (Community) communityNameComboBox.getSelectedItem();
        ArrayList<Hospital> hospList = selectedCommunity.getHospitalDirectory();
        Hospital[] comboBoxModel = hospList.toArray(new Hospital[0]);
        
        

        
    }//GEN-LAST:event_communityNameComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField adminTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Community> communityNameComboBox;
    private javax.swing.JTextField contactNumberTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JTextField licenseTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
