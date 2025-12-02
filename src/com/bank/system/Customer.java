// Customer.java
package com.bank.system;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String username;
    private String passwordHash;
    private String phone;

    public Customer(int customerId, String firstName, String lastName, String username, String passwordHash, String phone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.passwordHash = passwordHash;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}