package com.openbootcamp.sesion8.decorator;

public class TelephoneSmart extends TelephoneDecorator{
    public TelephoneSmart(Telephone telephone) {
        super(telephone);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Extra characteristics: ");
        this.have4g();
    }

    private void have4g() {
        System.out.println(" -> I have 4g");
    }
}
