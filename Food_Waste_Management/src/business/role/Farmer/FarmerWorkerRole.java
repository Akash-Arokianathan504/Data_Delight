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
import userInterface.Farmer.workerWorkArea.FarmerWorkerWorkAreaJPanel;

/**
 *
 * @author akasharokianathan
 */
public class FarmerWorkerRole extends Role{
    public FarmerWorkerRole() {
        super(Role.RoleType.FarmerWorker);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new FarmerWorkerWorkAreaJPanel(userProcessContainer, account, enterprise, network);
    }
    
}
