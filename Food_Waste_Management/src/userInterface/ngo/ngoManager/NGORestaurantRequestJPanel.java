/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.logistics.LogisticsManagerOrganization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akash
 */
public class NGORestaurantRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGORestaurantRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    
    public NGORestaurantRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblRestaurantRequests = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanelAssignToEmployee = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        lblWorker = new javax.swing.JLabel();
        cmbWorker = new javax.swing.JComboBox();
        btnApprove = new javax.swing.JButton();
        jPanelRedirectToNGO = new javax.swing.JPanel();
        btnAssignNGO = new javax.swing.JButton();
        lblMessageRedirect = new javax.swing.JLabel();
        txtMessageRedirect = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 255, 204));

        tblRestaurantRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Recieved Date", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblRestaurantRequests);
        if (tblRestaurantRequests.getColumnModel().getColumnCount() > 0) {
            tblRestaurantRequests.getColumnModel().getColumn(0).setResizable(false);
            tblRestaurantRequests.getColumnModel().getColumn(1).setResizable(false);
            tblRestaurantRequests.getColumnModel().getColumn(2).setResizable(false);
            tblRestaurantRequests.getColumnModel().getColumn(3).setResizable(false);
        }

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("NGO Manager- Producer Requests");

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanelAssignToEmployee.setBackground(new java.awt.Color(204, 255, 204));
        jPanelAssignToEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Assign to Employee"));

        lblMessage.setText("Message:");

        lblWorker.setText("Worker:");

        cmbWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWorkerActionPerformed(evt);
            }
        });

        btnApprove.setText("Assign");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAssignToEmployeeLayout = new javax.swing.GroupLayout(jPanelAssignToEmployee);
        jPanelAssignToEmployee.setLayout(jPanelAssignToEmployeeLayout);
        jPanelAssignToEmployeeLayout.setHorizontalGroup(
            jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssignToEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAssignToEmployeeLayout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanelAssignToEmployeeLayout.createSequentialGroup()
                        .addComponent(lblWorker)
                        .addGap(17, 17, 17)))
                .addGroup(jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbWorker, 0, 176, Short.MAX_VALUE)
                    .addComponent(txtMessage))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAssignToEmployeeLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnApprove)
                .addContainerGap())
        );
        jPanelAssignToEmployeeLayout.setVerticalGroup(
            jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssignToEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbWorker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWorker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAssignToEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage))
                .addGap(38, 38, 38)
                .addComponent(btnApprove)
                .addGap(11, 11, 11))
        );

        jPanelRedirectToNGO.setBackground(new java.awt.Color(204, 255, 204));
        jPanelRedirectToNGO.setBorder(javax.swing.BorderFactory.createTitledBorder("Redirect to other NGO"));

        btnAssignNGO.setText("Redirect");
        btnAssignNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignNGOActionPerformed(evt);
            }
        });

        lblMessageRedirect.setText("Message:");

        javax.swing.GroupLayout jPanelRedirectToNGOLayout = new javax.swing.GroupLayout(jPanelRedirectToNGO);
        jPanelRedirectToNGO.setLayout(jPanelRedirectToNGOLayout);
        jPanelRedirectToNGOLayout.setHorizontalGroup(
            jPanelRedirectToNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRedirectToNGOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRedirectToNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRedirectToNGOLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnAssignNGO))
                    .addGroup(jPanelRedirectToNGOLayout.createSequentialGroup()
                        .addComponent(lblMessageRedirect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMessageRedirect)))
                .addContainerGap())
        );
        jPanelRedirectToNGOLayout.setVerticalGroup(
            jPanelRedirectToNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRedirectToNGOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRedirectToNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessageRedirect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessageRedirect))
                .addGap(59, 59, 59)
                .addComponent(btnAssignNGO)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelRedirectToNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelAssignToEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnView)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAssignToEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelRedirectToNGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnBack)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurantRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            CollectionWorkRequest cwr = (CollectionWorkRequest) tblRestaurantRequests.getValueAt(selectedRow, 3);
            
            NGORestaurantRequestViewJPanel restaurantWorkerViewLogItemJPanel = new NGORestaurantRequestViewJPanel(userProcessContainer, cwr);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RestaurantWorkerViewLogItemJPanel", restaurantWorkerViewLogItemJPanel);
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblRestaurantRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblRestaurantRequests.getValueAt(selectedRow, 3);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(1))||request.getStatus().equals(RequestStatus.getPickupStatusMessage(7))) {
                
                int selectedEmployee = cmbWorker.getSelectedIndex();
                if (selectedEmployee < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Please select an employee to assign the request to",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                request.setSender(account);
                request.setStatus(RequestStatus.getPickupStatusMessage(2));
                request.setMessage(txtMessage.getText());
                request.setDeliverToNGO(enterprise.getName());
                
                UserAccount acc = (UserAccount) cmbWorker.getSelectedItem();
                request.setDeliverTo(acc);

                // Adding to own queue
                account.getWorkQueue().getWorkRequestList().add(request);

                // Adding to Logistics Manager Organization queue
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof LogisticsManagerOrganization) {
                            o.getWorkQueue().getWorkRequestList().add(request);
                            break;
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Request approved and forwarded to logistics", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateTable();
                txtMessage.setText("");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request already processed by you",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void cmbWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWorkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWorkerActionPerformed

    private void btnAssignNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignNGOActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblRestaurantRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblRestaurantRequests.getValueAt(selectedRow, 3);
            String message = txtMessageRedirect.getText();
            
            NGOOtherRegionsRequestJPanel ngoOtherRegionsRequestJPanel = new NGOOtherRegionsRequestJPanel(userProcessContainer, request, organization, account, network, message);
            userProcessContainer.add("NGOOtherRegionsRequestJPanel", ngoOtherRegionsRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);            
            txtMessageRedirect.setText("");
        }
        

    }//GEN-LAST:event_btnAssignNGOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssignNGO;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cmbWorker;
    private javax.swing.JPanel jPanelAssignToEmployee;
    private javax.swing.JPanel jPanelRedirectToNGO;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageRedirect;
    private javax.swing.JLabel lblWorker;
    private javax.swing.JTable tblRestaurantRequests;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessageRedirect;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurantRequests.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;

                // View only newly raised requests
                if (cwr.getStatus().equals(RequestStatus.getPickupStatusMessage(1)) || 
    cwr.getStatus().equals(RequestStatus.getPickupStatusMessage(7))) {
                    Object row[] = new Object[4];
                    
                    row[0] = cwr.getRaisedByRestaurant();
                    row[1] = cwr.getRequestDate();
                    row[2] = cwr.getMessage();
                    row[3] = cwr;
                    
                    dtm.addRow(row);
                }
            }
        }
    }
    
    private void populateComboBox() {
        cmbWorker.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                if (user.getRole().getRoleType().getValue().equals(Role.RoleType.NGOWorker.getValue())) {
                    cmbWorker.addItem(user);
                }
            }
        }
    }
}
