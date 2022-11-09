package com.openbootcamp.sesion8.decorator;

public class TelephoneNextGen extends TelephoneDecorator{
    public TelephoneNextGen(Telephone telephone) {
        super(telephone);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Extra characteristics: ");
        this.have4g();
        this.have5g();
        this.samrtScreeen();
    }

    private void samrtScreeen() {
        System.out.println(" -> I have smart screen");
    }

    private void have5g() {
        System.out.println(" -> I have 5g");
    }

    private void have4g() {
        System.out.println(" -> I have 4g");
    }
}
