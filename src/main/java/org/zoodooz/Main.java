package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.setName("Hurkacz, Renata");
        phoneBook.setName("Jurczyk, Julia");
        phoneBook.setName("Szewczyk, Waldemar");
        phoneBook.setName("Szewczyk, Bartosz");
        phoneBook.setName("Sokołowski, Filip");
        phoneBook.setPhone("555-312-642");
        phoneBook.setPhone("555-253-122");
        phoneBook.setPhone("555-128-940");
        phoneBook.setPhone("555-420-851");
        phoneBook.setPhone("555-430-904");

        System.out.println("Wpisz szukane nazwisko: ");
        String search = keyboard.nextLine();
        phoneBook.searchName(search);

    }
}