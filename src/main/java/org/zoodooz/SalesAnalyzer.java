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

    public static int getNumberWithHighestWeek(){
        int highest = 0;
        int counter = 0;
        for(int i = 0;i<amounts.size();i++){
            counter++;
            if(amounts.get(i) > highest){
                if(counter >= 0 && counter < 7){
                    highest = 1;
                } else if (counter >= 7 && counter < 14){
                    highest = 2;
                } else if (counter >= 14 && counter <21){
                    highest = 3;
                }
            }
        }
        return highest;
    }

    public static int getNumberWithLowestWeek(){
        int flag = Integer.MAX_VALUE;
        int week = 0;
        int counter = 0;
        for(int i = 0; i < amounts.size();i++){
            counter++;
            if(amounts.get(i) < flag){
                if(counter >= 0 && counter < 7){
                    week = 1;
                } else if (counter >= 7 && counter < 14){
                    week = 2;
                } else if (counter >= 14 && counter < 21){
                    week = 3;
                }
            }
        }
        return week;
    }



}
