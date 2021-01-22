package arrays.mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact (Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact (String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact (Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            this.myContacts.set(index,newContact);
            System.out.println(oldContact.getName() + " was replaced with a new one " + newContact.getName());
            return true;
        } else if (findContact(newContact.getName()) != (-1)) {
            System.out.println("The contact " + newContact.getName() + " already exists. Update was not successful");
            return false;
        }
        System.out.println(oldContact.getName() + " was not found");
        return false;
    }

    private String queryContact (Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact (String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            return this.myContacts.get(index);
        }
        return null;
    }

    public boolean removeContact (Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            this.myContacts.remove(index);
            System.out.println("The contact " + contact.getName() + " was removed");
            return true;
        }
        System.out.println(contact.getName() + " was not found");
        return false;
    }

    public void printContacts() {
        if(!myContacts.isEmpty()){
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName() + "   " + this.myContacts.get(i).getNumber());
        }
    } else
            System.out.println("The contacts list is empty");
    }

}
