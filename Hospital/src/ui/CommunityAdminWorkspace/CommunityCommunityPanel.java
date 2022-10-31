/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CommunityAdminWorkspace;

import Hospital.City.City;
import Hospital.City.CityDirectory;
import Hospital.Community.Community;
import Hospital.Community.CommunityDirectory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kishor
 */
public class CommunityCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityCommunityPanel
     */
    private CommunityDirectory communityList;
    private CityDirectory cityList;
    
    public CommunityCommunityPanel(CommunityDirectory communityList, CityDirectory cityList) {
        initComponents();
        this.communityList = communityList;
        this.cityList = cityList;
        btnSave.setVisible(false);
        btnClear.setVisible(false);
        populateTable();
        populateCity();
        populateState();
        populateCountry();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tableCommunity = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCommunityId = new javax.swing.JLabel();
        txtCommunityId = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JComboBox<>();
        txtState = new javax.swing.JComboBox<>();
        txtCountry = new javax.swing.JComboBox<>();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Community Screen");

        tableCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community", "State", "Zip Code", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(tableCommunity);

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

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCommunityId.setText("Community Id:");

        txtCommunityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIdActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community:");

        lblState.setText("State:");

        lblCountry.setText("Country:");

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

        lblCity.setText("City:");

        lblZipCode.setText("Zip Code:");

        txtCity.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtCityComponentShown(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunityId)
                                .addGap(18, 18, 18)
                                .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCity)
                                    .addComponent(lblState))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(txtCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(txtState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblZipCode)
                                    .addComponent(lblCountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityId)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int communityId = Integer.parseInt(txtCommunityId.getText());
        String community = txtCommunity.getText();
//        String city = txtCity.getText();
        String city = String.valueOf(txtCity.getSelectedItem());
        String state = String.valueOf(txtState.getSelectedItem());
        String zipCode = txtZipCode.getText();
        String country = String.valueOf(txtCountry.getSelectedItem());

        Community newComm = communityList.addCommunity();

        newComm.setCommunityId(communityId);
        newComm.setCommunityName(community);
        newComm.setCityName(city);
        newComm.setState(state);
        newComm.setZipCode(WIDTH);
        newComm.setCountry(country);

        JOptionPane.showMessageDialog(this, "Community Created Successfully");

        txtCommunityId.setText("");
        txtCommunity.setText("");
        txtCity.setSelectedIndex(0);
        txtState.setSelectedIndex(0);
        txtCountry.setSelectedIndex(0);
        txtZipCode.setText("");
        
        populateTable();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(true);

        Integer selectedRowIndex = tableCommunity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCommunity.getModel();
            Community selectedComm = (Community) model.getValueAt(selectedRowIndex,0);

            txtCommunityId.setText(String.valueOf(selectedComm.getCommunityId()));
            txtCommunity.setText(selectedComm.getCommunityName());
            txtCity.setSelectedItem(selectedComm.getCityName());
            txtState.setSelectedItem(selectedComm.getState());
            txtZipCode.setText(String.valueOf(selectedComm.getZipCode()));
            txtCountry.setSelectedItem(selectedComm.getCountry());
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(true);
        Integer selectedRowIndex = tableCommunity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        else{

            DefaultTableModel model = (DefaultTableModel) tableCommunity.getModel();
            Community selectedComm = (Community) model.getValueAt(selectedRowIndex,0);

            txtCommunityId.setText(String.valueOf(selectedComm.getCommunityId()));
            txtCommunity.setText(selectedComm.getCommunityName());
            txtCity.setSelectedItem(selectedComm.getCityName());
            txtState.setSelectedItem(selectedComm.getState());
            txtZipCode.setText(String.valueOf(selectedComm.getZipCode()));
            txtCountry.setSelectedItem(selectedComm.getCountry());
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(false);
        Integer selectedRowIndex = tableCommunity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCommunity.getModel();
            Community selectedComm = (Community) model.getValueAt(selectedRowIndex,0);

            communityList.deleteCommunity(selectedComm);

            JOptionPane.showMessageDialog(this, "City deleted successfully.");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableCommunity.getModel();
        model.setRowCount(0);
        
        for(Community community : communityList.getCommunityList()){
            
            Object[] row = new Object[6];
            row[0] = community; 
            row[1] = community.getState();
            row[2] = community.getZipCode();
            row[3] = community.getCountry();
          
             
            model.addRow(row);
        }
    }
    private void txtCommunityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtCommunityId.setText("");
        txtCommunity.setText("");
        txtCity.setSelectedIndex(0);
        txtState.setSelectedIndex(0);
        txtZipCode.setText("");
        txtCountry.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableCommunity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCommunity.getModel();
            Community selectedComm = (Community) model.getValueAt(selectedRowIndex,0);

            selectedComm.setCommunityId(Integer.parseInt(txtCommunityId.getText()));
            selectedComm.setCommunityName(txtCommunity.getText());
            selectedComm.setCityName(String.valueOf(txtCity.getSelectedItem()));
            selectedComm.setState(String.valueOf(txtState.getSelectedItem()));
            selectedComm.setZipCode(Long.parseLong(txtZipCode.getText()));
            selectedComm.setCountry(String.valueOf(txtCountry.getSelectedItem()));

            JOptionPane.showMessageDialog(this, "Community details updated successfully.");

            populateTable();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
//        System.out.println(cityList.cityArray());
       
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtCityComponentShown
        // TODO add your handling code here:
//         txtCity.setModel(new DefaultComboBoxModel<String>(cityList.cityArray()));
    }//GEN-LAST:event_txtCityComponentShown

    public void populateCity(){
        String[] cityArr = cityList.cityArray();
        DefaultComboBoxModel c = new DefaultComboBoxModel(cityArr);
        txtCity.setModel(c);
    }
    
    public void populateState(){
        String[] StateArr = cityList.stateArray();
        DefaultComboBoxModel s = new DefaultComboBoxModel(StateArr);
        txtState.setModel(s);
    }
    
    public void populateCountry(){
        String[] CountryArr = cityList.countryArray();
        DefaultComboBoxModel c = new DefaultComboBoxModel(CountryArr);
        txtCountry.setModel(c);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tableCommunity;
    private javax.swing.JComboBox<String> txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JComboBox<String> txtCountry;
    private javax.swing.JComboBox<String> txtState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}