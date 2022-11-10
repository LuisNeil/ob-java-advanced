package com.openbootcamp.observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisor.addReceptor(tv).addReceptor(radio).addReceptor(satelite);

        emisor.emit();
    }
}
