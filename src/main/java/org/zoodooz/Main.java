package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz dowolone zdanie aby dowiedzieć się ile zawiera słów: ");
        String sentence = keyboard.nextLine();
        System.out.println("W podanym zdaniu jest: " + getNumberOfLetter(sentence) + " słów.");


    }
    static int getNumberOfLetter(String str){
        char[] array;
        int numberOfLetter = 0;

        array = str.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (Character.isWhitespace(array[i])){
                numberOfLetter++;
            }
        }
        return numberOfLetter+1;
    }
}