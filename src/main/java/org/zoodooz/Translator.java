package org.zoodooz;

public class Translator {


    public void morseTranslator(String sentence){
        char[] array = sentence.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                System.out.print("Spacja");
            } else if (array[i] == ','){
                System.out.print("--..--");
            } else if (array[i] == '.'){
                System.out.print(".-.-.-");
            } else if (array[i] == '?'){
                System.out.print("..--..");
            } else if (array[i] == '0'){
                System.out.print("-----");
            } else if (array[i] == '1'){
                System.out.print(".----");
            } else if (array[i] == '2'){
                System.out.print("..---");
            } else if (array[i] == '3'){
                System.out.print("...--");
            } else if (array[i] == '4'){
                System.out.print("....-");
            } else if (array[i] == '5'){
                System.out.print(".....");
            } else if (array[i] == '6'){
                System.out.print("-....");
            } else if (array[i] == '7'){
                System.out.print("--...");
            } else if (array[i] == '8'){
                System.out.print("---..");
            } else if (array[i] == '9'){
                System.out.print("----.");
            } else if (array[i] == 'A'){
                System.out.print(".-");
            } else if (array[i] == 'B'){
                System.out.print("-...");
            } else if (array[i] == 'C'){
                System.out.print("-.-.");
            } else if (array[i] == 'D'){
                System.out.print("-..");
            } else if (array[i] == 'E'){
                System.out.print(".");
            } else if (array[i] == 'F'){
                System.out.print("..-.");
            } else if (array[i] == 'G'){
                System.out.print("--.");
            } else if (array[i] == 'H'){
                System.out.print("....");
            } else if (array[i] == 'I'){
                System.out.print("..");
            } else if (array[i] == 'J'){
                System.out.print(".---");
            } else if (array[i] == 'K'){
                System.out.print("-.-");
            } else if (array[i] == 'L'){
                System.out.print(".-..");
            } else if (array[i] == 'M'){
                System.out.print("--");
            } else if (array[i] == 'N'){
                System.out.print("-.");
            } else if (array[i] == 'O'){
                System.out.print("---");
            } else if (array[i] == 'P'){
                System.out.print(".--.");
            } else if (array[i] == 'Q'){
                System.out.print("--.-");
            } else if (array[i] == 'R'){
                System.out.print(".-.");
            } else if (array[i] == 'S'){
                System.out.print("...");
            } else if (array[i] == 'T'){
                System.out.print("-");
            } else if (array[i] == 'U'){
                System.out.print("..-");
            } else if (array[i] == 'V'){
                System.out.print("...-");
            } else if (array[i] == 'W'){
                System.out.print(".--");
            } else if (array[i] == 'X'){
                System.out.print("-..-");
            } else if (array[i] == 'Y'){
                System.out.print("-.--");
            } else if (array[i] == 'Z'){
                System.out.print("--..");
            }
            System.out.print("|");
        }
    }
}
