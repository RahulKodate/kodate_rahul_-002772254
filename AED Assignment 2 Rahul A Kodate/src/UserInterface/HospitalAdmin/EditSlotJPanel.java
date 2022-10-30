/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Ecosystem;
import Business.Slot.Slot;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author rahulkodate
 */
public class EditSlotJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditSlotJPanel
     */
    JPanel CardLayoutJPanel;
    Slot viewSlot;
    Ecosystem business;

    EditSlotJPanel(JPanel CardLayoutJPanel, Slot viewSlot, Ecosystem business) {
     
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.business= business;
        this.viewSlot= viewSlot;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAppointmentDate = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        durationTxt = new javax.swing.JTextField();
        lblAppointmentTime = new javax.swing.JLabel();
        inTimeTxt = new javax.swing.JTextField();
        btnButton = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 105, 255));

        lblAppointmentDate.setText("Appointment Date:");

        lblDuration.setText("Duration");

        lblAppointmentTime.setText("Appointment Time:");

        inTimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTimeTxtActionPerformed(evt);
            }
        });

        btnButton.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        btnButton.setText("Update");
        btnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButtonActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDuration)
                                    .addComponent(lblAppointmentTime)
                                    .addComponent(lblAppointmentDate))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inTimeTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(lblAppointmentDate)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(durationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAppointmentTime))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButton)
                    .addComponent(btnSave))
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inTimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTimeTxtActionPerformed

    private void btnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnButtonActionPerformed
        // TODO add your handling code here:

//       datechooser.setEnabled(true);
       inTimeTxt.setEnabled(true);

       durationTxt.setEnabled(true);
        this.btnSave.setEnabled(true);

        this.btnButton.setEnabled(false);
    }//GEN-LAST:event_btnButtonActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

       // doctor.setEmailId(emailTxt.getText());
        
//       viewSlot.setDate(datechooser.getDate());
       viewSlot.setDuration(Integer.parseInt(durationTxt.getText()));
      // viewSlot.setIn_time((inTimeTxt.getText()));
       
//       datechooser.setEnabled(false);
       inTimeTxt.setEnabled(false);

       durationTxt.setEnabled(false);

        this.btnSave.setEnabled(false);

        this.btnButton.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField durationTxt;
    private javax.swing.JTextField inTimeTxt;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblAppointmentTime;
    private javax.swing.JLabel lblDuration;
    // End of variables declaration//GEN-END:variables
}
