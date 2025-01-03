/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Farmer.workerWorkArea;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akasharokianathan
 */
public class FarmerWorkerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;

    /**
     * Creates new form FarmerWorkerWorkAreaJPanel
     */
    public FarmerWorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;

        populateLoginDetails();
    }

  
    private void populateLoginDetails() {
        double quantity = 0;
        lblName.setText(lblName.getText() + " " + account.getEmployee().getName());
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                quantity += cwr.getTotalQuantity();
            }
        }
        lblWastageValue.setText(quantity + " pounds");
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
        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblWastage = new javax.swing.JLabel();
        lblWastageValue = new javax.swing.JLabel();
        btnCollectionReq = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Farmer Worker Work Area");

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Welcome, ");

        lblWastage.setForeground(new java.awt.Color(255, 255, 255));
        lblWastage.setText("Total wastage avoided :");

        lblWastageValue.setForeground(new java.awt.Color(255, 255, 255));
        lblWastageValue.setText("<wastage_avoided>");

        btnCollectionReq.setText("Raise Collection Request");
        btnCollectionReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionReqActionPerformed(evt);
            }
        });

        btnLog.setText("View Request Log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblWastage)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWastageValue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCollectionReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWastage)
                    .addComponent(lblWastageValue))
                .addGap(33, 33, 33)
                .addComponent(btnCollectionReq)
                .addGap(27, 27, 27)
                .addComponent(btnLog)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectionReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionReqActionPerformed
        FarmerWorkerRaiseRequestJPanel restaurantWorkerRaiseRequestJPanel = new FarmerWorkerRaiseRequestJPanel(userProcessContainer, account, enterprise.getName(), network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerRaiseRequestJPanel", restaurantWorkerRaiseRequestJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCollectionReqActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        FarmerWorkerViewRequestLogJPanel restaurantWorkerViewRequestLogJPanel = new FarmerWorkerViewRequestLogJPanel(userProcessContainer, account);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerViewRequestLogJPanel", restaurantWorkerViewRequestLogJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectionReq;
    private javax.swing.JButton btnLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWastage;
    private javax.swing.JLabel lblWastageValue;
    // End of variables declaration//GEN-END:variables
}
