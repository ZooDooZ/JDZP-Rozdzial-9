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

        while(scanner.hasNext()){
            String str = scanner.nextLine();
            List<String> strings = Arrays.asList(str.split(","));
            List<Double> doubles = new ArrayList<>();
            for(String s : strings){
                doubles.add(Double.parseDouble(s));
            }
            SalesAnalyzer salesAnalyzer = new SalesAnalyzer(doubles);
            System.out.printf("Lączna wartość sprzedaży z tygodnia: %.2f złotych.\n" ,salesAnalyzer.getSum());
            System.out.printf("Średnia dzienna wartość sprzedaży z każdego tygodnia: %.2f złotych.\n",
                    salesAnalyzer.avgSaleEachWeek());
            System.out.println();
        }




    }
}