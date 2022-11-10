package com.openbootcamp.mediator;

public abstract class Mediator {
    abstract void register(Colleague colleague);
    abstract void resent(Colleague colleague);
}
