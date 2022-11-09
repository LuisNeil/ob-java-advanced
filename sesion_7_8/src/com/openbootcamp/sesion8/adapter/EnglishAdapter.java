package com.openbootcamp.sesion8.adapter;

public class EnglishAdapter implements Pluggable{

    public Lightbulb lightbulb =new Lightbulb();

    @Override
    public void turnOn() {
        lightbulb.turningOn(110);
    }

    @Override
    public void turnOff() {
        lightbulb.turningOff();
    }

    @Override
    public boolean hasCurrent() {
        return lightbulb.isPoweredOn();
    }
}
