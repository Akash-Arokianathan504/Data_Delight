/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.customer.Customer;
import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.restaurant.RestaurantWorkerOrganization;
import business.userAccount.UserAccount;
import business.util.food.Food;
import business.util.request.RequestStatus;
import business.util.validation.Validation;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import userInterface.customer.customers.CustomerWorkAreaJPanel;

/**
 *
 * @author indap.n
 */
public class MainJFrame extends javax.swing.JFrame implements Runnable {

    private final int MINUTES = 2;
    public EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        RequestStatus.initalizePickupRequestStatusMap();
        RequestStatus.initializeInvoiceStatusMap();
        RequestStatus.initializeShortageStatusListMap();
        Food.initializeFood();
        try {
    ImageIcon logoIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("images/logo.png"))
        .getImage()
        .getScaledInstance(500, 200, java.awt.Image.SCALE_SMOOTH));
    imgLbl.setIcon(logoIcon); 
    imgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    imgLbl.setPreferredSize(new java.awt.Dimension(500, 200)); 
} catch (Exception e) {
    System.out.println("Image not found: " + e.getMessage());
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RegistrationJPanel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        mainPagePanel = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPane.setBackground(new java.awt.Color(102, 204, 255));

        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name:");

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Panel");

        RegistrationJPanel.setText("Sign Up");
        RegistrationJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationJPanelActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("If you are a new customer sign up!");

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUserName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword)))
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(leftPaneLayout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addGap(72, 72, 72)
                                        .addComponent(btnLogout))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(RegistrationJPanel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(31, 31, 31)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLogout))
                .addGap(40, 40, 40)
                .addComponent(RegistrationJPanel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        splitPane.setLeftComponent(leftPane);

        userProcessContainer.setBackground(new java.awt.Color(204, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        mainPagePanel.setBackground(new java.awt.Color(102, 204, 255));
        mainPagePanel.setForeground(new java.awt.Color(255, 255, 255));

        lblHeading.setFont(new java.awt.Font("Tw Cen MT", 0, 52)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("Food Wastage Management");

        lblText.setBackground(new java.awt.Color(51, 153, 255));
        lblText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("<HTML>Donate your leftover food instead of wasting it.<br/>Help feed the needy.<br/>Reduce your carbon footprint</HTML>");

        javax.swing.GroupLayout mainPagePanelLayout = new javax.swing.GroupLayout(mainPagePanel);
        mainPagePanel.setLayout(mainPagePanelLayout);
        mainPagePanelLayout.setHorizontalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPagePanelLayout.createSequentialGroup()
                        .addComponent(lblHeading)
                        .addContainerGap(248, Short.MAX_VALUE))
                    .addGroup(mainPagePanelLayout.createSequentialGroup()
                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPagePanelLayout.setVerticalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(496, 496, 496))
        );

        userProcessContainer.add(mainPagePanel, "card2");

        splitPane.setRightComponent(userProcessContainer);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

     String userName = null;
    if (Validation.validateStringInput(txtUserName)) {
        userName = txtUserName.getText();
    } else {
        return;
    }

    char[] passChar = txtPassword.getPassword();
    if (passChar == null) {
        JOptionPane.showMessageDialog(null, "Input cannot be blank", "Warning", JOptionPane.WARNING_MESSAGE);
        txtPassword.setBackground(Color.RED);
        return;
    }

    UserAccount ua = new UserAccount();
    String password = ua.encodePassword(String.valueOf(passChar));

    Enterprise inEnterprise = null;
    Organization inOrganization = null;
    Network network = null;

    // First, try to authenticate the user in the enterprise/organization
    ua = system.getUserAccountDirectory().searchUser(userName, password);

    if (ua == null) {
        // If not found in the UserAccountDirectory, check in the networks and enterprises
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                // Search in enterprise-level accounts
                ua = e.getUserAccountDirectory().searchUser(userName, password);
                if (ua == null) {
                    // If not found, check in organization-level accounts
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        ua = o.getUserAccountDirectory().searchUser(userName, password);
                        if (ua != null) {
                            inEnterprise = e;
                            inOrganization = o;
                            network = n;
                            break;
                        }
                    }
                } else {
                    inEnterprise = e;
                    network = n;
                    break;
                }
                if (inOrganization != null) {
                    break;
                }
            }
            if (network != null) {
                break;
            }
        }
    }

    // Check for customer login if ua is still null
    if (ua == null) {
        // Debugging: Check if we're hitting the customer authentication part
        System.out.println("Trying customer login...");

        // Try to authenticate the customer using the customer directory
        Customer customer = system.getCustomerDirectory().searchCustomer(userName, password);

        if (customer != null) {
            // If the customer is authenticated
            System.out.println("Customer authenticated successfully");

            // Proceed to customer work area
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("CustomerWorkAreaJPanel", new CustomerWorkAreaJPanel(userProcessContainer, customer,system));
            layout.next(userProcessContainer);

            // Disable login components
            txtUserName.setText("");
            txtPassword.setText("");
            btnLogin.setEnabled(false);
            btnLogout.setEnabled(true);
            return;
        } else {
            // Debugging: If the customer authentication failed
            System.out.println("Customer authentication failed. Invalid credentials.");
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
    }

    // If user account is found for enterprise or organization, proceed
    if (ua != null) {
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WorkArea", ua.getRole().createWorkArea(userProcessContainer, ua, inOrganization, inEnterprise, system, network));
        layout.next(userProcessContainer);

        // Disable login components
        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        btnLogin.setEnabled(true);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);

        txtUserName.setText("");
        txtPassword.setText("");

        userProcessContainer.removeAll();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        MainPageJPanel mpjp = new MainPageJPanel();
        userProcessContainer.add("NGORequestViewJPanel", mpjp);
        layout.next(userProcessContainer);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void RegistrationJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationJPanelActionPerformed
        // TODO add your handling code here:
    String userName = JOptionPane.showInputDialog("Enter Username:");
    String password = JOptionPane.showInputDialog("Enter Password:");
    String gender = JOptionPane.showInputDialog("Enter gender:");

    if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please provide valid username and password.");
        return;
    }
    UserAccount us = new UserAccount();
    String hashedPassword = us.encodePassword(password);
//    Customer newCustomer = new Customer(userName, hashedPassword,gender);
        System.out.println(userName+" "+hashedPassword+""+gender);
    system.getCustomerDirectory().addCustomer(userName,hashedPassword,gender);

    JOptionPane.showMessageDialog(null, "Registration successful! You can now log in.");
        
    
    }//GEN-LAST:event_RegistrationJPanelActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame jFrame = new MainJFrame();
                jFrame.setVisible(true);
                Thread thread = new Thread(jFrame);
                thread.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrationJPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel mainPagePanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("********* INSIDE PERISHABLE UPDATE *********");
                Thread.sleep(1000 * 60 * MINUTES);
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                        // Update perishable time for all the restaurant worker's work queue
                        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Restaurant)) {
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof RestaurantWorkerOrganization) {
                                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                        for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                                            CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                                            System.out.println("\n********** Updating Perishable **********");
                                            cwr.updatePerishable();
                                            System.out.println("\n ********** Update Complete **********");
                                        }
                                    }
                                }
                            }
                        }
                        
                            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Farmer)) {
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof RestaurantWorkerOrganization) {
                                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                        for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                                            CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                                            System.out.println("\n********** Updating Perishable **********");
                                            cwr.updatePerishable();
                                            System.out.println("\n ********** Update Complete **********");
                                        }
                                    }
                                }
                            }
                        }

                        // Update NGO's inventory after perishable update
                        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO)) {
                            NGOEnterprise enterprise = (NGOEnterprise) e;
                            System.out.println("\nNGO name " + enterprise.getName());
                            enterprise.updateInventory();
                        }
                    }
                }
            } catch (InterruptedException ex) {
                // Thread sleep failed
            }
        }
    }
}
