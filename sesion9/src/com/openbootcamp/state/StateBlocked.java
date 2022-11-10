package com.openbootcamp.state;

public class StateBlocked extends State{

    public StateBlocked(Phone phone) {
        super(phone);
    }

    @Override
    public String unblock() {
        phone.changeState(new StateUnblocked(phone));
        return "(Unblock) Mobile unblocked: Proceed";
    }

    @Override
    public String openCam() {
        return "(OpenCam) The cam is blocked. Unblock the mobile";
    }

    @Override
    public String takePic() {
        return "(TakePic) The cam is blocked. Unblock the mobile";
    }
}
