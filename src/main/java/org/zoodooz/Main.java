package org.zoodooz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Calculation calculation = new Calculation();

        System.out.println("_________ŚREDNIA CENA BENZYNY W LATACH 1993-2013_________ ");
        for(int i = 0; i < 21; i++){
            System.out.printf("W rok " + (1993+i) + " wynosiła: %.3f zł\n",calculation.getAvgYearPrice(1993+i));
        }
        System.out.println();

        System.out.println("_________ŚREDNIA MIESIECZNA CENA BENZYNY W LATACH 1993-2013_________ ");
        for(int i = 1; i < 13 ;i++){
            System.out.printf("W miesiącu nr: " + i + " wynosiła: %.3f zł\n",calculation.getAvgMonthPrice(i) );
        }
        System.out.println();

        System.out.println("_________NAJNIŻSZA CENA BENZYNY W LATACH 1993-2013_________ ");
        for(int i = 0; i < 21 ;i++){
            calculation.getLowestPricePerYear(1993+i);
        }
        System.out.println();

        System.out.println("_________NAJWYŻSZA CENA BENZYNY W LATACH 1993-2013_________ ");
        for(int i = 0; i < 21 ;i++){
            calculation.getHighestPricePerYear(1993+i);
        }

        calculation.getPriceFromLowToHigh();
    }
}