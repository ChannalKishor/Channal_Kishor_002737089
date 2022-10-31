/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CommunityAdminWorkspace;

import Hospital.City.City;
import Hospital.City.CityDirectory;
import Hospital.Doctor.Doctor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kishor
 */
public class CommunityCityPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityCityPanel
     */
    private CityDirectory cityList;
    
    public CommunityCityPanel(CityDirectory cityList) {
        initComponents();
        this.cityList = cityList;
        btnSave.setVisible(false);
        btnClear.setVisible(false);
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

        ScrollPane = new javax.swing.JScrollPane();
        tableCity = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCityId = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtCityId = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        tableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "State", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(tableCity);

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

        lblCityId.setText("City Id: ");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblCountry.setText("Country:");

        txtCityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityIdActionPerformed(evt);
            }
        });

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

        lbltitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("COMMUNITY ADMIN: CITY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCityId)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCity)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblState)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnClear)
                                        .addComponent(lblCountry))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnDelete, btnEdit, btnView});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblCityId, lblCountry, lblState});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtCityId, txtCountry, txtState});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityId)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, btnDelete, btnEdit, btnView});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCity, lblCityId, lblCountry, lblState});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCity, txtCityId, txtCountry, txtState});

    }// </editor-fold>//GEN-END:initComponents

    private void txtCityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityIdActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int cityId = Integer.parseInt(txtCityId.getText());
        String name = txtCity.getText();
        String state = txtState.getText();
        String country = txtCountry.getText();
        
        City newCity = cityList.addCity();
        
        newCity.setCityId(cityId);
        newCity.setCityName(name);
        newCity.setState(state);
        newCity.setCountry(country);
        
        JOptionPane.showMessageDialog(this, "City Created Successfully");
        
        txtCityId.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtCountry.setText("");
        
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(true);
        
        Integer selectedRowIndex = tableCity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
            City selectedCity = (City) model.getValueAt(selectedRowIndex,0);
            
            txtCityId.setText(String.valueOf(selectedCity.getCityId()));
            txtCity.setText(selectedCity.getCityName());
            txtState.setText(selectedCity.getState());
            txtCountry.setText(selectedCity.getCountry());
        }
            
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtCityId.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtCountry.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(true);
        Integer selectedRowIndex = tableCity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        else{

            DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
            City selectedCity = (City) model.getValueAt(selectedRowIndex,0);
            
            txtCityId.setText(String.valueOf(selectedCity.getCityId()));
            txtCity.setText(selectedCity.getCityName());
            txtState.setText(selectedCity.getState());
            txtCountry.setText(selectedCity.getCountry());
        }
            
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableCity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
            City selectedCity = (City) model.getValueAt(selectedRowIndex,0);
            
            selectedCity.setCityId(Integer.parseInt(txtCityId.getText()));
            selectedCity.setCityName(txtCity.getText());
            selectedCity.setState(txtState.getText());
            selectedCity.setCountry(txtCountry.getText());
            
            JOptionPane.showMessageDialog(this, "Community details updated successfully.");

            populateTable();
        }
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(false);
        Integer selectedRowIndex = tableCity.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
            City selectedCity = (City) model.getValueAt(selectedRowIndex,0);

            cityList.deleteCity(selectedCity);

            JOptionPane.showMessageDialog(this, "City deleted successfully.");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
        model.setRowCount(0);
        
        for(City city : cityList.getCityList()){
            
            Object[] row = new Object[6];
            row[0] = city; 
            row[1] = city.getState();
            row[2] = city.getCountry();
          
             
            model.addRow(row);
        }
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
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tableCity;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
