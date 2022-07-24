package org.zoodooz;

public class Numbers {

    private String numb;

    public Numbers(String numb){
        this.numb = numb;
    }

    public int getSumNumbers(){
        int sum = 0;
        String[] tokens = numb.split(",");
        for(String s:tokens){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
