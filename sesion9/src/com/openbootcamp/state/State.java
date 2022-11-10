package com.openbootcamp.state;

public abstract class State {

    public Phone phone;

    public State(Phone phone){
        this.phone = phone;
    }

    abstract public String unblock();
    abstract public String openCam();
    abstract public String takePic();
}
