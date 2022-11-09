package com.openbootcamp.sesion8.decorator;

public class Main {
    public static void main(String[] args) {
        TelephoneClassic classic = new TelephoneClassic();
        classic.create();

        TelephoneSmart smart = new TelephoneSmart(new TelephoneClassic());
        smart.create();

        TelephoneNextGen nextGen = new TelephoneNextGen(new TelephoneSmart(new TelephoneClassic()));
        nextGen.create();

    }
}
