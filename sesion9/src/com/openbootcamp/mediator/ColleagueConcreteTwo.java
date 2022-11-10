package com.openbootcamp.mediator;

public class ColleagueConcreteTwo extends Colleague{


    @Override
    void receive() {
        System.out.println("I have received a message, I am ColleagueConcreteTwo");
    }

    @Override
    void send() {
        System.out.println("I am ColleagueConcreteTwo");
        mediator.resent(this);
    }
}
