package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Søgning {


    public int search(String[] Strings, String word) {
        int result = -1;

            if (Arrays.asList(Strings).contains(word)) {
                result = Arrays.asList(Strings).indexOf(word);

            }

            return result;
    }
    public int searchExept(String[] Strings, String word) {
        try {
            return Arrays.asList(Strings).indexOf(word);
        } catch (Exception e){
            System.out.println("Stringet findes ikke i arrayet");
        }
        return 42;
    }
}
