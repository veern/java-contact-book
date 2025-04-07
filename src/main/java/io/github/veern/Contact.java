package io.github.veern;

import java.util.ArrayList;

public class Contact {

    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;

    public Contact(String fN, String lN, int pH, String eM){
        this.firstName = fN;
        this.lastName = lN;
        this.phoneNumber = pH;
        this.email = eM;
    }

    public static int add(ArrayList<Contact> listOfContacts, Contact contact){
        listOfContacts.add(contact);
        return 0;
    }

    public static Contact remove(ArrayList<Contact> listOfContacts, Contact contact){
        if (listOfContacts.contains(contact)){
            listOfContacts.remove(contact);
            System.out.println("Contact deleted.");
        }
        else {
            System.out.println("No such contact found.");
        }
        return contact;
    }

    public static Contact find(ArrayList<Contact> listOfContacts, Contact contact){
        return contact;
    }
}
