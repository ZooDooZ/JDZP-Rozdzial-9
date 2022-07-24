package org.zoodooz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz dowolną serię liczb rozdzielonych przecinkami a ja podam Ci ich sume: ");

        String str = keyboard.nextLine();

        Numbers numbers = new Numbers(str);
        System.out.println("Suma podanych liczb to: " + numbers.getSumNumbers());

    }
}