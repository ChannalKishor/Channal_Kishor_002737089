/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.CommunityAdminWorkspace;

import Hospital.City.CityDirectory;
import Hospital.Community.CommunityDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.House.HouseDirectory;
import Hospital.Patient.PatientDirectory;
import Hospital.VitalSigns.VitalSignDirectory;
import ui.LoginJFrame;

/**
 *
 * @author kishor
 */
public class CommunityAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminDashboard
     */
    private CommunityDirectory communityList;
    private CityDirectory cityList;
    private PatientDirectory patientList;
    private DoctorDirectory doctorList;
    private HospitalDirectory hospitalList;
    private HouseDirectory houseList;
    private EncounterDirectory encounterList;
    private VitalSignDirectory vitalSignList;
    
    public CommunityAdminDashboard(PatientDirectory patientList, DoctorDirectory doctorList,HospitalDirectory hospitalList,CityDirectory cityList,CommunityDirectory communityList,HouseDirectory houseList,EncounterDirectory encounterList,VitalSignDirectory vitalSignList) {
        initComponents();
        this.communityList = communityList;
        this.cityList = cityList;
        this.patientList = patientList;
        this.doctorList = doctorList; 
        this.hospitalList = hospitalList;
        this.houseList = houseList;
        this.encounterList = encounterList;
        this.vitalSignList = vitalSignList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnHouse = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCity.setText("City");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        btnCommunity.setText("Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnHouse.setText("House");
        btnHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnCity)
                .addGap(18, 18, 18)
                .addComponent(btnCommunity)
                .addGap(18, 18, 18)
                .addComponent(btnHouse)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(panelControl);

        panelWork.setBackground(new java.awt.Color(255, 204, 204));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("COMMUNITY ADMIN");

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(panelWorkLayout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle)
                .addGap(207, 207, 207)
                .addComponent(btnLogOut)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        SplitPane.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginJFrame loginJframe = new LoginJFrame(patientList, doctorList,cityList,communityList,hospitalList,houseList,encounterList,vitalSignList);
        loginJframe.setVisible(true);
        //        this.setX(1);
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        SplitPane.setRightComponent(panelWork);

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        CommunityCityPanel  cityJpanel = new CommunityCityPanel(cityList);
        SplitPane.setRightComponent(cityJpanel);
    }//GEN-LAST:event_btnCityActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        CommunityCommunityPanel communityJPanel = new CommunityCommunityPanel(communityList, cityList);
        SplitPane.setRightComponent(communityJPanel);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseActionPerformed
        // TODO add your handling code here:
        CommunityHousePanel housePanel = new CommunityHousePanel(houseList,cityList,communityList);
        SplitPane.setRightComponent(housePanel);
        
    }//GEN-LAST:event_btnHouseActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CommunityAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHouse;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelWork;
    // End of variables declaration//GEN-END:variables
}
