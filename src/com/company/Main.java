package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1. Opgave
        ArraylistOPG arraylistOPG = new ArraylistOPG();
         ArrayList<String> ArrayList = new ArrayList<>();
         String bruh = "bruh";
         //ArrayList.add(bruh);
        System.out.println(arraylistOPG.doesArrayListContainString(ArrayList,bruh));


//2. Opgave
        Bibliotek bibliotek = new Bibliotek();
        Bog bog1 = new Bog(123,"bruh",1719);
        Bog bog2 = new Bog(321,"bluh",1669);
        Bog bog3 = new Bog(231,"bkuh",1042);
        Bog bog4 = new Bog(123,"bruher",2021);
        bibliotek.hylde.add(bog1);
        bibliotek.hylde.add(bog2);
        bibliotek.hylde.add(bog3);


        System.out.println(bibliotek.DoesHyldeContain(bog4));

//3. Opgave
        Græs græs = new Græs();

        System.out.println(græs.dageTilKlip(1,10));

//4. Opgave
        Kvadrat kvadrat = new Kvadrat();
        System.out.println(kvadrat.kvadratMaker(6));


//5. Opgave
        ProperCase properCase = new ProperCase();
        String sentence = "hundenW HUND RaR";
        //Virker ikke ¯\_(ツ)_/¯
        System.out.println(properCase.ProperCaseMaker(sentence));

//6. Opgave

        Sortering sortering = new Sortering();
        sortering.words.add("abekat");
        sortering.words.add("musefælde");
        sortering.words.add("ananas");
        sortering.words.add("slut");
        sortering.words.add("solskin");

        System.out.println(sortering.sortering());



//7. Opgave

        Søgning søgning = new Søgning();
        String[] arrayStrings = {"bobby","john","knud"};
        System.out.println(søgning.search(arrayStrings,"bob"));

    }
}
