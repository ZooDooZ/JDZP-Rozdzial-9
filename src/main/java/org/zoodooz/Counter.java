package org.zoodooz;

import java.util.Scanner;

public class Counter {

    private Scanner openFile;


    public Counter(Scanner openFile){
        this.openFile = openFile;
    }

    public String getFile(){
        String lines = "";
        if(openFile.hasNext()) {
            lines = lines.concat(openFile.nextLine());
        }
        return lines;
    }

    public int getNumberOfWords(){
        char[] array;
        int numberOfWords = 0;

        array = getFile().toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (Character.isSpaceChar(array[i])){
                numberOfWords++;
            }
        }
        return numberOfWords+1;
    }
}