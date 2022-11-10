package com.openbootcamp.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorConcrete extends Mediator{

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    void resent(Colleague colleague) {
        for(Colleague actual: colleagues){
            if(!actual.equals(colleague)){
                actual.receive();
            }
        }
    }
}
