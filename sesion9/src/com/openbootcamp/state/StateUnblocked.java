package com.openbootcamp.state;

public class StateUnblocked extends State{

    public StateUnblocked(Phone phone) {
        super(phone);
    }

    @Override
    public String unblock() {
        return "The mobile is already unblocked";
    }

    @Override
    public String openCam() {
        phone.changeState(new StateCamOpened(phone));
        return "Cam is opened. You can take the pic";
    }

    @Override
    public String takePic() {
        return "Cannot take the pic without opening the cam";
    }
}
