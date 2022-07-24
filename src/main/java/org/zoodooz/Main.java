package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wyraz który chcesz zobaczyć od tyłu: ");
        String word = keyboard.nextLine();
        reverseWord(word);

    }
    static String reverseWord(String word) {

        char[] array = word.toCharArray();
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1]);
        }
        return String.valueOf(array);
    }
}