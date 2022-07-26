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

        int numberOfWordsPerLine = 0;
        int totalNumberOfWords = 0;
        int counter = 0;

        while(openFile.hasNext()){
            counter++;
            numberOfWordsPerLine = 0;
            String str = openFile.nextLine();
            char[] array = str.toCharArray();
            for(int i = 0; i < array.length; i++) {
                if (Character.isSpaceChar(array[i])){
                    numberOfWordsPerLine++;
                }
            }
            totalNumberOfWords += numberOfWordsPerLine;
        }

        System.out.println("Liczba słów w podanym pliku wynosi: " + (totalNumberOfWords + counter));

    }
}