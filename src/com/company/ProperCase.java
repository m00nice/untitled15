package com.company;



public class ProperCase {


    public String ProperCaseMaker(String sætning){
        String nySætning = "";
        String[] split = sætning.split(" ");

        for(String word : split){
            String word2 = word.toUpperCase();
            if(word.equals(word2)){
                System.out.println("yo");
            }else {
                word.toLowerCase();
                if (word.length() >= 3) {
                    word.substring(0,1).toUpperCase();
                }
            }

            nySætning = nySætning+word+" ";
        }



        return nySætning;
    }
}
