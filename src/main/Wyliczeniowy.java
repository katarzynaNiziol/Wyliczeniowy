package main;

import java.sql.Savepoint;

public class Wyliczeniowy {
    public static void main(String[] args) {
        for (Samochody s : Samochody.values()) {
            System.out.println(s);

        }
        System.out.println("------");
        for (Samochody s : Samochody.values()) {
            System.out.println(s.getRok() + ", " + s.getIlDrzwi());
        }
        System.out.println("------");
        int rok = Samochody.OPEL_CORSA.getRok();
        switch (rok) {
            case 2018:
            System.out.println("------");
            System.out.println("ZAZDROŚCIMY");
            break;
            case 2002:
            System.out.println("Trochę stary.");
            break;
            case 2020:
            System.out.println("Torpeda");
            break;
            case 2012:
            System.out.println("Calkiem, calkiem");
            break;

        }
        System.out.println("------");
        Samochod sam = new Samochod(Samochody.BMV_M8.getRok(), Samochody.AUDI_R8.getIlDrzwi());
        System.out.println(sam.getRok());
        System.out.println(sam.getDrzwi());


    }

}
