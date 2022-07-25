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
        int numberLowestWeek = 0;
        int numberHighestWeek = 0;

        while(scanner.hasNext()){
            counter++;
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

            numberHighestWeek = SalesAnalyzer.getNumberWithHighestWeek();
            numberLowestWeek = SalesAnalyzer.getNumberWithLowestWeek(doubles);
        }
        System.out.printf("Lączna wartość sprzedaży ze wszystkich tygodni wynosi: %.2f złotych.\n",totalSum);
        System.out.printf("Średnia tygodniowa wartość sprzedaży wynosi: %.2f złotych.\n",(totalSum/counter));
        System.out.println("Numer tygodnia z najwyższa wartościa sprzedaży jest tydzień nr: " + numberHighestWeek);
        System.out.println("Numer tygodnia z najnizszą wartościa sprzedaży jest tydzień nr: " + numberLowestWeek);




    }
}