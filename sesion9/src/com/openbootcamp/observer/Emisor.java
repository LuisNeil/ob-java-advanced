package com.openbootcamp.observer;

import java.util.ArrayList;
import java.util.List;

public class Emisor {
    private List<Receptor> receptors = new ArrayList<>();

    public Emisor addReceptor(Receptor receptor){
        this.receptors.add(receptor);
        return this;
    }
    
    public void emit(){
        for (Receptor receptor : receptors) {
            receptor.receive();
        }
    }
}
