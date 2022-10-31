/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorWorkspace;

import Hospital.Doctor.Doctor;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.Encounter;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.Patient.PatientDirectory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kishor
 */
public class DoctorEncounter extends javax.swing.JPanel {

    /**
     * Creates new form DoctorEncounter
     */
    Doctor doctor;
    EncounterDirectory encounterList;
    HospitalDirectory hospitalList;
    PatientDirectory patientList;
    DoctorDirectory doctorList;
    
    public DoctorEncounter(Doctor doctor,EncounterDirectory encounterList,HospitalDirectory hospitalList,PatientDirectory patientList,DoctorDirectory doctorList) {
        initComponents();
        this.doctor = doctor;
        this.encounterList = encounterList;
        this.hospitalList = hospitalList;
        this.patientList = patientList;
        this.doctorList = doctorList;
        
        populateTable();
        populateHospital();
        populateDoctor();
        populatePatient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        scrollPaneEncounter = new javax.swing.JScrollPane();
        tableEncounter = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        lblEncounterNo = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblDoctorUsername = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblRoomNo = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JComboBox<>();
        txtDoctorUsername = new javax.swing.JComboBox<>();
        txtPatientusername = new javax.swing.JComboBox<>();
        txtPatientName = new javax.swing.JComboBox<>();
        lblRoomNo1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        lblHospital = new javax.swing.JLabel();
        txtHospital = new javax.swing.JComboBox<>();
        lblComments = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        lbltitle1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        tableEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Encounter No", "Doctor", "Patient", "Room No", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPaneEncounter.setViewportView(tableEncounter);

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane1.setViewportView(txtComment);

        lblEncounterNo.setText("Encounter No:");

        lblDoctorName.setText("Doctor Name:");

        lblDoctorUsername.setText("Doctor Username:");

        lblPatientName.setText("Patient Name:");

        lblCity.setText("Patient Username:");

        lblRoomNo.setText("Room No: ");

        txtRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNoActionPerformed(evt);
            }
        });

        lblRoomNo1.setText("Date: ");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTime.setText("Time:");

        lblHospital.setText("Hospital:");

        lblComments.setText("Comments:");

        txtEncounterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterNoActionPerformed(evt);
            }
        });

        lbltitle1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbltitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle1.setText("DOCTOR ADMIN: ENCOUNTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPaneEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctorUsername)
                            .addComponent(lblPatientName)
                            .addComponent(lblDoctorName)
                            .addComponent(lblHospital)
                            .addComponent(lblEncounterNo))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDoctorUsername, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDoctorName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPatientName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblRoomNo1)
                            .addComponent(lblRoomNo)
                            .addComponent(lblComments)
                            .addComponent(lblTime))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDate)
                            .addComponent(txtRoomNo)
                            .addComponent(txtTime)
                            .addComponent(txtPatientusername, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnEdit1, btnView});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit1))
                    .addComponent(scrollPaneEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPatientusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRoomNo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblRoomNo1)))
                        .addGap(18, 18, 18)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEncounterNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospital)
                            .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorName)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorUsername)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComments))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addGap(44, 44, 44))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, btnEdit1, btnView});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //        btnClear.setVisible(false);
        String encounterNo = txtEncounterNo.getText();
        String hospital = String.valueOf(txtHospital.getSelectedItem());
        String doctorName = String.valueOf(txtDoctorName.getSelectedItem());
        String doctorUsername = String.valueOf(txtDoctorUsername.getSelectedItem());
        String patientName = String.valueOf(txtPatientName.getSelectedItem());
        String patientUsername = String.valueOf(txtPatientusername.getSelectedItem());
        Integer roomNo = Integer.parseInt(txtRoomNo.getText());
        String date = txtDate.getText();
        String time = txtTime.getText();
        String comment = txtComment.getText();

        Encounter newEncounter = encounterList.addEncounter();

        newEncounter.setEncounterNo(encounterNo);
        newEncounter.setHospital(hospital);
        newEncounter.setDoctorName(doctorName);
        newEncounter.setDoctorUserName(doctorUsername);
        newEncounter.setPatientName(patientName);
        newEncounter.setPatientUsername(patientUsername);
        newEncounter.setRooomNo(roomNo);
        newEncounter.setDate(date);
        newEncounter.setTime(time);
        newEncounter.setComment(comment);

        JOptionPane.showMessageDialog(this, "Encounter Created Successfully");

        txtEncounterNo.setText("");
        txtHospital.setSelectedIndex(0);
        txtDoctorName.setSelectedIndex(0);
        txtDoctorUsername.setSelectedIndex(0);
        txtPatientName.setSelectedIndex(0);
        txtPatientusername.setSelectedIndex(0);
        txtRoomNo.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtComment.setText("");

        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        //        btnSave.setVisible(false);
        btnClear.setVisible(true);
        Integer selectedRowIndex = tableEncounter.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
            Encounter selectedEn = (Encounter) model.getValueAt(selectedRowIndex,0);

            txtEncounterNo.setText(selectedEn.getEncounterNo());
            txtHospital.setSelectedItem(selectedEn.getHospital());
            txtDoctorName.setSelectedItem(selectedEn.getDoctorName());
            txtDoctorUsername.setSelectedItem(selectedEn.getDoctorUserName());
            txtPatientName.setSelectedItem(selectedEn.getPatientName());
            txtPatientusername.setSelectedItem(selectedEn.getPatientUsername());
            txtRoomNo.setText(String.valueOf(selectedEn.getRooomNo()));
            txtDate.setText(selectedEn.getDate());
            txtTime.setText(selectedEn.getTime());
            txtComment.setText(selectedEn.getComment());

        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(true);
        btnClear.setVisible(true);

        Integer selectedRowIndex = tableEncounter.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
            Encounter selectedEn = (Encounter) model.getValueAt(selectedRowIndex,0);

            txtEncounterNo.setText(selectedEn.getEncounterNo());
            txtHospital.setSelectedItem(selectedEn.getHospital());
            txtDoctorName.setSelectedItem(selectedEn.getDoctorName());
            txtDoctorUsername.setSelectedItem(selectedEn.getDoctorUserName());
            txtPatientName.setSelectedItem(selectedEn.getPatientName());
            txtPatientusername.setSelectedItem(selectedEn.getPatientUsername());
            txtRoomNo.setText(String.valueOf(selectedEn.getRooomNo()));
            txtDate.setText(selectedEn.getDate());
            txtTime.setText(selectedEn.getTime());
            txtComment.setText(selectedEn.getComment());

        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void txtRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtEncounterNo.setText("");
        txtHospital.setSelectedIndex(0);
        txtDoctorName.setSelectedIndex(0);
        txtDoctorUsername.setSelectedIndex(0);
        txtPatientName.setSelectedIndex(0);
        txtPatientusername.setSelectedIndex(0);
        txtRoomNo.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtComment.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableEncounter.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
            Encounter selectedEn = (Encounter) model.getValueAt(selectedRowIndex,0);

            selectedEn.setEncounterNo(txtEncounterNo.getText());
            selectedEn.setHospital(String.valueOf(txtHospital.getSelectedItem()));
            selectedEn.setDoctorName(String.valueOf(txtDoctorName.getSelectedItem()));
            selectedEn.setDoctorUserName(String.valueOf(txtDoctorUsername.getSelectedItem()));
            selectedEn.setPatientName(String.valueOf(txtPatientName.getSelectedItem()));
            selectedEn.setPatientUsername(String.valueOf((txtPatientusername.getSelectedItem())));
            selectedEn.setRooomNo(Integer.parseInt(txtRoomNo.getText()));
            selectedEn.setDate(txtDate.getText());
            selectedEn.setTime(txtTime.getText());
            selectedEn.setComment(txtComment.getText());

            JOptionPane.showMessageDialog(this, "Encounter details updated successfully.");

            populateTable();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public void populateTable(){
        
        
        DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
        model.setRowCount(0);
        
        for(Encounter en : encounterList.getEncounterList()){
            
            if (doctor.getUsername().equals(en.getDoctorUserName())){
                Object[] row = new Object[6];
                row[0] = en; 
                row[1] = en.getHospital();
                row[2] = en.getDoctorName();
                row[3] = en.getPatientName();
                row[4] = en.getDate();
                row[5] = en.getTime();


                model.addRow(row);
            } 
        }
    }
    
    public void populateHospital(){
        String[] hosArr = hospitalList.hosArray();
        DefaultComboBoxModel h = new DefaultComboBoxModel(hosArr);
        txtHospital.setModel(h);
    }
    
    public void populateDoctor(){
        String[] docNameArr = doctorList.docNameArray();
        DefaultComboBoxModel dn = new DefaultComboBoxModel(docNameArr);
        txtDoctorName.setModel(dn);
        
        String[] docUnameArr = doctorList.docUnameArray();
        DefaultComboBoxModel du = new DefaultComboBoxModel(docUnameArr);
        txtDoctorUsername.setModel(du);   
    }
    
    public void populatePatient(){
        String[] patNameArr = patientList.patNameArray();
        DefaultComboBoxModel pn = new DefaultComboBoxModel(patNameArr);
        txtPatientName.setModel(pn);
        
        String[] patUnameArr = patientList.patUnameArray();
        DefaultComboBoxModel pu = new DefaultComboBoxModel(patUnameArr);
        txtPatientusername.setModel(pu);
    }
    
    private void txtEncounterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorUsername;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblRoomNo1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JScrollPane scrollPaneEncounter;
    private javax.swing.JTable tableEncounter;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtDate;
    private javax.swing.JComboBox<String> txtDoctorName;
    private javax.swing.JComboBox<String> txtDoctorUsername;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JComboBox<String> txtHospital;
    private javax.swing.JComboBox<String> txtPatientName;
    private javax.swing.JComboBox<String> txtPatientusername;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
