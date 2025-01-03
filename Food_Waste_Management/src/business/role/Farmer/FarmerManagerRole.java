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
import userInterface.Farmer.managerWorkArea.FarmerManagerWorkAreaJPanel;

/**
 *
 * @author akasharokianathan
 */
public class FarmerManagerRole extends Role {
    
     public FarmerManagerRole() {
        super(Role.RoleType.FarmerManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new FarmerManagerWorkAreaJPanel(userProcessContainer, account, enterprise);
    }
    
}
