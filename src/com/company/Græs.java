package com.company;

public class Græs {
    private double vækst = 0.8;
    private double højde = 0;
    private double maksHøjde = 10;

    public double dageTilKlip(double højde, double maksHøjde){
        int dageTilKlip = (int) ((maksHøjde - højde)/vækst);

        return dageTilKlip;
    }
}
