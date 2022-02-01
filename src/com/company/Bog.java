package com.company;

public class Bog {

    private int ISBNnummer;
    private String titel;
    private int år;

    public Bog(int ISBNnummer, String titel, int år) {
        this.ISBNnummer = ISBNnummer;
        this.titel = titel;
        this.år = år;
    }

    public int getISBNnummer() {
        return ISBNnummer;
    }

    public void setISBNnummer(int ISBNnummer) {
        this.ISBNnummer = ISBNnummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBNnummer=" + ISBNnummer +
                ", titel='" + titel + '\'' +
                ", år=" + år +
                '}';
    }

}
