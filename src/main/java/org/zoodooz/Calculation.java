package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculation {

    private String[] tokens;
    private ArrayList<Double> petrolNumber = new ArrayList<>();
    int counter = 0;

    public Calculation() throws FileNotFoundException {
        File file = new File("GasPrices.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            tokens = scanner.nextLine().split("[-:]");
            for (int i = 0; i < tokens.length; i++){
                petrolNumber.set(Double.parseDouble(tokens[i]));
            }


        }
    }

    public double getAvgYearPrice(){
        double avgYearPrice = 0;
        for(int i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
        }

        return avgYearPrice;
    }
}
