/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import UserInterface.Patient.PatientInfoJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutikasalian
 */
public class SystemAdminPatientPortalJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    private Ecosystem business;

    /**
     * Creates new form SystemAdminPatientPortalJPanel
     */
    public SystemAdminPatientPortalJPanel(JPanel CardLayoutJPanel,  Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        populateTable();
         
    }
    
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Patient> patientList = business.getPatientDirectory().getPatientList();
    
        int rowCount = patientTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)patientTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Patient p : patientList) {
            Object row[] = new Object[8];
            row[0] = p;
            row[1] = p.getPatientID();
            row[2] = p.getPhoneNo();
            row[3] = p.getEmailId();
            row[4] = p.getAddress();
            row[5] = p.getAge();
            row[6] = p.getGender();
            row[7] = p.getBloodGroup();

            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        viewPatientBtn = new javax.swing.JButton();
        createPatientBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENT'S PORTAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        patientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Patient Id", "Contact No.", "email id", "Address", "Age", "Gender", "Blood Group"
            }
        ));
        jScrollPane1.setViewportView(patientTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 820, 230));

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deleteBtn.setText("Delete ");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 230, 40));

        viewPatientBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewPatientBtn.setText("View ");
        viewPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientBtnActionPerformed(evt);
            }
        });
        add(viewPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 230, 40));

        createPatientBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        createPatientBtn.setText("Add");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });
        add(createPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 230, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 30));

        refreshBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientBtnActionPerformed
        // TODO add your handling code here:
        
        int row = patientTbl.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        System.out.println("=========== >> " + patientTbl.getValueAt(row, 0));
        
        Patient viewPatient = (Patient) patientTbl.getValueAt(row, 0);
        
        
        
        PatientInfoJPanel patientInfoJPanel = new PatientInfoJPanel(CardLayoutJPanel, viewPatient);
        CardLayoutJPanel.add("PatientInfoJPanel", patientInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_viewPatientBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = patientTbl.getSelectedRow();
        Patient selectedPatient = (Patient) patientTbl.getValueAt(row, 0);
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        PatientDirectory patientDirectory = business.getPatientDirectory();
        
        business.getPatientDirectory().deletePatient(selectedPatient.getPatientID(), business);
        
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatientJPanel = new CreatePatientJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreatePatientJPanel", createPatientJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_createPatientBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTbl;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewPatientBtn;
    // End of variables declaration//GEN-END:variables
}
