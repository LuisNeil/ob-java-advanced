package com.openbootcamp.state;

public class Main {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone();

        System.out.println(p1.state.unblock());
        System.out.println(p1.state.openCam());
        System.out.println(p1.state.takePic());

    }
}
