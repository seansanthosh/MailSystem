package com.greatlearning.service;

import com.greatlearning.main.Employee;
import java.util.*;
import java.lang.*;


    public class CredentialService {
    String email,str1,str2,password="";
//    char[] password = new char[8];
    public void generatePassword()
    {
     String alph1 = "QWERTYUIOPASDFGHJKLZXCVBNM";
     String alph2 = "qwertyuiopasdfghjklzxcvbnm";
     String alph3 = "@#$%^&*(){}[]:;'?/>.<,'";
     String alph4 = "0123456789";
     Random random = new Random();
     for(int i=0;i<2;i++) { //running two times to generate 8 digit password
         int val1 = random.nextInt(alph1.length());
         int val2 = random.nextInt(alph2.length());
         int val3 = random.nextInt(alph3.length());
         int val4 = random.nextInt(alph4.length());
         password += ""+alph1.charAt(val1)+alph2.charAt(val2)+alph3.charAt(val3)+alph4.charAt(val4);

     }
    }
    public void generateEmailAddress(){
        String department=" ";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter enter first name");
        str1= sc.nextLine();
        System.out.println("Enter enter last name");
        str2= sc.nextLine();
        Employee employee = new Employee(str1,str2);
        System.out.println("Please enter the department from the following");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resources");
        System.out.println("4.Legal");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 : department="tech";break;
            case 2 : department="admin";break;
            case 3 : department="humanresorces";break;
            case 4 : department="legal";break;
            default: System.out.println("Enter a valid option");
        }
        email=str1+str2+"@"+department+".abc.com";

    }
    public void showCredentials(){
        System.out.println("Dear "+str1+" your generated credentials are as follows\n" +
                "\n" +
                "Email --->"+ email+"\n"+
                "\n" +
                "Password --->"+ password);

    }
}
