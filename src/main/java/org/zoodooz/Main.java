package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku (po nazwie dodaj .txt):");
        String name = keyboard.nextLine();

        File file = new File(name);
        Scanner openFile = new Scanner(file);

        Counter counter = new Counter(openFile);


        System.out.println("Liczba słów w podanym pliku wynosi: " + counter.getNumberOfWords());

    }
}