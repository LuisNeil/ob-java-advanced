package com.openbootcamp.observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void receive() {
        System.out.println("Sign received in radio");
    }
}
