/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.logistics;

import business.organization.Organization;
import business.role.Role;
import business.role.logistics.LogisticsAdminRole;
import java.util.ArrayList;

/**
 *
 * @author akassh
 */
public class LogisticsAdminOrganization extends Organization{

    public LogisticsAdminOrganization() {
        super(Type.LogisticsAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticsAdminRole());
        return roles;
    }
    
}
