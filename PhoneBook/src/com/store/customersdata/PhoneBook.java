package com.store.customersdata;

import java.util.Scanner;

public class PhoneBook {
    public static void  main (String[] args){
        int noofrow = 10;
        int rowno = 0;
        String userInput="";
        String nameaddress[][] = new String[noofrow][2];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(".......Select a Number.......");
            System.out.println("1. Add a Number to Phonebook");
            System.out.println("2. Print Phonebook");
            System.out.println("3. Exit");
            userInput = scanner.nextLine();
            if (userInput.equals("1")){
                System.out.println("Enter the Name:");
                nameaddress[rowno][0] = scanner.nextLine();
                System.out.println("Enter the PhoneNumber:");
                nameaddress[rowno][1] = scanner.nextLine();
                rowno++;
            } else if (userInput.equals("2")) {
                for (int k = 0; k < rowno; k++) {
                    System.out.println(nameaddress[k][0]+"\t"+"\t"+nameaddress[k][1]);
                }
            } else if (!userInput.equals("1")&&!userInput.equals("2")) {
                System.exit(0);
            }

        }while (!userInput.equals("3"));

    }
}
