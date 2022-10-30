/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.Patient.PatientHistoryJPanel;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rahulkodate
 */
public class SearchPatientJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Doctor doctor;
    private Ecosystem business;
    /**
     * Creates new form SearchPatientJPanel
     */
    public SearchPatientJPanel(JPanel CardLayoutJPanel, Doctor doctor, UserAccount account, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.doctor = doctor;
        this.account = account;
        this.business = business;
        
        populatePatientComboBox();
    }
    
    public ArrayList<Patient> getAssociatedPatients() {
        Set<String> patientIdSet = new HashSet<>();
        ArrayList<Patient> list = new ArrayList();
        
        ArrayList<WorkRequest> workRequestOfDoctor = this.account.getWorkQueue().getWorkRequestList();
        
        for(WorkRequest w: workRequestOfDoctor) {
            
            if(w.getStatus().equals("Physician appointment completed")) {
                String patientId = w.getSender().getId();
                if(!patientId.equals(this.account.getId()) &&!patientIdSet.contains(patientId)) {
                    list.add((Patient) w.getSender().getDetails());
                    patientIdSet.add(patientId);
                }
            }
        }
        
        return list;
        
    }
    
    public void populatePatientComboBox() {
        
        ArrayList<Patient> list = this.getAssociatedPatients();
        Patient[] comboBoxModel4 = list.toArray(new Patient[0]);
        
        
        patientComboBox.setModel(new DefaultComboBoxModel<Patient>(comboBoxModel4));
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        patientComboBox = new javax.swing.JComboBox<>();
        patientDetails = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightJPanel);

        jPanel1.setBackground(new java.awt.Color(0, 105, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(patientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 135, -1));

        patientDetails.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        patientDetails.setText("Patient Details");
        patientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, 170, 50));

        backBtn.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/company logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 364, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void patientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsActionPerformed
        // TODO add your handling code here:
        
        Patient p = (Patient) patientComboBox.getSelectedItem();
        if(p == null) {
            JOptionPane.showMessageDialog(null, "Please select a patient");
            return;
        }
        
        jSplitPane1.setRightComponent(new PatientHistoryJPanel(CardLayoutJPanel, p, this.account,false));
    }//GEN-LAST:event_patientDetailsActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<Patient> patientComboBox;
    private javax.swing.JButton patientDetails;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
