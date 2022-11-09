package com.openbootcamp.sesion8.decorator;

public class TelephoneClassic implements Telephone{
    @Override
    public void create() {
        System.out.println("I am a classic telephone. My characteristics are: ");
        this.haveGSM();
        this.haveSMS();

    }

    private void haveGSM(){
        System.out.println(" -> I have GSM");
    }

    private void haveSMS(){
        System.out.println(" -> I have SMS");
    }
}
