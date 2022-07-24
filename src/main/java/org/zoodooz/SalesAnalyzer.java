package org.zoodooz;

import java.util.List;

public class SalesAnalyzer {

    private List<Double> amounts;


    public SalesAnalyzer(List<Double> amounts){
        this.amounts = amounts;
    }

    public double getSum(){
        return amounts.stream()
                .reduce(Double::sum)
                .orElse(0d);

    }
}
