package org.zoodooz;

//DO POPRAWY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Separator {

    private String sentence;

    public Separator(String sentence){
        this.sentence = sentence;
    }

    public String separateWord(){
        char[] array = sentence.toCharArray();
        for(int i = 1; i < array.length;i++) {
            if (Character.isUpperCase(array[i+1])){
                Character.toLowerCase(array[i+1]);
                StringBuilder stringBuilder = new StringBuilder(array.toString());
            }
            System.out.print(array[i]);
        }
        return " ";
    }
}