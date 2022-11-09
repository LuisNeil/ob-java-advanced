package com.openbootcamp.sesion8.adapter;

public class Lamp implements Pluggable{

    boolean on = false;


    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean hasCurrent() {
        return on;
    }
}
