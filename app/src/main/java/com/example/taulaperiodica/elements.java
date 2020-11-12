package com.example.taulaperiodica;

public class elements {

    String seriequimica;
    String PesAtom;
    String Simbol;
    String número;
    String nom;
    String pes;
    String Link;

    public elements(String sseriequimica, String pesAtom, String Ssimbol, String snúmero, String snom, String spes, String link)
    {
        seriequimica = sseriequimica;
        PesAtom=pesAtom;
        Simbol = Ssimbol;
        número = snúmero;
        nom = snom;
        pes = spes;
        Link =link;
    }


    public String getSeriequimica() {
        return seriequimica;
    }

    public void setSeriequimica(String seriequimica) {
        this.seriequimica = seriequimica;
    }

    public String getPesAtom() {
        return PesAtom;
    }

    public void setPesAtom(String pesAtom) {
        PesAtom = pesAtom;
    }

    public String getSimbol() {
        return Simbol;
    }

    public void setSimbol(String simbol) {
        Simbol = simbol;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPes() {
        return pes;
    }

    public void setPes(String pes) {
        this.pes = pes;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }




}
