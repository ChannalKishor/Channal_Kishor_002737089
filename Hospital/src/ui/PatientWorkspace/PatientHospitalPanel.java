/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.PatientWorkspace;

import Hospital.City.CityDirectory;
import Hospital.Community.CommunityDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.Hospital;
import Hospital.Hospital.HospitalDirectory;
import Hospital.House.HouseDirectory;
import Hospital.Patient.Patient;
import Hospital.Patient.PatientDirectory;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kishor
 */
public class PatientHospitalPanel extends javax.swing.JFrame {

    /**
     * Creates new form PatientHospitalPanel
     */
    private Patient patient;
    private CommunityDirectory communityList;
    private CityDirectory cityList;
    private PatientDirectory patientList;
    private DoctorDirectory doctorList;
    private HospitalDirectory hospitalList;
    private HouseDirectory houseList;
    private EncounterDirectory encounterList;
    
    public PatientHospitalPanel(Patient patient,PatientDirectory patientList, DoctorDirectory doctorList,HospitalDirectory hospitalList,CityDirectory cityList,CommunityDirectory communityList,HouseDirectory houseList,EncounterDirectory encounterList) {
        initComponents();
        this.patient = patient;
        this.communityList = communityList;
        this.cityList = cityList;
        this.patientList = patientList;
        this.doctorList = doctorList; 
        this.hospitalList = hospitalList;
        this.houseList = houseList;
        this.encounterList = encounterList;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        ScrollPaneHospital = new javax.swing.JScrollPane();
        tableHospital = new javax.swing.JTable();
        lbltitle2 = new javax.swing.JLabel();

        lbltitle1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbltitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle1.setText("PATIENT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setText("Search:");

        tableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital Id", "Hospital Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPaneHospital.setViewportView(tableHospital);

        lbltitle2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbltitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle2.setText("PATIENT: SEARCH HOSPITAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPaneHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(72, 72, 72)
                        .addComponent(lblSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbltitle2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch)
                    .addComponent(btnClose))
                .addGap(25, 25, 25)
                .addComponent(ScrollPaneHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchQuery = txtSearch.getText();
        Search(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void Search(String searchQuery){
        DefaultTableModel model = (DefaultTableModel) tableHospital.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        tableHospital.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchQuery));
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableHospital.getModel();
        model.setRowCount(0);

        for(Hospital hos : hospitalList.getHospitalList()){

            Object[] row = new Object[8];
            row[0] = hos; 
            row[1] = hos.getHospitalName();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientHospitalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHospitalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHospitalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHospitalPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PatientHospitalPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneHospital;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JLabel lbltitle2;
    private javax.swing.JTable tableHospital;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
