package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj zdanie z małych liter. Każde zdanie kończ 'kropką' i 'spacją':");
        String sentence = keyboard.nextLine();
        metoda(sentence);

    }
    static String metoda(String str){
        char[] array = str.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for(int i = 0; i< array.length; i++){
            if(array[i] == '.' || array[i] == '?'){
                array[i+2] = Character.toUpperCase(array[i+2]);
            }
            System.out.print(array[i]);
        }
        return String.valueOf(array);
    }
}