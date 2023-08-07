package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int position = findContact(contact.getName());
        if (position >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) == -1) {
            return false;
        } else {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        } else {
            myContacts.remove(findContact(contact));
            return true;
        }
    }

    private int findContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            return -1;
        }
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        if (!myContacts.contains(queryContact(name))) {
            return -1;
        }
        return myContacts.indexOf(queryContact(name));
    }

    public Contact queryContact(String name) {
        Contact queryContact = null;
        for (var contact : myContacts) {
            if (contact.getName().equals(name)) {
                queryContact = contact;
            }
        }
        return queryContact;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            int positionAtList = i + 1;
            System.out.println(positionAtList + ". " + myContacts.get(i).getName() +
                    " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
