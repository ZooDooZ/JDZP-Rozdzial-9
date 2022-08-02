package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculation {

    private ArrayList<String> arrayList = new ArrayList<>();
    private double lowestPrice;
    private double highestPrice;

    int counter = 0;

    public Calculation() throws FileNotFoundException {
        File file = new File("GasPrices.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String[] tokens = scanner.nextLine().split("[-:]");
            for (int i = 0; i < tokens.length; i++){
                arrayList.add(i,tokens[i]);
            }
        }
    }

    public double getAvgYearPrice(int year){
        String str = String.valueOf(year);
        double avgYearPrice = 0;
        int counter = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).equals(str)){
                counter++;
                avgYearPrice += Double.parseDouble(arrayList.get(i+1));
            }
        }
        avgYearPrice = avgYearPrice /counter;
        return avgYearPrice;
    }

    public double getAvgMonthPrice(int month){
        double avgMonthPrice = 0;
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i+=4){
            if(Integer.parseInt(arrayList.get(i)) == month){
                counter++;
                avgMonthPrice += Double.parseDouble(arrayList.get(i+3));
            }
        }
        avgMonthPrice = avgMonthPrice/counter;
        return avgMonthPrice;
    }

    public void getLowestPricePerYear(int year){
        String str = String.valueOf(year);
        lowestPrice = Double.MAX_VALUE;
        String data = "";
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).equals(str)){
                if(Double.parseDouble(arrayList.get(i+1)) < lowestPrice){
                    lowestPrice = Double.parseDouble(arrayList.get(i+1));
                    data = arrayList.get(i-2) + " " + arrayList.get(i-1) +" "+ arrayList.get(i);
                }
            }
        }
        System.out.println(data + "- cena wynosiła: " + lowestPrice + " zł");
    }

    public void getHighestPricePerYear(int year){
        String str = String.valueOf(year);
        highestPrice = Double.MIN_VALUE;
        String data = "";
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).equals(str)){
                if(Double.parseDouble(arrayList.get(i+1)) > highestPrice){
                    highestPrice = Double.parseDouble(arrayList.get(i+1));
                    data = arrayList.get(i-2) + " " + arrayList.get(i-1) +" "+ arrayList.get(i);
                }
            }
        }
        System.out.println(data + "- cena wynosiła: " + highestPrice + " zł");
    }

    public void getPriceFromLowToHigh(){
        ArrayList<Double> arrayD = new ArrayList<>();
        int counter = 0;
        for(int i = 4; i < arrayList.size(); i+=4){
            counter++;
            arrayD.add(counter,Double.parseDouble(arrayList.get(i)));
        }
        for(int i = 0; i<arrayD.size(); i++){
            System.out.println(arrayD.get(i));
        }
    }


}
