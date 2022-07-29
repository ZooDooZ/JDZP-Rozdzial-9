package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("pbnumbers.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
//            System.out.println(scanner.nextLine());
            String[] tokens = scanner.nextLine().split("");

            for(int i = 0; i < tokens.length; i++){
                System.out.println(tokens[i]);
            }
            System.out.println();
        }

    }
}