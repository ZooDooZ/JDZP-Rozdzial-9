package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Wprowadź 9 cyfrowy numer telefonu w formacie XXX-XXX-XXX: ");
        String phone = keyboard.nextLine();
        Translator translator = new Translator(phone);

        translator.numberChanger();
    }
}