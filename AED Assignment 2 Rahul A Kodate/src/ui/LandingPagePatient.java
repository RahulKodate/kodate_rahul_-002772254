package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import ui.Patient.ManagePatients;

/**
 *
 * @author rahulkodate
 */
public class LandingPagePatient extends javax.swing.JPanel {

    /**
     * Creates new form LandingPage
     */
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private CommunityDirectory communityDirectory;
    private HospitalDirectory hospitalDirectory;
    private HouseDirectory houseDirectory;
    private CityDirectory cityDirectory;

    public LandingPagePatient(JPanel userProcessContainer, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, CommunityDirectory communityDirectory, HouseDirectory houseDirectory, CityDirectory cityDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.communityDirectory = communityDirectory;
        this.houseDirectory = houseDirectory;
        this.cityDirectory = cityDirectory;
        setSize(1000, 610);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLanding = new javax.swing.JLabel();
        btnPatientMgmt = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        lblLanding.setFont(new java.awt.Font("Operator Mono", 1, 36)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding.setText("Patient Administrator");

        btnPatientMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnPatientMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnPatientMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientMgmt.setText("Patient Directory");
        btnPatientMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatientMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientMgmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatientMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLanding))
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnPatientMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientMgmtActionPerformed
        // TODO add your handling code here:
        ManagePatients plp = new ManagePatients(userProcessContainer, personDirectory, hospitalDirectory, doctorDirectory);
        userProcessContainer.add("Manage Patients", plp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientMgmtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientMgmt;
    private javax.swing.JLabel lblLanding;
    // End of variables declaration//GEN-END:variables
}
