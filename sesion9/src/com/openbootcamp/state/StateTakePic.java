package com.openbootcamp.state;

public class StateTakePic extends State{

    public StateTakePic(Phone phone) {
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
        return "null";
    }
}
