package org.zoodooz;

public class Test {

    private String str;

    public Test(String str) {
        this.str = str;
    }

    //samogłoska
    public int counterVowels(){
        int counterVowels = 0;
        str.toLowerCase();
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'a' || array[i] == 'e' || array[i] == 'i'|| array[i] == 'o'|| array[i] == 'u'|| array[i] == 'y'){
                counterVowels++;
            }
        }
        return counterVowels;
    }
    //spółgłoska
    public int counterConsonant(){
        int counterConsonant = 0;
        str.toLowerCase();
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u' && array[i] != 'y'
                    && array[i] != ' ' && array[i] != '.') {
                counterConsonant++;
            }
        }
        return counterConsonant;
    }
}