package com.example.oktan.pierwszawandroidzie;

public class Dodawanie {
    private int pierwsza;
    private int druga;
    private int wynik;

    public int wynik (int pierwsza,int druga) {
        wynik=pierwsza+druga;
        return wynik;
    }

    public int getPierwsza() {
        return pierwsza;
    }

    public void setPierwsza(int pierwsza) {
        this.pierwsza = pierwsza;
    }

    public int getDruga() {
        return druga;
    }

    public void setDruga(int druga) {
        this.druga = druga;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }
}
