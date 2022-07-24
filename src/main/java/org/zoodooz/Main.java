package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz dowolony łańcuch znaków: ");
        String sentence = keyboard.nextLine();

        String choose;
        do {
            Test test = new Test(sentence);
            System.out.println("MENU - wybierz opcje:");
            System.out.println("a. zliczanie samogłosek w łańcuchu znaków");
            System.out.println("b. zliczanie spółgłosek w łańcuchu znaków");
            System.out.println("c. zliczanie sumy samogłosek i spółgłosek");
            System.out.println("d. wprowadzanie następnego łańcucha znaków");
            System.out.println("e. zakończenie pracy programu");
            choose = keyboard.nextLine();
            if(choose.equalsIgnoreCase("a")){
                System.out.println("W podanym łańcuchu znaków jest " + test.counterVowels() + " samogłosek.");
            } else if(choose.equalsIgnoreCase("b")){
                System.out.println("W podanym łańcuchu znaków jest " + test.counterConsonant() + " spółgłosek.");
            } else if(choose.equalsIgnoreCase("c")){
                System.out.println("Suma samogłosek i spółgłosek w podanym łańcuchu to: " + (test.counterVowels() + test.counterConsonant()));
            } else if(choose.equalsIgnoreCase("d")){
                System.out.println("Wpisz dowolony łańcuch znaków: ");
                sentence = keyboard.nextLine();
            }
        }while(!(choose.equalsIgnoreCase("e")));
    }
}