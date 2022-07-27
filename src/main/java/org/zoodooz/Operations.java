package org.zoodooz;

public class Operations {

    public static int wordCount(String str){
        int numberOfWords = 1;

        char[] array = str.toCharArray();
        for(int i = 0; i<array.length;i++){
            if(Character.isSpaceChar(array[i])){
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    public static String arrayToString(char[] array){
        String str = "";
        for(int i=0;i< array.length;i++){
            str += String.valueOf(array[i]);
        }
        return str;
    }

    //DO POPRAWY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static char mostFrequent (String str){
//        int counter = 0;
//        int numberOfCounts = 0;
//        char mostFrequent = ' ';
//        char[] array = str.toCharArray();
//
//        for (int i = 0; i < array.length;i++) {
//            for (int y = 0; y < array.length; y++) {
//                if (array[i] == array[y]) {
//                    counter++;
//                }
//            }
//            if(counter > numberOfCounts){
//                numberOfCounts = counter;
//                mostFrequent = array[i];
//            }
//        }
//        return mostFrequent;
//    }

    //DO POPRAWY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static String replaceSubstring(String string1, String string2, String string3) {
//        String correctWord = " ";
//        String[] array = string1.split(" ");
//        for (int i = 0; i < string1.split(" ").length; i++) {
//            if (array[i].equalsIgnoreCase(string2)) {
//                StringBuilder stringBuilder = new StringBuilder(array[i]);
//                stringBuilder.replace(array[i].indexOf(string2), array[i].length(), string3);
//                correctWord = stringBuilder.toString();
//            }
//
//        }
//        return correctWord;
    }
}