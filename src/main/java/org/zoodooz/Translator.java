package org.zoodooz;

public class Translator {

    public String swineLatinTranslator(String sentence){
        String[] tokens = sentence.split(" ");
        for (int i = 0; i < tokens.length; i++){
            StringBuilder stringBuilder = new StringBuilder(tokens[i]);
//            stringBuilder.insert(tokens.length, tokens[i].charAt(0));
            stringBuilder.append("ay");
//            stringBuilder.deleteCharAt(tokens[i].charAt(0));
//            tokens[i] = stringBuilder.toString();
            System.out.println(stringBuilder);
        }
        return " ";
    }

}
