package main;

public class Samochod {
    private int rok;
    private int drzwi;

    public Samochod(int rok, int drzwi) {
        this.rok = rok;
        this.drzwi = drzwi;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(int drzwi) {
        this.drzwi = drzwi;
    }
}
