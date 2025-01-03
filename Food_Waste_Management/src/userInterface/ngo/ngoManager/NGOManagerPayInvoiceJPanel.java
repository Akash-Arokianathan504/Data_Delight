/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import business.organization.Organization;
import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import static business.util.request.RequestStatus.pickupRequestStatusList;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.PaymentWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akassh
 */
public class NGOManagerPayInvoiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManagerPayInvoiceJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount account;

    public NGOManagerPayInvoiceJPanel(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.account = account;
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

        lblHeader = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("NGO Manager - Pay Invoices");

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logistics Company", "Job Completion Date", "Request Status", "Cost", "Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
            tblDetails.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnPay.setText("Pay Invoice");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(512, 512, 512)
                                .addComponent(btnPay))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnPay))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select an invoice to pay",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            PaymentWorkRequest pwr = (PaymentWorkRequest) tblDetails.getValueAt(selectedRow, 0);
            if (pwr.getCollectionWorkRequest().getPaid()) {
                JOptionPane.showMessageDialog(null,
                        "Invoice has already been paid",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            pwr.setStatus(RequestStatus.getInvoiceStatusMessage(2));
            pwr.getCollectionWorkRequest().setPaid(true);

            //Assign to own queue
            account.getWorkQueue().getWorkRequestList().add(pwr);
                    
            JOptionPane.showMessageDialog(null, "Invoice Paid", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();

        }
    }//GEN-LAST:event_btnPayActionPerformed

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PaymentWorkRequest) {
                PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                CollectionWorkRequest cwr = pwr.getCollectionWorkRequest();
                if ((cwr.getStatus().equals(pickupRequestStatusList.get(5))) || (cwr.getStatus().equals(pickupRequestStatusList.get(6)))) {

                    Object row[] = new Object[5];
                    row[0] = pwr;
                    row[1] = cwr.getResolveDate();
                    row[2] = pwr.getStatus();
                    row[3] = "$" + cwr.getDeliveryCost();
                    row[4] = cwr.getPaid() ? "Yes" : "No";

                    dtm.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPay;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
