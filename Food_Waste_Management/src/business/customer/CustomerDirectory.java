/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.customer;

/**
 *
 * @author Akass
 */
import business.userAccount.UserAccount;
import java.util.ArrayList;

public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    // Constructor
    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    // Getter for customer list
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    // Method to add a customer
    public Customer addCustomer(String username, String password, String gender) {
        Customer c = new Customer(username, password, gender);
        customerList.add(c);
        return c;
    }

    public Customer searchCustomer(String username, String password) {
    UserAccount us = new UserAccount();
    String hashedPassword = us.encodePassword(password);  // Hash the entered password
    for (Customer customer : customerList) {
        System.out.println(customerList);
        if (customer.getUsername().equals(username) && customer.getPassword().equals(hashedPassword)) {
            return customer;  // Successful login
        }
    }
    return null;  // Invalid credentials
}

    
    public boolean checkIfUserNameExists(String username) {
    for (Customer customer : customerList) {
        if (customer.getUsername().equals(username)) {
            return true; // Username exists
        }
    }
    return false; // Username is unique
}
    // Method to remove a customer
    public void removeCustomer(Customer c) {
        customerList.remove(c);
    }
}

