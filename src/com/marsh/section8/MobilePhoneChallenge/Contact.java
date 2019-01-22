package com.marsh.section8.MobilePhoneChallenge;

public class Contact {

    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static Contact createContact(String name, int number){
        return new Contact(name, number);
    }

    public static class createContact extends Contact {
        public createContact(String name, int phone) {
            super();
        }
    }
}
