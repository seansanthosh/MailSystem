package com.greatlearning.main;

import com.greatlearning.service.CredentialService;

public class Employee {
    String firstName,lastName;
    public Employee(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public static void main(String args[])
    {
        CredentialService Services = new CredentialService();
        Services.generateEmailAddress();
        Services.generatePassword();
        Services.showCredentials();


    }
}
