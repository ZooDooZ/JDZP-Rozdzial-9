package org.zoodooz;

public class Numbers {

    private int bigNumber;
    private int smallNumber;
    private int sum;

    public Numbers(String str){
        int sum = 0;
        int smallNumber = 10;
        int bigNumber = 0;
        char[] array = str.toCharArray();
        for(char s : array) {
            sum += Character.getNumericValue(s);
            if(Character.getNumericValue(s) > bigNumber){
                bigNumber = Character.getNumericValue(s);
            }
            if(Character.getNumericValue(s) < smallNumber){
                smallNumber = Character.getNumericValue(s);
            }
        }
        this.bigNumber = bigNumber;
        this.smallNumber = smallNumber;
        this.sum = sum;
    }

    public void showNumbers(){

        System.out.println("Największa liczba to: " + bigNumber);
        System.out.println("Najmniejsza liczba to: " + smallNumber);
        System.out.println("Suma licz: " + sum);

    }
}

