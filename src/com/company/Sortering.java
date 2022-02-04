package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Sortering {

    public ArrayList<String> words = new ArrayList<>();

    public String sortering(){
       String list = "";
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        for (String word : words){
            list = list+word+" ";
        }
       return list;
    }


}
