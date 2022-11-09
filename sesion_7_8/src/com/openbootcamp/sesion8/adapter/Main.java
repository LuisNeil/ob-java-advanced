package com.openbootcamp.sesion8.adapter;

public class Main {

    public static void main(String[] args) {

        Oven oven = new Oven();
        Lamp lamp = new Lamp();
        EnglishAdapter lightBulb = new EnglishAdapter();

        turnOn(oven);
        turnOn(lamp);
        turnOn(lightBulb);

        System.out.println("The oven has current: " + oven.hasCurrent());
        System.out.println("The lamp has current: " + lamp.hasCurrent());
        System.out.println("The lightbulb has current: " + lightBulb.hasCurrent());

        turnOff(oven);
        turnOff(lamp);
        turnOff(lightBulb);
        System.out.println("=======================");
        System.out.println("The oven has current: " + oven.hasCurrent());
        System.out.println("The lamp has current: " + lamp.hasCurrent());
        System.out.println("The lightbulb has current: " + lightBulb.hasCurrent());
    }

    private static void turnOn(Pluggable pluggable) {
        pluggable.turnOn();
    }

    private static void turnOff(Pluggable pluggable){
        pluggable.turnOff();
    }
}
