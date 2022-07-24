package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keybaord = new Scanner(System.in);
        boolean sixLetters = true;
        boolean bigAndSmall = true;
        boolean number = true;

        do {
            System.out.println("Ustal i wprowadź hasło: ");
            String pass = keybaord.nextLine();

            Password password = new Password(pass);
            sixLetters = password.checkSixLetters();
            bigAndSmall = password.checkBigAndSmall();
            number = password.checkNumber();


            if (sixLetters && bigAndSmall && number) {
                System.out.println("Wprowadzono poprawne hasło.");

            } else {
                System.out.println("Hasło jest niepoprawne. Pamiętaj, że hasło musi zawierać: \n" +
                        "- 6 znaków\n" +
                        "- jedną wielka i jedną mała literę\n" +
                        "- przynajmniej jedną cyfrę");
                System.out.println();
            }
        } while(!(sixLetters && bigAndSmall && number));
    }
}