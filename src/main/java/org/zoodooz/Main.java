package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz dowoloną serie jednocyfrowych liczb bez żadnego separatora: ");
        String str = keyboard.nextLine();

        Numbers numbers = new Numbers(str);
        numbers.showNumbers();
    }
}