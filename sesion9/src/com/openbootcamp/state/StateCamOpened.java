package com.openbootcamp.state;

public class StateCamOpened extends State{

    public StateCamOpened(Phone phone) {
        super(phone);
    }

    @Override
    public String unblock() {
        return "The mobile is already unblocked";
    }

    @Override
    public String openCam() {
        return "The cam is already opened";
    }

    @Override
    public String takePic() {
//        phone.changeState(new StateBlocked(phone));
        return "The pic has been taken";
    }
}
