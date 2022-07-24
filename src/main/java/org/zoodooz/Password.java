package org.zoodooz;

public class Password {

    private String password;

    public Password (String password){
        this.password = password;
    }


    public boolean checkSixLetters(){
        char[] array = password.toCharArray();
        if(array.length >= 6){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBigAndSmall(){
        char[] array = password.toCharArray();
        int smallCounter = 0;
        int bigCounter = 0;
        for(int i =0; i < array.length; i++){
            if(Character.isUpperCase(array[i])){
                bigCounter++;
            } else if (Character.isLowerCase(array[i])){
                smallCounter++;
            }
        }
        if(smallCounter >= 1 && bigCounter >= 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkNumber(){
        int counterNumber = 0;
        char[] array = password.toCharArray();
        for(int i = 0; i< array.length; i++){
            if(Character.isDigit(array[i])){
                counterNumber++;
            }
        }
        if(counterNumber >= 1){
            return true;
        } else {
            return false;
        }
    }
}