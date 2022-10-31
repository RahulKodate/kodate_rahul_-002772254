package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import ui.Doctor.DoctorLandingPage;
import ui.Patient.*;

/**
 *
 * @author Rishabh
 */
public class LandingPageCred extends javax.swing.JPanel {

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
    private ArrayList<Person> personList;

    public LandingPageCred(JPanel userProcessContainer, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, CommunityDirectory communityDirectory, HouseDirectory houseDirectory, CityDirectory cityDirectory) {
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
        btnLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));

        lblLanding.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding.setText("Login");

        btnLogin.setBackground(new java.awt.Color(255, 0, 0));
        btnLogin.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUser.setToolTipText("");

        txtPassword.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser)
                            .addComponent(txtPassword)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(lblLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText();
        String pass = txtPassword.getText();
        if (user.equals("admin") && pass.equals("admin")) {
            LandingPageSystem pjp = new LandingPageSystem(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("SystemAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (user.equals("community") && pass.equals("community")) {
            LandingPageCommunity pjp = new LandingPageCommunity(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("CommunityAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (user.equals("hospital") && pass.equals("hospital")) {
            LandingPageHospital pjp = new LandingPageHospital(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("HospitalAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (user.equals("doctor") && pass.equals("doctor")) {
            LandingPageDoctor pjp = new LandingPageDoctor(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("DoctorAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (user.equals("person") && pass.equals("person")) {
            LandingPagePerson pjp = new LandingPagePerson(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("PersonAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (user.equals("patient") && pass.equals("patient")) {
            LandingPagePatient pjp = new LandingPagePatient(userProcessContainer, personDirectory, patientDirectory, doctorDirectory, hospitalDirectory, communityDirectory, houseDirectory, cityDirectory);
            userProcessContainer.add("PatientAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (pass.equals("pat")) {
//            personList = personDirectory.searchPerson(user);
//            String doctor = personList.get(0).getPatient().getDoctor().getFirstName();
//            PatientLandingPage pjp = new PatientLandingPage(userProcessContainer, personList, doctor, user);
            PatientLandingPage pjp = new PatientLandingPage(userProcessContainer, user, personDirectory);
//            ViewVitalSignEncounters pjp = new ViewVitalSignEncounters(userProcessContainer, personList, doctor, user);
            userProcessContainer.add("PatientAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        if (pass.equals("doc")) {
            DoctorLandingPage pjp = new DoctorLandingPage(userProcessContainer, user, personDirectory);
//            personList = personDirectory.searchPersonDoctor(user);
//            String doctor = personList.get(0).getPatient().getDoctor().getFirstName();
//            ManageVitalSign pjp = new ManageVitalSign(userProcessContainer, personList, user, personDirectory);
            userProcessContainer.add("PatientAdmin", pjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

  }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLanding;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
