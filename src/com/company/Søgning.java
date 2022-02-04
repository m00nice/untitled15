package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Søgning {



    public int search(String[] Strings, String word){
        int result;
        if(Arrays.asList(Strings).contains(word)){
            result = Arrays.asList(Strings).indexOf(word);;
        }

    return result;
    }
}
