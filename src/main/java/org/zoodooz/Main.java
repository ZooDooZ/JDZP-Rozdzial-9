package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Zapisz zdanie w którym wszystkie słowa są ze sobą połączone ale " +
                "pierwszy litera każdego z tych słów jest wielka:");
        String sentence = keyboard.nextLine();

        Separator separator = new Separator(sentence);
        separator.separateWord();
    }
}