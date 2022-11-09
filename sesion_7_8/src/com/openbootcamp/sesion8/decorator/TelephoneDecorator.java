package com.openbootcamp.sesion8.decorator;

public class TelephoneDecorator implements Telephone{

    private final Telephone telephone;

    public TelephoneDecorator(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public void create() {
        this.telephone.create();
    }
}
