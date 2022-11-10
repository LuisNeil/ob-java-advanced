package com.openbootcamp.mediator;

abstract public class Colleague {

    public Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void receive();
    abstract void send();
}
