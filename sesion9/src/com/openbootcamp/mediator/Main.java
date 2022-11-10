package com.openbootcamp.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorConcrete();

        Colleague colleague1 = new ColleagueConcreteOne();
        Colleague colleague2 = new ColleagueConcreteTwo();
        Colleague colleague3 = new ColleagueConcreteThree();

        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);

        colleague1.send();
        colleague2.send();
        colleague3.send();
    }
}
