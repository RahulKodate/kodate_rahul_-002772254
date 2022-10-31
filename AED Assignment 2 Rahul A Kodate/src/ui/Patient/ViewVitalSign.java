package ui.Patient;

import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.VitalSigns;

/**
 *
 * @author Rishabh
 */
public class ViewVitalSign extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSign
     */
    private JPanel userProcessContainer;
    private VitalSigns vitalSigns;
    private Boolean editable = Boolean.FALSE;

    public ViewVitalSign(JPanel userProcessContainer, VitalSigns vitalSigns, Boolean editable) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vitalSigns = vitalSigns;
        this.editable = editable;

        populateVitalsDetails();
        updateVitals(this.editable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTemp = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        txtBoodPressure = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        lblBP = new javax.swing.JLabel();
        txtSPO2 = new javax.swing.JTextField();
        lblTemp = new javax.swing.JLabel();
        lblSPO2 = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblLanding = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        txtTemp.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        lblHeartRate.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblHeartRate.setForeground(new java.awt.Color(255, 255, 255));
        lblHeartRate.setText("Heart Rate");

        txtBoodPressure.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtHeartRate.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        lblBP.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblBP.setForeground(new java.awt.Color(255, 255, 255));
        lblBP.setText("Blood Pressure");

        txtSPO2.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        lblTemp.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblTemp.setText("Body Temperature (Celsius)");

        lblSPO2.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblSPO2.setForeground(new java.awt.Color(255, 255, 255));
        lblSPO2.setText("Oxygen Saturation");

        lblHeight.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblHeight.setText("Height (cms)");

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<- Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblLanding.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding.setText("View/Edit Encounter Details");

        btnEdit.setBackground(new java.awt.Color(255, 0, 0));
        btnEdit.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblWeight.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Weight (kgs)");

        txtWeight.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtHeight.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        btnSave.setBackground(new java.awt.Color(255, 0, 0));
        btnSave.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTemp)
                                        .addComponent(lblHeight, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblWeight, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblBP))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBoodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHeartRate)
                                    .addComponent(lblSPO2))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(124, 124, 124)
                        .addComponent(lblLanding)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanding)
                    .addComponent(btnBack))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBP)
                    .addComponent(txtBoodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSPO2)
                    .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            double weight = Double.parseDouble(txtWeight.getText());
            double height = Double.parseDouble(txtHeight.getText());
            double temp = Double.parseDouble(txtTemp.getText());
            double bp = Double.parseDouble(txtBoodPressure.getText());
            double heartRate = Double.parseDouble(txtHeartRate.getText());
            double spo2 = Double.parseDouble(txtSPO2.getText());

            vitalSigns.setWeight(weight);
            vitalSigns.setHeight(height);
            vitalSigns.setTemperature(temp);
            vitalSigns.setBloodPressure(bp);
            vitalSigns.setHeartRate(heartRate);
            vitalSigns.setOxygenSaturation(spo2);
            vitalSigns.setTime(new Date());
            JOptionPane.showMessageDialog(this, "Vital signs added succssfully!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            updateVitals(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid values!", "Error", JOptionPane.ERROR_MESSAGE);
        }
  }//GEN-LAST:event_btnSaveActionPerformed

  private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        updateVitals(true);
  }//GEN-LAST:event_btnEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLanding;
    private javax.swing.JLabel lblSPO2;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBoodPressure;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtSPO2;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void populateVitalsDetails() {
        txtBoodPressure.setText(String.valueOf(vitalSigns.getBloodPressure()));
        txtHeartRate.setText(String.valueOf(vitalSigns.getHeartRate()));
        txtHeight.setText(String.valueOf(vitalSigns.getHeight()));
        txtSPO2.setText(String.valueOf(vitalSigns.getOxygenSaturation()));
        txtTemp.setText(String.valueOf(vitalSigns.getTemperature()));
        txtWeight.setText(String.valueOf(vitalSigns.getWeight()));
    }

    private void updateVitals(Boolean editable) {
        if (editable) {
            txtBoodPressure.setEnabled(true);
            txtHeartRate.setEnabled(true);
            txtHeight.setEnabled(true);
            txtSPO2.setEnabled(true);
            txtTemp.setEnabled(true);
            txtWeight.setEnabled(true);
        } else {
            txtBoodPressure.setEnabled(false);
            txtHeartRate.setEnabled(false);
            txtHeight.setEnabled(false);
            txtSPO2.setEnabled(false);
            txtTemp.setEnabled(false);
            txtWeight.setEnabled(false);
        }
    }
}
