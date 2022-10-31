package ui.Patient;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author rahulkodate
 */
public class CreatePatient extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatient
     */
    private JPanel userProcessContainer;
    private Person person;
    private Hospital hospital;
    private HospitalDirectory hospitalDirectory;
    private DoctorDirectory doctorDirectory;
    private Doctor doctor;
    private ArrayList<Doctor> doctorlist;
    private PersonDirectory personDirectory;

    public CreatePatient(JPanel userProcessContainer, Person person, ArrayList<Hospital> hospitals, ArrayList<Doctor> doctors) {
        initComponents();
        this.person = person;
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorlist = doctors;
//        DoctorDirectory doctorDirectory = new DoctorDirectory();
//        for (Doctor newd : doctors) {
//            newd = doctorDirectory.AddDoctor();
//
//        }
        clearInputs();
        isDigit("");
        isLetter("");
        populateHospitalTable(hospitals);

//        ArrayList<Hospital> hospitals = hospitalDirectory.getHospitalDirectory();
//        for (Doctor x : doctors) {
//            System.out.println(x.getFirstName());
//////            ArrayList<Doctor> docs = x.getDoctorDirectory().getDoctorDirectory();
//            System.out.println("inside");
//            DoctorDirectory docd = x.getDoctorDirectory();
//            ArrayList<Doctor> docs = docd.getDoctorDirectory();
//            for (Doctor d : docs) {
//                System.out.println(d.getHospital());
//            }
////            System.out.println(x.getDoctorDirectory());
////            for (Doctor d : docs) {
//
////            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePatient = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPharmacy = new javax.swing.JLabel();
        txtPharmacy = new javax.swing.JTextField();
        lblPatientDetails = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblInsurance = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtInsurance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnDoctors = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        btnCreatePatient.setBackground(new java.awt.Color(51, 102, 255));
        btnCreatePatient.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnCreatePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 102, 255));
        btnBack.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<- Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPharmacy.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblPharmacy.setForeground(new java.awt.Color(255, 255, 255));
        lblPharmacy.setText("Preferred Pharmacy");

        txtPharmacy.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        lblPatientDetails.setFont(new java.awt.Font("Operator Mono", 1, 24)); // NOI18N
        lblPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientDetails.setText("Create Patient");

        lblPatientID.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientID.setText("Patient ID");

        lblInsurance.setFont(new java.awt.Font("Operator Mono", 1, 13)); // NOI18N
        lblInsurance.setForeground(new java.awt.Color(255, 255, 255));
        lblInsurance.setText("Innsurance No.");

        txtPatientID.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        txtInsurance.setFont(new java.awt.Font("Operator Mono", 0, 13)); // NOI18N

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Doctors"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospitals"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHospital);

        btnDoctors.setText("view doctors");
        btnDoctors.setToolTipText("");
        btnDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(lblPatientDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoctors)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPharmacy)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblInsurance)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPatientID)
                                    .addGap(213, 213, 213)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(611, 611, 611)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGap(314, 314, 314)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientDetails)
                    .addComponent(btnBack))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientID))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInsurance))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPharmacy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnDoctors)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCreatePatient)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addGap(141, 141, 141)))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        // validations
        if (txtPatientID.getText().
                trim().equals("")
                || //                txtPDoctor.getText().trim().equals("") ||
                txtInsurance.getText().
                        trim().equals("") || txtPharmacy.getText().
                trim().equals("")
                || //                !isLetter(txtPDoctor.getText()) ||
                !isLetter(txtPharmacy.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter appropriate values!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            long pid = Long.parseLong(txtPatientID.getText());
            int ins = Integer.parseInt(txtInsurance.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter appropriate ID and Insurance values!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int selectedRow = tblHospital.getSelectedRow();
        int selectedRowDoc = tblDoctor.getSelectedRow();
        Hospital hosp = (Hospital) tblHospital.getValueAt(selectedRow, 0);
        Doctor doc = (Doctor) tblDoctor.getValueAt(selectedRowDoc, 0);
        Patient patient = new Patient();
//        Doctor doctornew = new Doctor();
//        doctornew.setFirstName(txtPDoctor.getText());
        patient.setPatientID(Long.parseLong(txtPatientID.getText()));
        patient.setDoctor(doc);
        patient.setHospital(hosp);
        patient.setInsuranceID(Integer.parseInt(txtInsurance.getText()));
        patient.setPharmacy(txtPharmacy.getText());
//        patient = patientDirectory.AddPatient();
//        doc.setPatientDirectory(patientDirectory);

        // Add the patient to the Person Directory
        person.setPatient(patient);
//        person = personDirectory.AddPerson();
        JOptionPane.showMessageDialog(this, "Successfully created a patient!",
                "Update", JOptionPane.INFORMATION_MESSAGE);
        clearInputs();
  }//GEN-LAST:event_btnCreatePatientActionPerformed

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

    private void btnDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHospital.getSelectedRow();
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(this,
//                    "Please select a Hospital from table above to make them a patient!",
//                    "Error", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        Hospital hospital = (Hospital) tblHospital.getValueAt(selectedRow, 0);
        System.out.println(hospital.getName());
//        DoctorDirectory newDoc = (DoctorDirectory) (doctorDirectory.getDoctorDirectory());
        ArrayList<Doctor> doctorsHosp = new ArrayList<>();
//        ArrayList<Doctor> doctors = doctorDirectory.getHospitalDoctorDirectory(hospital.getName());
        for (Doctor docx : doctorlist) {
            System.out.println("yo");
            if (docx.getHospital().getName().equals(hospital.getName())) {
                doctorsHosp.add(docx);
            }

        }
        populateDoctorTable(doctorsHosp);
    }//GEN-LAST:event_btnDoctorsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDoctors;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblInsurance;
    private javax.swing.JLabel lblPatientDetails;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPharmacy;
    // End of variables declaration//GEN-END:variables

    private void clearInputs() {
        txtPatientID.setText("");
//        txtPDoctor.setText("");
        txtInsurance.setText("");
        txtPharmacy.setText("");
    }

    private boolean isDigit(String s) {
        char[] chArr = s.toCharArray();
        for (char c : chArr) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isLetter(String s) {
        char[] chArr = s.toCharArray();
        for (char c : chArr) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private void populateHospitalTable(ArrayList<Hospital> hospitals) {
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        model.setRowCount(0);

        if (hospitals.isEmpty()) {
            JOptionPane.
                    showMessageDialog(this, "No hospitals found! Please add a hospital to community!",
                            "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Hospital p : hospitals) {
            Object[] row = new Object[1];
            row[0] = p;

//            if (p.getName() != null) {
//                row[1] = p.getName();
//            } else {
//                row[1] = "Hospital not created.";
//            }
            model.addRow(row);
        }

    }

    private void populateDoctorTable(ArrayList<Doctor> doctors) {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);

        if (doctors.isEmpty()) {
            JOptionPane.
                    showMessageDialog(this, "No hospitals found! Please add a hospital to community!",
                            "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Doctor p : doctors) {
            Object[] row = new Object[1];
            row[0] = p;

//            if (p.getName() != null) {
//                row[1] = p.getName();
//            } else {
//                row[1] = "Hospital not created.";
//            }
            model.addRow(row);
        }
    }
}
