package main;

public enum Samochody {

    OPEL_CORSA(2012, 5),
    BMV_M8(2018, 3),
    AUDI_R8(2020, 3),
    VW_BORA(2002, 5);

    private  int rok;
    private int ilDrzwi;

    Samochody(int rok, int ilDrzwi) {
        this.rok = rok;
        this.ilDrzwi = ilDrzwi;
    }

    @Override
    public String toString() {
        return super.toString() + " rok = " + rok + ", ilość drzwi = " + ilDrzwi;
    }

    public int getRok() {
        return rok;
    }

    public int getIlDrzwi() {
        return ilDrzwi;
    }
}
