package com.openbootcamp.mediator;

public class ColleagueConcreteThree extends Colleague{


    @Override
    void receive() {
        System.out.println("I have received a message, I am ColleagueConcreteThree");
    }

    @Override
    void send() {
        System.out.println("I am ColleagueConcreteThree" +
                "");
        mediator.resent(this);
    }
}
