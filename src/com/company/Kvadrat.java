package com.company;

public class Kvadrat {

    public String kvadratMaker(int tal){
        String KVADRATEN="";
        for (int j=0;j < tal;j++) {
            for (int i = 0; i < tal; i++) {
                KVADRATEN = KVADRATEN + "*  ";
            }
            KVADRATEN = KVADRATEN+"\n";
        }


        return KVADRATEN+"     "+tal;
    }

}
