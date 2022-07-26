package org.zoodooz;

public class Main {
    public static void main(String[] args) {
        
            //#1
            String str = "Napisz klasę zawierającą następujące metody statyczne";
            System.out.println("Liczba słów znajdująca sie w obiekcie wynosi: " + Operations.wordCount(str));
            //#2
            char[] array = {'F','i','l','i','p'};
            System.out.println("Metoda zwraca znaki z tablicy w formie łańcucha znaków: " + Operations.arrayToString(array));
            //#3
//        String str1 = "Siemanko, co u Ciebie?";
//        Operations.mostFrequent(str1);
            //#4
//            String string1 = "dwa psy i dwa koty";
//            String string2 = "dwa";
//            String string3 = "cztery";
//
//            Operations.replaceSubstring(string1, string2, string3);
    }
}