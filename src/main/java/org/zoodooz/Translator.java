package org.zoodooz;

import java.util.Locale;

public class Translator {

    public String swineLatinTranslator(String sentence){
        sentence = sentence.replace(".","").toLowerCase();
        String[] tokens = sentence.split(" ");
        String translator = "";
        for (int i = 0; i < tokens.length; i++){
            StringBuilder stringBuilder = new StringBuilder(tokens[i]);
            stringBuilder.append(tokens[i].charAt(0));
            stringBuilder.append("ay");
            stringBuilder.deleteCharAt(0);
            tokens[i] = stringBuilder.toString();
        }
        tokens[0] = tokens[0].replace(tokens[0].charAt(0), Character.toUpperCase(tokens[0].charAt(0)));
        tokens[tokens.length-1] = tokens[tokens.length-1].concat(".");
        for(String s : tokens){
            translator += s + " ";
        }
        return translator;
    }
}
