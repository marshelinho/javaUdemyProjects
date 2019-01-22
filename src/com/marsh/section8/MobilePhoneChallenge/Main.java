package com.marsh.section8.MobilePhoneChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printInstructions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available options)");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    public static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.println("Enter new contact phone number: ");
        int newNumber = s.nextInt();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Succesfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Succesfully removed record");
        } else {
            System.out.println("Error removing record");
        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getNumber());
    }

    public static void startPhone(){
        System.out.println("\nStarting phone... ");
    }

    public static void printInstructions(){
        System.out.println("\n available actions: \n press");
        System.out.println("0 - to shutdown\n" +
                           "1 - press to print contacts\n" +
                           "2 - press to add a new contact\n" +
                           "3 - press to update existing contact\n" +
                           "4 - press to remove an existing contact\n" +
                           "5 - query if existing contact exists.");

    }

    public static void printContacts(){
        mobilePhone.printContacts();
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter phone number: ");
        int phone = s.nextInt();

        Contact newContact = new Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name " + name + ", phone " + phone);
        } else {
            System.out.println("Can't add, " + name + " Already on file");
        }

    }
}