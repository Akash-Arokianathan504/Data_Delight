/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.Farmer;

import business.organization.Organization;
import business.role.Farmer.FarmerAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author akasharokianathan
 */
public class FarmerAdminOrganization extends Organization{
    
     public FarmerAdminOrganization() {
        super(Type.FarmerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FarmerAdminRole());
        return roles;
    }
    
}
