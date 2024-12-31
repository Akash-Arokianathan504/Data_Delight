/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author akasharokianathan
 */
public class FarmerEnterprise extends Enterprise {
public FarmerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Farmer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
