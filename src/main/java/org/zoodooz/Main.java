package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboar = new Scanner(System.in);
        System.out.println("Napisz zdanie a ja przekrzształce go w alfabet morsa(bez polskich znaków): ");
        String sentence = keyboar.nextLine();

        Translator translator = new Translator();

        sentence = sentence.toUpperCase();
        translator.morseTranslator(sentence);
    }
}