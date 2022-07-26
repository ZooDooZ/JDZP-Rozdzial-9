package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("SalesData.txt");
        Scanner scanner  = new Scanner(file);

        double totalSum = 0;

        int counter = 0;

        double lowest = Integer.MAX_VALUE;
        int numberLowestWeek = 0;
        int lowFlag = 0;

        double highest = Integer.MIN_VALUE;
        int numberHighestWeek = 0;
        int highFlag = 0;


        while(scanner.hasNext()){
            counter++;
            lowFlag++;
            highFlag++;
            String str = scanner.nextLine();
            List<String> strings = Arrays.asList(str.split(","));
            List<Double> doubles = new ArrayList<>();
            for(String s : strings){
                doubles.add(Double.parseDouble(s));
            }
            SalesAnalyzer salesAnalyzer = new SalesAnalyzer(doubles);
            System.out.printf("Lączna wartość sprzedaży z tygodnia nr " + counter + " wynosi: %.2f złotych.\n",
                    salesAnalyzer.getSum());
            System.out.printf("Średnia dzienna wartość sprzedaży z każdego tygodnia nr " + counter +
                    " wynosi: %.2f złotych.\n", salesAnalyzer.getAvgSaleEachDay());
            totalSum += salesAnalyzer.getAllTotalSum();

            for(int i = 0; i < doubles.size();i++){
                if(doubles.get(i) < lowest){
                    lowest = doubles.get(i);
                    numberLowestWeek = lowFlag;
                }
            }

            for(int i = 0; i < doubles.size(); i++){
                if(doubles.get(i) > highest){
                    highest = doubles.get(i);
                    numberHighestWeek = highFlag;
                }
            }

        }
        System.out.printf("Lączna wartość sprzedaży ze wszystkich tygodni wynosi: %.2f złotych.\n",totalSum);
        System.out.printf("Średnia tygodniowa wartość sprzedaży wynosi: %.2f złotych.\n",(totalSum/counter));
        System.out.println("Numer tygodnia z najwyższą wartością sprzedaży jest tydzień nr: " + numberHighestWeek);
        System.out.println("Numer tygodnia z najnizszą wartością sprzedaży jest tydzień nr: " + numberLowestWeek);




    }
}