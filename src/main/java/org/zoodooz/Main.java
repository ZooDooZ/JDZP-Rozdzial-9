package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("pbnumbers.txt");
        Scanner scanner = new Scanner(file);

        Statistic statistic = new Statistic();

        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(" ");

        }

    }
}