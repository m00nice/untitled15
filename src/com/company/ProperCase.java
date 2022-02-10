package com.company;


import java.util.Locale;

public class ProperCase {


    public String ProperCaseMaker(String sætning){
        StringBuilder nySætning = new StringBuilder();
        String[] split = sætning.split(" ");

        for(String word : split){
            String word2 = word.toUpperCase();
            if(word.equals(word2)){
                nySætning.append(word).append(" ");
            }else{
                String word3 = word.toLowerCase();
                if (word.length() > 3) {
                    String word4 = word3.replace(word3.substring(0,1),word3.substring(0,1).toUpperCase());
                    nySætning.append(word4).append(" ");
                } else{
                    nySætning.append(word3).append(" ");
                }
            }
        }



        return nySætning.toString();
    }
}
