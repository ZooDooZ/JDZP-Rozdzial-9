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
//        char mostFrequent = ' ';
//        int counter1 = 0;
//        int counter2 = 0;
//        char[] array = str.toCharArray();
//        for(int i = 0;i< array.length;i++){
//            for(int y = 1;y < array.length;y++){
//                if(array[i] == array[y]){
//                    counter1++;
//                }
//            }
//            if(counter1 > counter2){
//                counter2 = counter1;
//                mostFrequent = array[i];
//            }
//        }
//        System.out.println(mostFrequent);
//        return mostFrequent;
//    }

    //DO POPRAWY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static void replaceSubstring(String string1, String string2, String string3){
//        String correctoWord = " ";
//        String[] array = string1.split(" ");
//        for(int i = 0; i < string1.split(" ").length; i++){
//            if(array[i].equalsIgnoreCase(string2)){
//                StringBuilder stringBuilder = new StringBuilder(array[i]);
//                stringBuilder.replace(array[i].indexOf(string2),array[i].length(),string3);
//            }
//            System.out.println(array[i]);
//        }
//    }
}