package org.zoodooz;

import java.util.List;

public class SalesAnalyzer {

    private static List<Double> amounts;


    public SalesAnalyzer(List<Double> amounts){
        this.amounts = amounts;
    }

    public double getSum(){
        return amounts.stream()
                .reduce(Double::sum)
                .orElse(0d);

    }
    public double getAvgSaleEachDay(){
        double sale = 0;
        for (int i = 0; i < amounts.size(); i++){
            sale += amounts.get(i);
        }

        return sale / amounts.size();
    }

    public double getAllTotalSum(){
        double total = 0;
            for(int i =0;i< amounts.size();i++){
                total += amounts.get(i);
            }
        return total;
    }

}
