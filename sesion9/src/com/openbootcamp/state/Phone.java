package com.openbootcamp.state;

public class Phone {

    public State state;

    public Phone(){
        state = new StateBlocked(this);
    }

    public void changeState(State state){
        System.out.println("Initial State: " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Final State: " + this.state.getClass().getName());

    }

    public State getState(){
        return state;
    }
}
