package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobile = new MobilePhone();

    public static void main(String[] args) {
        System.out.println("\t1: Add Contact");
        System.out.println("\t2: Modify Contact");
        System.out.println("\t3: Remove Contact");
        System.out.println("\t4: Display All Contacts");
        System.out.println("\t5: Display Contact");
        System.out.println("\t6: Quit");

        mobile.menu();

        scanner.close();
    }
}
