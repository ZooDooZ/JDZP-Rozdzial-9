package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz dowolone zdanie aby przekształcić je w świńska łacine: ");
        String sentence = keyboard.nextLine();

        Translator translator = new Translator();
        translator.swineLatinTranslator(sentence);


    }
}