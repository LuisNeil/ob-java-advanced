package com.openbootcamp.sesion8.adapter;

public class Lightbulb {

    boolean poweredOn = false;
    int voltage = 0;

    public void turningOn(int voltage){
        this.poweredOn = true;
        this.voltage = voltage;
    }

    public void turningOff(){
        this.poweredOn = false;
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
