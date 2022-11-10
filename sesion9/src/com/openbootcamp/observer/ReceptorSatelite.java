package com.openbootcamp.observer;

public class ReceptorSatelite implements Receptor{

    @Override
    public void receive() {
        System.out.println("Sign received in satellite");
    }
}
