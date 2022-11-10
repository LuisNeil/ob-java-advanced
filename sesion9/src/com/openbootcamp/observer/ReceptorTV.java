package com.openbootcamp.observer;

public class ReceptorTV implements Receptor{
    @Override
    public void receive() {
        System.out.println("Sign received in TV");
    }
}
