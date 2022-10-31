package ui.Patient;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.Patient;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author rahulkodate
 */
public class PatientLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form PatientLandingPage
     */
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private HospitalDirectory hospitalDirectory;
    private DoctorDirectory doctorDirectory;
//    private String doctor;
    private String user;
    private ArrayList<Person> personList;

//    public PatientLandingPage(JPanel userProcessContainer, ArrayList<Person> personList, String doctor, String user) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
////        this.personDirectory = personDirectory;
////        this.hospitalDirectory = hospitalDirectory;
////        this.doctorDirectory = doctorDirectory;
//        this.doctor = doctor;
//        this.user = user;
//        this.personList = personList;
//    }
//
    public PatientLandingPage(JPanel userProcessContainer, String user, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
//        this.hospitalDirectory = hospitalDirectory;
//        this.doctorDirectory = doctorDirectory;
//        this.doctor = doctor;
        this.user = user;
//        this.personList = personList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnPatientVitals = new javax.swing.JButton();
    btnPatientMgmt = new javax.swing.JButton();
    lblPatientDetails = new javax.swing.JLabel();
    btnBack = new javax.swing.JButton();

    setBackground(new java.awt.Color(102, 153, 255));

    btnPatientVitals.setBackground(new java.awt.Color(51, 102, 255));
    btnPatientVitals.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
    btnPatientVitals.setForeground(new java.awt.Color(255, 255, 255));
    btnPatientVitals.setText("Manage Patient Vitals");
    btnPatientVitals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnPatientVitals.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPatientVitalsActionPerformed(evt);
      }
    });

    btnPatientMgmt.setBackground(new java.awt.Color(51, 102, 255));
    btnPatientMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
    btnPatientMgmt.setForeground(new java.awt.Color(255, 255, 255));
    btnPatientMgmt.setText("Manage Patient Data");
    btnPatientMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnPatientMgmt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPatientMgmtActionPerformed(evt);
      }
    });

    lblPatientDetails.setFont(new java.awt.Font("Operator Mono", 1, 36)); // NOI18N
    lblPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
    lblPatientDetails.setText("Patient Landing Page");

    btnBack.setBackground(new java.awt.Color(51, 102, 255));
    btnBack.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
    btnBack.setForeground(new java.awt.Color(255, 255, 255));
    btnBack.setText("<- Back");
    btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGap(75, 75, 75)
            .addComponent(btnBack)
            .addGap(94, 94, 94)
            .addComponent(lblPatientDetails))
          .addGroup(layout.createSequentialGroup()
            .addGap(350, 350, 350)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnPatientMgmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnPatientVitals, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))))
        .addContainerGap(317, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(77, 77, 77)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblPatientDetails)
          .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(93, 93, 93)
        .addComponent(btnPatientMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(57, 57, 57)
        .addComponent(btnPatientVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(217, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnPatientVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientVitalsActionPerformed
        // TODO add your handling code here:
//        ViewVitalSignEncounters mvs = new ViewVitalSignEncounters(userProcessContainer, personDirectory.getPersonDirectory(), doctor);
//        userProcessContainer.add("ManageVitalSign", mvs);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        personList = personDirectory.searchPerson(user);
        String doctor = personList.get(0).getPatient().getDoctor().getFirstName();
//            PatientLandingPage(userProcessContainer,personDirectory,hospitalDirectory,doctorDirectory,doctor)
        ViewVitalSignEncounters pjp = new ViewVitalSignEncounters(userProcessContainer, personList, doctor, user);
        userProcessContainer.add("PatientAdmin", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnPatientVitalsActionPerformed

  private void btnPatientMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientMgmtActionPerformed
        // TODO add your handling code here:
        personList = personDirectory.searchPerson(user);
        Patient patient = personList.get(0).getPatient();
        ViewPatientDetails pjp = new ViewPatientDetails(userProcessContainer, patient, false);
        userProcessContainer.add("Patientviewdetails", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//        ManagePatients pt = new ManagePatients(userProcessContainer, personDirectory, hospitalDirectory, doctorDirectory);
//        userProcessContainer.add("Manage Patients", pt);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnPatientMgmtActionPerformed

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnPatientMgmt;
  private javax.swing.JButton btnPatientVitals;
  private javax.swing.JLabel lblPatientDetails;
  // End of variables declaration//GEN-END:variables
}
