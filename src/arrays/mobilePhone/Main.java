package arrays.mobilePhone;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("121 24 42");

    public static void main(String[] args) {

        startPhone();
        printActions();

        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
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
                    printActions();
                    break;
            }
        }
    }
    private static void addContact() {
        System.out.print("Enter name for a new contact:");
        String name  = scanner.nextLine();
        System.out.print("Enter phone number:");
        String number = scanner.nextLine();
        Contact contact =  Contact.createContact(name,number);
        if (phone.addNewContact(contact)) {
            System.out.println("Contact added: Name " + name + " Phone " + number + ".");
        } else
            System.out.println("Contact is already in the list");
    }

    private static void updateContact() {
        System.out.print("Enter existing contact name:");
        String oldName = scanner.nextLine();
        Contact existingContact = phone.queryContact(oldName);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return; // just exiting the method
        }
        System.out.print("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (phone.updateContact(existingContact, newContact)) {
            System.out.println("The contact " +  existingContact.getName() +
                    " has been replaced with " + newContact.getName() + ".");
        } else
            System.out.println("Error updating record");
    }

    private static void removeContact() {
        System.out.print("Enter contact name to remove:\n");
        String oldName = scanner.nextLine();
        Contact contact = phone.queryContact(oldName);
        if (contact == null) {
            System.out.print("Contact not found.\n");
            return; // just exiting the method
        }
        if (phone.removeContact(contact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter contact name to query:");
        String oldName = scanner.nextLine();
        Contact contact = phone.queryContact(oldName);
        if (contact == null) {
            System.out.println("Contact not found.");
            return; // just exiting the method
        }
        System.out.println("The contact name " +  contact.getName() +
                " number " + contact.getNumber() + ".");
    }


    private static void startPhone() {
        System.out.println("Phone is starting...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing  contact\n" +
                "5 - to query if the contact exist\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void printContacts() {
        phone.printContacts();
    }

}
