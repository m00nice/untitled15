package com.company;

import java.util.ArrayList;

public class Bibliotek {

    public ArrayList<Bog> hylde = new ArrayList<>();

    public boolean DoesHyldeContain(Bog bogS){
        boolean contains = false;
        for(Bog bog : hylde) {
            if (bogS.getISBNnummer() == bog.getISBNnummer()){
                contains = true;
            }
        }


        return contains;
    }


}
