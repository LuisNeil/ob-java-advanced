package com.openbootcamp.mediator;

public class ColleagueConcreteOne extends Colleague{


    @Override
    void receive() {
        System.out.println("I have received a message, I am ColleagueConcreteOne");
    }

    @Override
    void send() {
        System.out.println("I am ColleagueConcreteOne");
        mediator.resent(this);
    }
}
