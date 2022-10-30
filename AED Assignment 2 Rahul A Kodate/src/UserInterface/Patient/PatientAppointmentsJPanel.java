/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rahulkodate
 */
public class PatientAppointmentsJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;
    
    /**
     * Creates new form AppointmentsJPanel
     */
    public PatientAppointmentsJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
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
        btnUpcomingAppointments = new javax.swing.JButton();
        btnScheduleAppointment = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        rightJPanel.setBackground(new java.awt.Color(0, 105, 255));

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1097, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightJPanel);

        jPanel1.setBackground(new java.awt.Color(0, 105, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(194, 525));

        btnUpcomingAppointments.setBackground(new java.awt.Color(102, 255, 102));
        btnUpcomingAppointments.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnUpcomingAppointments.setText("Upcoming Appointments");
        btnUpcomingAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpcomingAppointmentsActionPerformed(evt);
            }
        });

        btnScheduleAppointment.setBackground(new java.awt.Color(102, 255, 102));
        btnScheduleAppointment.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnScheduleAppointment.setText("Schedule Appointment");
        btnScheduleAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppointmentActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpcomingAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnScheduleAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(114, 114, 114)
                .addComponent(btnUpcomingAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScheduleAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpcomingAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpcomingAppointmentsActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new PatientUpcomingAppointmentsJPanel(CardLayoutJPanel, account, business));
    }//GEN-LAST:event_btnUpcomingAppointmentsActionPerformed

    private void btnScheduleAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppointmentActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new PatientScheduleAppointmentJPanel(CardLayoutJPanel ,account, business));
    }//GEN-LAST:event_btnScheduleAppointmentActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnScheduleAppointment;
    private javax.swing.JButton btnUpcomingAppointments;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
