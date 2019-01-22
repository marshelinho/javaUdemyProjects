package com.marsh.section6.Bank;

public class Main {

    public static void main(String[] args) {
        VipCustomer bob = new VipCustomer();
        System.out.println(bob.getName());

        VipCustomer joe = new VipCustomer("Joe", 25000.0);
        System.out.println(joe.getEmailAddress());

        VipCustomer marsh = new VipCustomer("Marsh", 100.0, "marsh@email.com");
        System.out.println(marsh.getName());


    }
}
