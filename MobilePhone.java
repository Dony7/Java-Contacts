package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void menu(){
        boolean active = true;

        while(active) {
            System.out.print("Enter Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    printContacts();
                    break;
                case 5:
                    printContact();
                    break;
                case 6:
                    active = false;
                    break;
                default:
                    active = false;
                    break;
            }
        }
    }

    public void addContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        contacts.add(new Contact(name, number));
    }

    public void modifyContact(){
        System.out.println("Enter Contact name");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                System.out.println("Enter new name");
                name = scanner.nextLine();

                System.out.println("Enter new number");
                String number = scanner.nextLine();
                Contact contact = new Contact(name, number);
                contacts.set(i, contact);
            }
        }
    }

    public void removeContact(){
        System.out.println("Enter Contact name");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                contacts.remove(i);
            }
        }
    }

    public void printContacts(){
        for (int i = 0; i < contacts.size(); i++){
            System.out.println(i+1 + ": \n\t Name: " + contacts.get(i).getName() + "\n\t Number:" + contacts.get(i).getNumber());
        }
    }

    public int findContact(String name){
        return contacts.indexOf(name);
    }

    public void printContact(){
        System.out.print("Enter Contact Name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                System.out.println("Name: " + contacts.get(i).getName() + "\nNumber: " + contacts.get(i).getNumber());

            }
        }
    }
}
