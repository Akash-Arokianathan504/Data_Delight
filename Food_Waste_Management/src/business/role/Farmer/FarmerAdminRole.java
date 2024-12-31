/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.Farmer;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Farmer.adminWorkArea.FarmerAdminWorkAreaJPanel;

/**
 *
 * @author akasharokianathan
 */
public class FarmerAdminRole extends Role {
     public FarmerAdminRole() {
        super(Role.RoleType.FarmerAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new FarmerAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
    
}
